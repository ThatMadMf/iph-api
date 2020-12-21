package com.example.publication;

import com.example.group.GroupRepository;
import com.example.subject.SubjectRepository;
import com.example.users.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PublicationService {
    private final PublicationRepository publicationRepository;
    private final UserRepository userRepository;
    private final SubjectRepository subjectRepository;
    private final GroupRepository groupRepository;

    public PublicationService(PublicationRepository publicationRepository, UserRepository userRepository,
                              SubjectRepository subjectRepository, GroupRepository groupRepository) {
        this.publicationRepository = publicationRepository;
        this.userRepository = userRepository;
        this.subjectRepository = subjectRepository;
        this.groupRepository = groupRepository;
    }

    public ArrayList<ResponseModel> getAll() {
        ArrayList<ResponseModel> allPublications = new ArrayList<>();
        ArrayList<Publication> pubs = publicationRepository.getAll();

        pubs.forEach(pub -> allPublications
                .add(new ResponseModel(
                        pub.getId(),
                        subjectRepository.getSubjectById(pub.getSubjectId()),
                        pub.getTitle(),
                        pub.getText(),
                        userRepository.getById(pub.getAuthorId()),
                        pub.getCreationDate(),
                        pub.getDeadline())
                ));
        return allPublications;
    }

    public ResponseModel getById(int id) {
        Publication pub = publicationRepository.getById(id);
        return new ResponseModel(
                pub.getId(),
                subjectRepository.getSubjectById(pub.getSubjectId()),
                pub.getTitle(),
                pub.getText(),
                userRepository.getById(pub.getAuthorId()),
                pub.getCreationDate(),
                pub.getDeadline()
        );
    }

    public void createNewWork(Work work) {
        publicationRepository.createNewWork(work);
    }

    public void createNewAnnouncement(Announcement announcement) {
        publicationRepository.createNewAnnouncement(announcement);
    }

    public Publication changeTitle(int id, String title) {
        return publicationRepository.changeTitle(id, title);
    }

    public void removePublication(int id) {
        publicationRepository.removePublication(id);
    }

    public List<ResponseModel> getPublicationsOfStudent(int studentId) {
        ArrayList<Integer> subjectsIds = groupRepository.getSubjectIds(
                userRepository.getStudentById(studentId).getGroupId()
        );

        ArrayList<ResponseModel> studentsPublications = new ArrayList<>();
        for (Integer subjectsId : subjectsIds) {
            publicationRepository.getPublicationsOfSubject(subjectsId)
                    .forEach(pub -> studentsPublications.add(new ResponseModel(
                            pub.getId(),
                            subjectRepository.getSubjectById(pub.getSubjectId()),
                            pub.getTitle(),
                            pub.getText(),
                            userRepository.getById(pub.getAuthorId()),
                            pub.getCreationDate(),
                            pub.getDeadline())
                    ));
        }

        return studentsPublications;
    }
}
