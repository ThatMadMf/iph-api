package com.example.publication;

import com.example.group.Group;
import com.example.subject.SubjectRepository;
import com.example.subject.SubjectRepositoryImp;
import com.example.subject.SubjectService;
import com.example.users.*;
import com.example.subject.Subject;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PublicationService {
    private PublicationRepository publicationRepository;
    private UserRepository userRepository;
    private SubjectRepository subjectRepository;

    public PublicationService(PublicationRepository publicationRepository, UserRepository userRepository, SubjectRepository subjectRepository) {
        this.publicationRepository = publicationRepository;
        this.userRepository = userRepository;
        this.subjectRepository = subjectRepository;
    }

    public PublicationService() {
    }

    public ArrayList<ResponseModel> getAll() {
        ArrayList<ResponseModel> allPublications = new ArrayList<>();
        ArrayList<Publication> pubs = publicationRepository.getAll();

        pubs.forEach(pub -> allPublications
                .add(new ResponseModel(pub.getId(), subjectRepository.getSubjectById(pub.getSubjectId()),
                        pub.getTitle(), pub.getText(), userRepository.getById(pub.getAuthorId()),
                        pub.getCreationDate(), pub.getDeadline())));
        return allPublications;
    }

    public ResponseModel getById(int id) {
        Publication pub = publicationRepository.getById(id);
        return new ResponseModel(pub.getId(), subjectRepository.getSubjectById(pub.getSubjectId()),
                pub.getTitle(), pub.getText(), userRepository.getById(pub.getAuthorId()),
                pub.getCreationDate(), pub.getDeadline());
    }

//    public ResponseModel getFullPublicationById(int id) {
//        Publication pub = getById(id);
//        return new ResponseModel(pub.getId(), getSubjectById(pub.getSubjectId()),
//                pub.getTitle(), pub.getText(), getTeacherById(pub.getAuthorId()), pub.getCreationDate(), pub.getDeadline());
//    }
//
//    public void createNewWork(Work work) {
//        publications.add(work);
//    }
//
//    public void createNewAnnouncement(Announcement announcement) {
//        publications.add(announcement);
//    }
//
//    public Publication changeTitle(int id, String title) {
//        Publication publication = getById(id);
//        publication.setTitle(title);
//        return publication;
//    }
//
//    public Publication removePublication(int id) {
//        Publication publication = getById(id);
//        publications.removeIf(pub -> pub.getId() == id);
//        return publication;
//    }
//
//    public List<ResponseModel> getPublicationsOfStudent(int studentId) {
//        return getPublicationsOfGroupSubjects(getSubjectsIds(getGroup(studentId)));
//    }
//
//    public int getGroup(int studentId) {
//        return Objects.requireNonNull(students.stream().filter(stud -> stud.getId() == studentId).findFirst().orElse(null)).getGroupId();
//    }
//
//    public ArrayList<Integer> getSubjectsIds(int groupId) {
//        return Objects.requireNonNull(groups.stream().filter(g -> g.getId() == groupId).findFirst().orElse(null)).getSubjects();
//    }
//
//    public ArrayList<ResponseModel> getPublicationsOfGroupSubjects(ArrayList<Integer> subjectsIds) {
//        ArrayList<ResponseModel> studentsPublications = new ArrayList<>();
//        for (Integer subjectsId : subjectsIds) {
//            studentsPublications.addAll(getPublicationsOfSubject(subjectsId));
//        }
//        return studentsPublications;
//    }
//
//    public List<ResponseModel> getPublicationsOfSubject(int subjectId) {
//        ArrayList<ResponseModel> publicationsOfSubject = new ArrayList<>();
//        publications.stream().filter(pub -> pub.getSubjectId() == subjectId)
//                .forEach(pub -> publicationsOfSubject
//                        .add(new ResponseModel(pub.getId(), getSubjectById(pub.getSubjectId()),
//                                pub.getTitle(), pub.getText(), getTeacherById(pub.getAuthorId()), pub.getCreationDate(), pub.getDeadline())));
//        return publicationsOfSubject;
//    }
//
//    public Subject getSubjectById(int id) {
//        return subjects.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
//    }
}


//
//        groups.add(new Group(1, "KC-172", new ArrayList<>(Arrays.asList(1, 2, 3))));
//        groups.add(new Group(2, "KC-173", new ArrayList<>(Arrays.asList(1, 3, 4))));
