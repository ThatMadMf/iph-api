CREATE TABLE IF NOT EXISTS publications
(
    id            SERIAL PRIMARY KEY,
    subject_id    INTEGER NOT NULL REFERENCES subjects (id),
    title         VARCHAR(32),
    text          TEXT,
    author_id     INTEGER NOT NULL REFERENCES teachers (id),
    creation_date TIMESTAMP,
    deadline      TIMESTAMP
);