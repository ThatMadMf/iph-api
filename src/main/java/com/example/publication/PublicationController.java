package com.example.publication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/publications")
public class PublicationController {
    PublicationService publicationService = new PublicationService();

    @GetMapping
    public List<Publication> GetAll() {
        return publicationService.getAll();
    }
}
