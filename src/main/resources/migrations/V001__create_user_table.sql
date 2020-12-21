CREATE TABLE IF NOT EXISTS users
(
    id      SERIAL PRIMARY KEY,
    role    VARCHAR(16),
    name    VARCHAR(32)
);