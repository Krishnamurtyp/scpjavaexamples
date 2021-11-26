CREATE TABLE users
(
    id bigint NOT NULL,
    userName text,
    userPassword text,
    userEmailAddress text,
    CONSTRAINT user_pkey PRIMARY KEY (id)
);

INSERT INTO users(id, userName, userPassword, userEmailAddress) VALUES
    (1, 'userName1', 'password1', 'user1@test.com'),
    (2, 'userName2', 'password2', 'user2@test.com'), 
    (3, 'userName3', 'password3', 'user3@test.com'),
    (4, 'administrator', 'password4', 'administrator@test.com');