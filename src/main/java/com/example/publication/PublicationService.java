package com.example.publication;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PublicationService {
    private final ArrayList<Publication> publications = new ArrayList<>();

    public PublicationService() {
        publications.add(new Work(1, "Lab1", "Need to write something", new GregorianCalendar(2017, Calendar.JANUARY , 25)));
        publications.add(new Announcement(2, "Announcement about deadline", "Deadline delayed for 3 days"));
        publications.add(new Work(3, "Lab2", "Need to code something"));
    }

    public List<Publication> getAll() {
        return publications;
    }

    public Publication getById(int id) {
        return publications.stream().filter(pub -> pub.getId() == id).findFirst().orElse(null);
    }

    public void createNewWork(Work work) {
        publications.add(work);
    }
    public void createNewAnnouncement(Announcement announcement) {
        publications.add(announcement);
    }

    public Publication changeTitle(int id, String title) {
        Publication publication = getById(id);
        publication.setTitle(title);
        return publication;
    }
}
