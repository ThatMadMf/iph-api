package com.example.submission;

import java.util.ArrayList;
import java.util.List;

public class SubmissionsList {
    private ArrayList<Submission> submissions;

    public SubmissionsList(ArrayList<Submission> submissions) {
        this.submissions = submissions;
    }

    public SubmissionsList() {
    }

    public List<Submission> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(ArrayList<Submission> submissions) {
        this.submissions = submissions;
    }
}
