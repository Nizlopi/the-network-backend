create table account_verification
(
    created_on        timestamp    not null,
    verification_code varchar(255) not null,
    user_id           integer      not null,
    primary key (user_id)
);
create table admins
(
    id integer not null,
    primary key (id)
);
create table member
(
    id              uuid      not null,
    account_enabled boolean      not null,
    membership_type varchar(255) not null,
    email           varchar(255) not null,
    company_name    varchar(255) not null,
    first_name      varchar(255),
    last_name       varchar(255),
    password        varchar(255),
    photo_url       varchar(255),
    primary key (id)
);
