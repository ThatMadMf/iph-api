package com.example.submission;

import com.example.users.Student;

import java.util.ArrayList;

public class Submission {
    private int workId;
    private int studentId;
    private ArrayList<String> taskFiles;

    public Submission(int workId, int studentId, ArrayList<String> taskFiles) {
        this.workId = workId;
        this.studentId = studentId;
        this.taskFiles = taskFiles;
    }

    public Submission() {
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

    public ArrayList<String> getTaskFiles() {
        return taskFiles;
    }

    public void setTaskFiles(ArrayList<String> taskFiles) {
        this.taskFiles = taskFiles;
    }
}
