package com.example.submission;

import java.util.List;

public class Submission {
    private List<String> taskFiles;

    public Submission(List<String> taskFiles) {
        this.taskFiles = taskFiles;
    }

    public Submission() {
    }

    public List<String> getTaskFile() {
        return taskFiles;
    }

    public void setTaskFile(List<String> taskFiles) {
        this.taskFiles = taskFiles;
    }
}
