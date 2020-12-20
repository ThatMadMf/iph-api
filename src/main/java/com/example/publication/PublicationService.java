package com.example.publication;

import com.example.users.Group;
import com.example.users.Student;
import com.example.users.Subject;
import com.example.users.Teacher;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PublicationService {
    private final ArrayList<Subject> subjects = new ArrayList<>();
    private final ArrayList<Group> groups = new ArrayList<>();
    private final ArrayList<Student> students = new ArrayList<>();
    private final ArrayList<Teacher> teachers = new ArrayList<>();
    private final ArrayList<Publication> publications = new ArrayList<>();

    public PublicationService() {
        subjects.add(new Subject(1, "Math"));
        subjects.add(new Subject(2, "Web"));
        subjects.add(new Subject(3, "Economy"));
        subjects.add(new Subject(4, "PE"));

        groups.add(new Group(1, "KC-172", new ArrayList<>(Arrays.asList(1, 2, 3))));
        groups.add(new Group(2, "KC-173", new ArrayList<>(Arrays.asList(1, 3, 4))));

        students.add(new Student(1, "Alina", 1));
        students.add(new Student(2, "Maxim", 1));
        students.add(new Student(3, "Vova", 2));

        teachers.add(new Teacher(4, "name1"));
        teachers.add(new Teacher(5, "name2"));

        publications.add(new Work(1, 1,"Lab1", "Need to write something", 4,
                new GregorianCalendar(2017, Calendar.JANUARY , 25)));
        publications.add(new Announcement(2, 1,"Announcement about deadline", "Deadline delayed for 3 days", 5));
        publications.add(new Work(3, 2, "Lab2", "Need to code something", 4));
    }

    public List<Publication> getAll() {
        return publications;
    }

    public Publication getById(int id) {
        return publications.stream().filter(pub -> pub.getId() == id).findFirst().orElse(null);
    }

    public void createNewWork(Work work) {
        publications.add(work);
    }

    public void createNewAnnouncement(Announcement announcement) {
        publications.add(announcement);
    }

    public Publication changeTitle(int id, String title) {
        Publication publication = getById(id);
        publication.setTitle(title);
        return publication;
    }

    public Publication removePublication(int id) {
        Publication publication = getById(id);
        publications.removeIf(pub -> pub.getId() == id);
        return publication;
    }

    public List<ResponseModel> getPublicationsOfStudent(int studentId) {
        return getPublicationsOfGroupSubjects(getSubjectsIds(getGroup(studentId)));
    }

    public int getGroup(int studentId) {
        return Objects.requireNonNull(students.stream().filter(stud -> stud.getId() == studentId).findFirst().orElse(null)).getGroupId();
    }

    public ArrayList<Integer> getSubjectsIds(int groupId) {
        return Objects.requireNonNull(groups.stream().filter(g -> g.getId() == groupId).findFirst().orElse(null)).getSubjects();
    }

    public ArrayList<ResponseModel> getPublicationsOfGroupSubjects(ArrayList<Integer> subjectsIds) {
        ArrayList<ResponseModel> studentsPublications = new ArrayList<>();
        for (Integer subjectsId : subjectsIds) {
            studentsPublications.addAll(getPublicationsOfSubject(subjectsId));
        }
        return studentsPublications;
    }

    public List<ResponseModel> getPublicationsOfSubject(int subjectId) {
        ArrayList<ResponseModel> publicationsOfSubject = new ArrayList<>();
        publications.stream().filter(pub -> pub.getSubjectId() == subjectId)
                .forEach(pub -> publicationsOfSubject
                        .add(new ResponseModel(pub.getId(), getSubjectById(pub.getSubjectId()),
                                pub.getTitle(), pub.getText(), getTeacherById(pub.getAuthorId()))));
        return publicationsOfSubject;
    }

    public Subject getSubjectById(int id) {
        return subjects.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }

    public Teacher getTeacherById(int id) {
        return teachers.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }
}
