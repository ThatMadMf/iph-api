INSERT INTO groups (title)
VALUES ('KC-172'),
       ('KC-173');

INSERT INTO subjects (title)
VALUES ('Math'),
       ('Web'),
       ('Economy'),
       ('PE');

INSERT INTO groups_subjects (group_id, subject_id)
VALUES (1, 1),
       (1, 2),
       (1, 3),
       (2, 4);

INSERT INTO users(name, role)
VALUES ('Alina', 'STUDENT'),
       ('Maxim', 'STUDENT'),
       ('Vova', 'STUDENT'),
       ('Oleg', 'STUDENT'),
       ('Sasha', 'STUDENT'),
       ('Sergiy Vassilyovich', 'TEACHER'),
       ('Oleg Petrovich', 'TEACHER'),
       ('Nadiya Vasylivna', 'TEACHER');

INSERT INTO students(id, group_id)
VALUES (1, 1),
       (2, 1),
       (3, 2),
       (4, 2),
       (5, 2);

INSERT INTO teachers(id, degree)
VALUES (6, '2 lvl'),
       (7, '1 lvl'),
       (8, '1 lvl');

INSERT INTO subjects_teachers(subject_id, teacher_id)
VALUES (1, 6),
       (2, 7),
       (3, 7),
       (4, 8);

INSERT INTO publications(subject_id, title, text, author_id, creation_date, deadline)
VALUES (1, 'Lab1', 'Need to read documentation', 6, now(), now() + interval '1' day),
       (2, 'Announcement about deadline', '"Deadline delayed for 3 days', 7, now(), null),
       (3, 'Lab2', 'Need to complete a test', 6, now(), now() + interval '7' day),
       (4, 'Announcement about schedule of exams', '"They are gonna be soon', 7, now(), null),
       (2, 'Module test', '"For 3 previous lectures', 8, now(), now() + interval '14' day),
       (4, 'Lab3', 'Write documentation', 6, now(), now() + interval '20' day);

