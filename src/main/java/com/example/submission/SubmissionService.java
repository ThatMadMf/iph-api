package com.example.submission;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubmissionService {
    private final ArrayList<Submission> submissions;

    public SubmissionService() {
        submissions = new ArrayList<>();
        submissions.add(new Submission("lab1.txt"));
        submissions.add(new Submission("lab2.txt"));
    }

    public List<Submission> getAll() {
        return submissions;
    }

    public void sendSubmission(SubmissionsList newSubmissions) {
        submissions.addAll(newSubmissions.getSubmissions());
    }
}
