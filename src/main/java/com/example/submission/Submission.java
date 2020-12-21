package com.example.submission;

import com.example.users.Student;

import java.util.ArrayList;

public class Submission {
    private int workId;
    private int studentId;
    private String content;

    public Submission(int workId, int studentId, String content) {
        this.workId = workId;
        this.studentId = studentId;
        this.content = content;
    }

    public int getWorkId() {
        return workId;
    }

    public void setWorkId(int workId) {
        this.workId = workId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
