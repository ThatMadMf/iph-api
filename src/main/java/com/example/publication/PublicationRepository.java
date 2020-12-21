package com.example.publication;

import java.util.ArrayList;
import java.util.List;

public interface PublicationRepository {
    ArrayList<Publication> getAll();
    Publication getById(int id);
    void createNewWork(Work work);
    void createNewAnnouncement(Announcement announcement);
    Publication removePublication(int id);
    List<Publication> getPublicationsOfStudent(int studentId);
}
