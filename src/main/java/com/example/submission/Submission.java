package com.example.submission;

import com.example.users.Student;

public class Submission {
    private String taskFile;
    private Student owner;

    public Submission(String taskFile, Student owner) {
        this.taskFile = taskFile;
    }

    public Submission() {
    }

    public String getTaskFile() {
        return taskFile;
    }

    public void setTaskFile(String taskFile) {
        this.taskFile = taskFile;
    }


    public Student getOwner() {
        return owner;
    }

    public void setOwner(Student owner) {
        this.owner = owner;
    }
}
