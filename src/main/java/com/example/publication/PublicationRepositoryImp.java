package com.example.publication;

import com.example.users.UserService;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.*;

@Repository
public class PublicationRepositoryImp implements PublicationRepository {
    private final ArrayList<Publication> publications = new ArrayList<>(Arrays.asList(
            new Work(1, 1,"Lab1", "Need to write something", 4, LocalDateTime.now().plusDays(5)),
            new Announcement(2, 1,"Announcement about deadline", "Deadline delayed for 3 days", 5),
            new Work(3, 2, "Lab2", "Need to code something", 4)
    ));

    @Override
    public ArrayList<Publication> getAll() {
        return publications;
    }

    @Override
    public Publication getById(int id) {
        return publications.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void createNewWork(Work work) {
        publications.add(work);
    }

    @Override
    public void createNewAnnouncement(Announcement announcement) {
        publications.add(announcement);
    }

    @Override
    public Publication removePublication(int id) {
        Publication publication = publications.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
        publications.removeIf(pub -> pub.getId() == id);
        return publication;
    }

    @Override
    public Publication changeTitle(int id, String title) {
        Publication publication = publications.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
        publication.setTitle(title);
        return publication;
    }

    @Override
    public List<Publication> getPublicationsOfStudent(int studentId) {
        return null;
    }
}
