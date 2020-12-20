CREATE TABLE IF NOT EXISTS groups_subjects
(
    id          SERIAL PRIMARY KEY,
    group_id    INTEGER NOT NULL REFERENCES groups(id),
    subject_id  INTEGER NOT NULL REFERENCES subjects(id)
);