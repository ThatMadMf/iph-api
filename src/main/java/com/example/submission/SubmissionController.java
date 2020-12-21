package com.example.submission;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
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
    @PostMapping("submitPermission")
    public ResponseEntity Test(String workId, String studentId, String content, MultipartFile file) {
        ArrayList<Submission> newSubmission = new ArrayList<>(Arrays.asList( new Submission(Integer.parseInt(workId),
                Integer.parseInt(studentId), content)));
        submissionService.sendSubmission(new SubmissionsList(newSubmission));

        Path path = Paths.get(System.getProperty("user.dir") + "/submissions/" + file.getOriginalFilename());
        try (OutputStream os = Files.newOutputStream(path)) {
            os.write(file.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
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
