package com.example.users;

import com.example.publication.ResponseModel;

public interface UserRepository {
    User getById(int id);
    Teacher getTeacherById(int id);
    Student getStudentById(int id);
}
