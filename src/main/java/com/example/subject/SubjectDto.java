package com.example.subject;

import org.postgresql.jdbc.PgArray;

public class SubjectDto {
    private int id;
    private String title;
    private PgArray groups;
    private PgArray teachers;

    public SubjectDto(int id, String title, PgArray groups, PgArray teachers) {
        this.id = id;
        this.title = title;
        this.groups = groups;
        this.teachers = teachers;
    }

    public SubjectDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public PgArray getGroups() {
        return groups;
    }

    public void setGroups(PgArray groups) {
        this.groups = groups;
    }

    public PgArray getTeachers() {
        return teachers;
    }

    public void setTeachers(PgArray teachers) {
        this.teachers = teachers;
    }
}
