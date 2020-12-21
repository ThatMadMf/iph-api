package com.example.users;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DbUserRepository implements UserRepository {

    private static final String GET_USER_BY_ID = "SELECT * FROM users WHERE id = ?";
    private static final String GET_STUDENT_BY_ID = "SELECT * FROM students WHERE id = ? AND role ='STUDENT'";
    private static final String GET_TEACHER_BY_ID = "SELECT * FROM students WHERE id = ? AND role ='TEACHER'";

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
        return jdbcTemplate.queryForObject(GET_USER_BY_ID, new Object[]{id}, teacherMapper);

    }

    @Override
    public Student getStudentById(int id) {
        return jdbcTemplate.queryForObject(GET_USER_BY_ID, new Object[]{id}, studentMapper);
    }
}
