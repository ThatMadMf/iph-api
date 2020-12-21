package com.example.users;

public class Student extends User {
    private int groupId;

    public Student(int id, String name, String role, int groupId) {
        super(id, name, role);
        this.groupId = groupId;
    }

    public Student() {
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }
}
