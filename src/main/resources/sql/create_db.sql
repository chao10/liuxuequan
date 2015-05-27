/* Create the user table */
drop table if exists user;
create table user(
    id int primary key auto_increment,
    username varchar(32) unique,
    password varchar(32),
    locked boolean
) engine=InnoDB default charset=utf8;

/* Create the follower table */
drop table if exists follower;
create table follower(
    id int primary key auto_increment,
	follower int
) engine=InnoDB default charset=utf8;

/* Create the following table */
drop table if exists following;
create table following(
    id int primary key auto_increment,
	following int
) engine=InnoDB default charset=utf8;

/* Create the tweet table */
drop table if exists tweet;
create table tweet(
    id int primary key auto_increment,
	uid int,
	password varchar(1024),
	timestamp bigint
) engine=InnoDB default charset=utf8;