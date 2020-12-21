package com.example.submission;

import com.example.users.User;
import com.example.users.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SubmissionService {
    private final ArrayList<Submission> submissions = new ArrayList<>();

    public SubmissionService() {
        submissions.add(new Submission(1, 1, "lab1.txt"));
        submissions.add(new Submission(2, 2, "lab2.txt"));
    }

    public ArrayList<Submission> getAll() {
        return submissions;
    }

    public List<Submission> sendSubmission(SubmissionsList newSubmissions) {
        submissions.addAll(newSubmissions.getSubmissions());
        return submissions;
    }

    public List<Submission> getByStudentId(int id) {
        return submissions.stream().filter(pub -> pub.getStudentId() == id).collect(Collectors.toList());
    }

    public List<Submission> cancelSubmission(int studentId, int workId) {
        submissions.removeIf(sub -> sub.getStudentId() == studentId && sub.getWorkId() == workId);
        return submissions;
    }
}
