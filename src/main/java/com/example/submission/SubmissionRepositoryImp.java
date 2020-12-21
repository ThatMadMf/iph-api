package com.example.submission;

import com.example.subject.Subject;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class SubmissionRepositoryImp implements SubmissionRepository{
    private final ArrayList<Submission> subjects = new ArrayList<>(Arrays.asList(
            new Submission(1, 1, "lab1.txt"),
            new Submission(2, 2, "lab2.txt")
    ));
    @Override
    public ArrayList<Submission> getAll() {
        return null;
    }

    @Override
    public List<Submission> sendSubmission(SubmissionsList newSubmissions) {
        return null;
    }

    @Override
    public List<Submission> getByStudentId(int id) {
        return null;
    }

    @Override
    public List<Submission> cancelSubmission(int studentId, int workId) {
        return null;
    }
}
