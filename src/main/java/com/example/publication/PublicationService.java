package com.example.publication;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PublicationService {
    private final List<Publication> publications;

    public PublicationService() {
        publications = Arrays.asList(new Publication("test"), new Publication("announcement about deadline"));
    }

    public List<Publication> getAll() {
        return publications;
    }
}
