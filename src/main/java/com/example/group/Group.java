package com.example.group;

import java.util.ArrayList;

public class Group {
    private int id;
    private String title;
    private ArrayList<Integer> subjects;

    public Group(int id, String title, ArrayList<Integer> subjects) {
        this.id = id;
        this.title = title;
        this.subjects = subjects;
    }

    public Group() {
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

    public ArrayList<Integer> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Integer> subjects) {
        this.subjects = subjects;
    }
}
