package com.example.submission;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SubmissionService {
    private final ArrayList<Submission> submissions = new ArrayList<>();

    public SubmissionService(SubmissionRepository submissionRepository) {

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
