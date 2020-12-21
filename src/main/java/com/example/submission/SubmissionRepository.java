package com.example.submission;

import java.util.ArrayList;
import java.util.List;

public interface SubmissionRepository {
    ArrayList<Submission> getAll();

    ArrayList<Submission> sendSubmission(SubmissionsList newSubmissions);

    List<Submission> getByStudentId(int id);

    ArrayList<Submission> cancelSubmission(int studentId, int workId);
}
