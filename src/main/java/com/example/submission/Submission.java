package com.example.submission;

public class Submission {
    private String taskFile;

    public Submission(String taskFile) {
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
}
