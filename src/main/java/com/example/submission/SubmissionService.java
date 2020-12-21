package com.example.submission;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SubmissionService {
    private final SubmissionRepository submissionRepository;

    public SubmissionService(SubmissionRepository submissionRepository) {
        this.submissionRepository = submissionRepository;
    }

    public ArrayList<Submission> getAll() {
        return submissionRepository.getAll();
    }

    public List<Submission> sendSubmission(SubmissionsList newSubmissions) {
        return submissionRepository.sendSubmission(newSubmissions);
    }

    public List<Submission> getByStudentId(int id) {
        return submissionRepository.getByStudentId(id);
    }

    public List<Submission> cancelSubmission(int studentId, int workId) {
        return submissionRepository.cancelSubmission(studentId, workId);
    }
}
