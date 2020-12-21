package com.example.publication;

import java.time.LocalDateTime;

public class Work extends Publication {
    private LocalDateTime deadline;

    public Work(int id, int subjectId, String title, String text, int authorId, LocalDateTime deadline) {
        super(id, subjectId, title, text, authorId);
        this.deadline = deadline;
    }

    public Work(int id, int subjectId, String title, String text, int authorId) {
        super(id, subjectId, title, text, authorId);
        this.deadline = LocalDateTime.of(4000, 1, 25, 0, 0);
    }


    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }
}
