package com.example.submission;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class SubmissionRepositoryImp implements SubmissionRepository {
    private final ArrayList<Submission> submissions = new ArrayList<>(Arrays.asList(
            new Submission(1, 1, "lab1.txt"),
            new Submission(2, 2, "lab2.txt")
    ));

    @Override
    public ArrayList<Submission> getAll() {
        return submissions;
    }

    @Override
    public ArrayList<Submission> sendSubmission(SubmissionsList newSubmissions) {
        submissions.addAll(newSubmissions.getSubmissions());
        return submissions;
    }

    @Override
    public List<Submission> getByStudentId(int id) {
        return submissions.stream().filter(pub -> pub.getStudentId() == id).collect(Collectors.toList());
    }

    @Override
    public ArrayList<Submission> cancelSubmission(int studentId, int workId) {
        submissions.removeIf(sub -> sub.getStudentId() == studentId && sub.getWorkId() == workId);
        return submissions;
    }
}
