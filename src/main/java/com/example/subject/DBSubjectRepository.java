package com.example.subject;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;

@Repository
public class DBSubjectRepository implements SubjectRepository {

    private static final String GET_SUBJECT_BY_ID = "select " +
            "s.*, array_agg(distinct(gs.group_id)) as groups, array_agg(distinct(st.teacher_id)) as teachers from subjects as s " +
            "join groups_subjects gs on s.id = gs.subject_id " +
            "join subjects_teachers st on s.id = st.subject_id " +
            "where s.id = ? " +
            "group by s.id";

    private final JdbcTemplate jdbcTemplate;
    private final BeanPropertyRowMapper<SubjectDto> subjectMapper;

    public DBSubjectRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        subjectMapper = new BeanPropertyRowMapper<>(SubjectDto.class);
    }

    @Override
    public Subject getSubjectById(int id) {
        try {
            return new Subject(jdbcTemplate.queryForObject(GET_SUBJECT_BY_ID, new Object[]{id}, subjectMapper));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
