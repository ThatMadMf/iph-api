CREATE TABLE IF NOT EXISTS subjects_teachers
(
    id          SERIAL PRIMARY KEY,
    subject_id  INTEGER NOT NULL REFERENCES subjects(id),
    teacher_id  INTEGER NOT NULL REFERENCES teachers(id)
);