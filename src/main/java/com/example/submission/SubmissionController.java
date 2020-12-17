package com.example.submission;

import com.example.publication.Publication;
import com.example.publication.PublicationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("publications")
public class SubmissionController {
    SubmissionService submissionService = new SubmissionService();

    @GetMapping
    public List<Submission> GetAll() {
        return submissionService.getAll();
    }

}
