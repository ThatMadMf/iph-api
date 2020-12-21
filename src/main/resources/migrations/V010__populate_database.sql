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
       (2, 1),
       (2, 3),
       (2, 4);

INSERT INTO users(role, name)
VALUES ('name1', 'TEACHER'),
       ('name2', 'TEACHER'),
       ('Alina', 'STUDENT'),
       ('Maxim', 'STUDENT'),
       ('Vova', 'STUDENT');

INSERT INTO students(id, group_id)
VALUES (3, 1),
(4, 1),
(5, 2);

INSERT INTO teachers(id, degree)
VALUES (1, '2 lvl'),
       (2, '1 lvl');

INSERT INTO subjects_teachers(subject_id, teacher_id)
VALUES (1, 1),
(2, 1),
(3, 1),
(4, 2);

INSERT INTO publications(subject_id, title, text, author_id, creation_date, deadline)
VALUES (1, 'Lab1', 'Need to write something', 1, now(), now() + interval '1' day),
(1, 'Announcement about deadline', '"Deadline delayed for 3 days', 2, now(), null),
(1, 'Lab2', 'Need to write something', 1, now(), null);

