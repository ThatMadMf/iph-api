CREATE TABLE IF NOT EXISTS submissions
(
    id             SERIAL PRIMARY KEY,
    publication_id INTEGER NOT NULL REFERENCES publications (id),
    student_id     INTEGER NOT NULL REFERENCES students (id),
    content        TEXT
);