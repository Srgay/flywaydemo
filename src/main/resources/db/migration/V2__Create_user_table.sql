-- auto-generated definition
create table user
(
    id         bigint auto_increment
        primary key,
    first_name text   not null,
    last_name  text   not null,
    mobile     bigint not null,
    email      text   not null
);

