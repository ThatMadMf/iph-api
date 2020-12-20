CREATE TABLE IF NOT EXISTS students
(
    id          INTEGER NOT NULL REFERENCES users(id) PRIMARY KEY,
    group_id    INTEGER NOT NULL REFERENCES groups(id) ON DELETE CASCADE
);