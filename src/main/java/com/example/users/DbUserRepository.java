package com.example.users;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DbUserRepository implements UserRepository {

    private static final String GET_USER_BY_ID = "SELECT * FROM users WHERE id = ?";
    private static final String GET_STUDENT_BY_ID = "SELECT s.*, u.role as role, u.name as name FROM students as s JOIN users u on u.id = s.id WHERE s.id = ?";
    private static final String GET_TEACHER_BY_ID = "SELECT t.*, u.role as role, u.name as name FROM teachers as t JOIN users u on u.id = t.id WHERE t.id = ?";

    private final JdbcTemplate jdbcTemplate;
    private final BeanPropertyRowMapper<User> userMapper;
    private final BeanPropertyRowMapper<Student> studentMapper;
    private final BeanPropertyRowMapper<Teacher> teacherMapper;

    public DbUserRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        userMapper = new BeanPropertyRowMapper<>(User.class);
        studentMapper = new BeanPropertyRowMapper<>(Student.class);
        teacherMapper = new BeanPropertyRowMapper<>(Teacher.class);
    }


    @Override
    public User getById(int id) {
        return jdbcTemplate.queryForObject(GET_USER_BY_ID, new Object[]{id}, userMapper);
    }

    @Override
    public Teacher getTeacherById(int id) {
        return jdbcTemplate.queryForObject(GET_TEACHER_BY_ID, new Object[]{id}, teacherMapper);

    }

    @Override
    public Student getStudentById(int id) {
        return jdbcTemplate.queryForObject(GET_STUDENT_BY_ID, new Object[]{id}, studentMapper);
    }
}
