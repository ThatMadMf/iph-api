package com.example.publication;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PublicationRepositoryImp implements  PublicationRepository {
    @Override
    public List<Publication> getAll() {
        return null;
    }

    @Override
    public Publication getById(int id) {
        return null;
    }

    @Override
    public void createNewWork(Work work) {

    }

    @Override
    public void createNewAnnouncement(Announcement announcement) {

    }

    @Override
    public Publication removePublication(int id) {
        return null;
    }

    @Override
    public List<ResponseModel> getPublicationsOfStudent(int studentId) {
        return null;
    }
}
