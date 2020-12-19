package com.example.publication;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PublicationService {
    private final List<Publication> publications;

    public PublicationService() {
        publications = Arrays.asList(new Work(1, "Lab1", "Need to write something", new GregorianCalendar(2017, Calendar.JANUARY , 25)),
                new Announcement(2, "Announcement about deadline", "Deadline delayed for 3 days"),
                new Work(3, "Lab2", "Need to code something"));
    }

    public List<Publication> getAll() {
        return publications;
    }

    public Optional<Publication> getById(int id) {
        return publications.stream().filter(pub -> pub.getId() == id).findFirst();
    }

    public void createNewPublication(Publication publication) {
        publications.add(publication);
    }

//    public Publication changeTitle(Publication publication) {
//        return
//    }
}
