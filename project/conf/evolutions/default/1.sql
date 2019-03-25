# --- First database schema

# --- !Ups
create table "register" (
    "userid"                  text not null, 
    "userpw"                  text not null,
); 

create table "articles" (
    "user_id"               int not null,
    "content"               text not null
);

insert into register(userid, userpw) values("admin", "admin");

# --- !Downs
drop table if exists register;