package com.example.submission;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("api/submissions")
public class SubmissionController {
    private final SubmissionService submissionService;

    SubmissionController(SubmissionService submissionService) {
        this.submissionService = submissionService;
    }

    @CrossOrigin
    @GetMapping("student/{id}")
    public List<Submission> GetByStudentId(@PathVariable int id) {
        return submissionService.getByStudentId(id);
    }

    @CrossOrigin
    @PostMapping("test")
    public ResponseEntity Test(String model, MultipartFile file) {
        System.out.println(file.getName());
        return ResponseEntity.ok(HttpStatus.OK);
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
