drop database if exists sampledb;
create database sampledb;
use sampledb;

create table sample_table(
user_No int,
user_name varchar(50),
user_age int,
user_Mail varchar(50)
);

insert into sample_table values(1,"Yamada",21,"xxx@yahoo.co.jp");
insert into sample_table values(2,"Sato",39,"yyy@google.com");
insert into sample_table values(3,"Harada",44,"zzz@yahoo.co.jp");
