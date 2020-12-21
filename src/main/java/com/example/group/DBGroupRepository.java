package com.example.group;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class DBGroupRepository implements GroupRepository {

    private static final String GET_SUBJECTS_IDS = "SELECT s.id FROM subjects AS s " +
            "JOIN groups_subjects gs on s.id = gs.subject_id " +
            "WHERE gs.group_id = ?;";

    private final JdbcTemplate jdbcTemplate;

    public DBGroupRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public ArrayList<Integer> getSubjectIds(int id) {
        return (ArrayList<Integer>) jdbcTemplate.queryForList(GET_SUBJECTS_IDS, new Object[]{id}, Integer.class);
    }
}
