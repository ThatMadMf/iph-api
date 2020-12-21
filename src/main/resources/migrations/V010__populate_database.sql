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
       (2, 1);

INSERT INTO users(name, role)
VALUES ('Alina', 'STUDENT'),
       ('Maxim', 'STUDENT'),
       ('Vova', 'STUDENT'),
       ('name1', 'TEACHER'),
       ('name2', 'TEACHER');

INSERT INTO students(id, group_id)
VALUES (1, 1),
       (2, 1),
       (3, 2);

INSERT INTO teachers(id, degree)
VALUES (4, '2 lvl'),
       (5, '1 lvl');

INSERT INTO subjects_teachers(subject_id, teacher_id)
VALUES (1, 4),
       (2, 4),
       (3, 4),
       (4, 5);

INSERT INTO publications(subject_id, title, text, author_id, creation_date, deadline)
VALUES (1, 'Lab1', 'Need to write something', 4, now(), now() + interval '1' day),
       (2, 'Announcement about deadline', '"Deadline delayed for 3 days', 5, now(), null),
       (3, 'Lab2', 'Need to write something', 4, now(), null);

