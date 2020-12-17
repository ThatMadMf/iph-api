package com.example.submission;

import com.example.publication.Publication;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SubmissionService {
    private final List<Submission> submissions;

    public SubmissionService() {
        submissions = Arrays.asList(new Submission(Arrays.asList("lab1.txt")), new Submission(Arrays.asList("lab2.txt")));
    }

    public List<Submission> getAll() {
        return submissions;
    }

    public void sendSubmission(Submission submission)
    {

    }
}
