package com.example.submission;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/submissions")
public class SubmissionController {
    SubmissionService submissionService = new SubmissionService();

    @GetMapping
    public List<Submission> GetAll() {
        return submissionService.getAll();
    }

    @PostMapping("/sendSubmission")
    public ResponseEntity SubmitPermission(@RequestBody SubmissionsList newSubmissions) {
        submissionService.sendSubmission(newSubmissions);
        return ResponseEntity.ok(HttpStatus.OK);
    }

}
