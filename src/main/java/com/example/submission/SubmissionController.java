package com.example.submission;

import com.example.publication.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/submissions")
public class SubmissionController {
    SubmissionService submissionService = new SubmissionService();

    @CrossOrigin
    @GetMapping("student/{id}")
    public List<Submission> GetByStudentId(@PathVariable int id) {
        return submissionService.getByStudentId(id);
    }

    @CrossOrigin
    @GetMapping
    public List<Submission> GetAll() {
        return submissionService.getAll();
    }

    @CrossOrigin
    @PostMapping
    public List<Submission> SubmitWork(@RequestBody SubmissionsList newSubmissions) {
        return submissionService.sendSubmission(newSubmissions);
    }

    @CrossOrigin
    @DeleteMapping("student/{studentId}/work/{workId}")
    public List<Submission> CancelSubmissionForWork(@PathVariable int studentId, @PathVariable int workId) {
        return submissionService.cancelSubmission(studentId, workId);
    }
}
