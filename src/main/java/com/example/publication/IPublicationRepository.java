package com.example.publication;

import java.util.List;

public interface IPublicationRepository {
    List<Publication> getAll();
    Publication getById(int id);
    void createNewWork(Work work);
    void createNewAnnouncement(Announcement announcement);
    Publication removePublication(int id);
    List<ResponseModel> getPublicationsOfStudent(int studentId);
}
