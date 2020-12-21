package com.example.publication;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class DBPublicationRepository implements PublicationRepository {

    private static final String GET_ALL_PUBLICATIONS = "SELECT * FROM publications";
    private static final String GET_PUBLICATION_BY_ID = "SELECT * FROM publications WHERE id = ?";
    private static final String GET_PUBLICATION_BY_SUBJECT = "SELECT * FROM publications WHERE subject_id = ?";
    private static final String REMOVE_PUBLICATION = "DELETE FROM publications WHERE id = ?";
    private static final String CHANGE_TITLE = "UPDATE publications SET title = ? WHERE id = ?";
    private static final String CREATE_WORK = "INSERT INTO publications " +
            "(subject_id, title, text, author_id, creation_date, deadline)" +
            "VALUES (?, ?, ?, ?, ?, ?)";


    private final JdbcTemplate jdbcTemplate;
    private final BeanPropertyRowMapper<Publication> mapper;

    public DBPublicationRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        mapper = new BeanPropertyRowMapper<>(Publication.class);
    }

    @Override
    public ArrayList<Publication> getAll() {
        return (ArrayList<Publication>) jdbcTemplate.query(GET_ALL_PUBLICATIONS, mapper);
    }

    @Override
    public Publication getById(int id) {
        return jdbcTemplate.queryForObject(GET_PUBLICATION_BY_ID, new Object[]{id}, mapper);
    }

    @Override
    public void createNewWork(Work work) {
        jdbcTemplate.update(
                CREATE_WORK,
                work.getSubjectId(),
                work.getTitle(),
                work.getText(),
                work.getAuthorId(),
                work.getCreationDate(),
                work.getDeadline()
        );
    }

    @Override
    public void createNewAnnouncement(Announcement announcement) {
        jdbcTemplate.update(
                CREATE_WORK,
                announcement.getSubjectId(),
                announcement.getTitle(),
                announcement.getText(),
                announcement.getAuthorId(),
                announcement.getCreationDate(),
                announcement.getDeadline()
        );
    }

    @Override
    public void removePublication(int id) {
        jdbcTemplate.update(REMOVE_PUBLICATION, id);
    }

    @Override
    public Publication changeTitle(int id, String title) {
        jdbcTemplate.update(CHANGE_TITLE, title, id);
        return getById(id);
    }

    @Override
    public ArrayList<Publication> getPublicationsOfSubject(int subjectId) {
        return (ArrayList<Publication>) jdbcTemplate.query(GET_PUBLICATION_BY_SUBJECT, new Object[]{subjectId}, mapper);
    }
}
