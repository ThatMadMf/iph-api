package com.example.users;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;

@Repository
public class UserRepositoryImp implements UserRepository {
    private final ArrayList<User> users = new ArrayList<>(Arrays.asList(
            new Student(1, "Alina", "STUDENT", 1),
            new Student(2, "Maxim", "STUDENT", 1),
            new Student(3, "Vova", "STUDENT", 2),
            new Teacher(4, "name1", "TEACHER","2 lvl", new ArrayList<>(Arrays.asList(1, 2, 3))),
            new Teacher(5, "name2", "TEACHER","1 lvl", new ArrayList<>(Arrays.asList(4)))
    ));

    @Override
    public Teacher getTeacherById(int id) {
        return (Student) users.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }

    @Override
    public Student getStudentById(int id) {
        return (Student) users.stream().filter(s -> s.getId() == id && s.getRole().equals("STUDENT")).findFirst().orElse(null);
    }
}
