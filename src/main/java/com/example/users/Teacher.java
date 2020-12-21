package com.example.users;

import java.util.ArrayList;

public class Teacher extends User {
    private String degree;
    private ArrayList<Integer> subjects;

    public Teacher(int id, String name, String role, String degree, ArrayList<Integer> subjects) {
        super(id, name, role);
        this.degree = degree;
        this.subjects = subjects;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public ArrayList<Integer> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Integer> subjects) {
        this.subjects = subjects;
    }
}
