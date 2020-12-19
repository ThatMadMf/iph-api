package com.example.submission;

import com.example.users.User;
import com.example.users.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubmissionService {
    private final ArrayList<Submission> submissions;

    public SubmissionService() {
        Student student1 = new Student("student1");
        submissions = new ArrayList<>();
        submissions.add(new Submission("lab1.txt", student1));
        submissions.add(new Submission("lab2.txt", student1));
    }

    public List<Submission> getAll() {
        return submissions;
    }

    public void sendSubmission(SubmissionsList newSubmissions) {
        submissions.addAll(newSubmissions.getSubmissions());
    }
}
