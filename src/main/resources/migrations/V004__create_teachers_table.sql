CREATE TABLE IF NOT EXISTS teachers
(
    id      INTEGER NOT NULL REFERENCES users(id) PRIMARY KEY,
    degree  VARCHAR(32)
);