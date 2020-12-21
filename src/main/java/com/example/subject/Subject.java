package com.example.subject;

import java.util.ArrayList;

public class Subject {
    private int id;
    private String title;
    private ArrayList<Integer> groups;
    private ArrayList<Integer> teachers;

    public Subject(int id, String title, ArrayList<Integer> groups, ArrayList<Integer> teachers) {
        this.id = id;
        this.title = title;
        this.groups = groups;
        this.teachers = teachers;
    }

    public Subject() {
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

    public ArrayList<Integer> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Integer> groups) {
        this.groups = groups;
    }

    public ArrayList<Integer> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Integer> teachers) {
        this.teachers = teachers;
    }
}
