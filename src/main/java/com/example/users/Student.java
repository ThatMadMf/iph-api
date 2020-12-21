package com.example.users;

public class Student extends User {
    private int GroupId;

    public Student(int id, String name, String role, int groupId) {
        super(id, name, role);
        GroupId = groupId;
    }

    public Student() {
    }

    public int getGroupId() {
        return GroupId;
    }

    public void setGroupId(int groupId) {
        GroupId = groupId;
    }
}
