-- auto-generated definition
create table user (
	id bigint not null auto_increment
		primary key,
	name varchar(20) null,
	age int null
);

create table student (
	s_id bigint not null auto_increment
		primary key,
	s_name varchar(20) null,
	age int null
);

create table addresses (
	addr_id int not null auto_increment
		primary key,
	street varchar(20) null,
	city varchar(30) null,
	state varchar(10) null,
	zip varchar(10) null,
	country varchar(20) null
);

create table students (
	stud_id int not null auto_increment
		primary key,
	name varchar(20) null,
	email varchar(30) null,
	phone varchar(20) null,
	addr_id int null
);

create table brand (
	id int not null auto_increment
		primary key,
	name varchar(20) not null
);

create table product (
	id int not null auto_increment
		primary key,
	name varchar(20) not null,
	brand_id int not null
);


