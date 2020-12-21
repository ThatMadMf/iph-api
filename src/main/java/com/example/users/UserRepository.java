package com.example.users;

public interface UserRepository {
    User getById(int id);

    Teacher getTeacherById(int id);

    Student getStudentById(int id);
}
