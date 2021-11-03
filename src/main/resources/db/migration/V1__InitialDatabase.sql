create sequence member_seq START WITH 1 increment by 1;
create sequence role_seq START WITH 1 increment by 1;

create table roles
(
    id bigint,
    name varchar not null,
    primary key(id)
);

create table members
(
    id bigint,
    username varchar(255),
    email           varchar(255) not null,
    password        varchar(255),
    primary key(id)
);


INSERT INTO roles(id, name) VALUES(1, 'ROLE_USER');
INSERT INTO roles(id, name) VALUES(2, 'ROLE_MODERATOR');
INSERT INTO roles(id, name) VALUES(3, 'ROLE_ADMIN');
