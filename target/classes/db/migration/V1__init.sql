DROP TABLE IF EXISTS users;

CREATE TABLE users (
    id int primary key,
    username varchar(100) not null,
    first_name varchar(50) not null,
    last_name varchar(50) DEFAULT null
);