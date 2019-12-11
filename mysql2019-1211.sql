CREATE DATABASE 'java1211';
USE java1211;
CREATE TABLE goods (
	name VARCHAR(20)comment '商品名称',
	price INT comment '商品价格',
	reserve INT comment '商品库存',
	`describe` VARCHAR(20)comment '商品描述'
);

CREATE TABLE teacher (
	name varchar(20),
	age int,
	height decimal(10,3),
	weight decimal(10,3),
	sex varchar(20),
	education varchar(20),
	birthday int,
	id int
);

CREATE TABLE book (
	name varchar(20),
	author varchar(20),
	price decimal(10,3),
	sort varchar(20)
);

CREATE TABLE students (
	name varchar(20) UNIQUE DEFAULT NULL,
	gender varchar(3) DEFAULT "保密" comment  "性别 男、女、保密",
	age int DEFAULT 0,
	height double DEFAULT 0 comment "身高，单位是厘米“,
	weight double DEFAULT 0 comment "体重，单位是公斤"
);
INSERT INTO students VALUES("孙悟空","男",18,160,30);

select name students where age = 18;

CREATE TABLE teachers (
	name varchar(20) UNIQUE ,
	gender varchar(3) NOT NULL DEFAULT "保密",
	age int NOT NULL DEFAULT 0,
	height double NOT NULL DEFAULT 0 ,
	weight double NOT NULL DEFAULT 0 
);

CREATE TABLE users (
	id INT PRIMARY KEY AUTO_INCREMENT,
	username VARCHAR(100) UNIQUE
);

CREATE TABLE essays (
	id INT PRIMARY KEY AUTO_INCREMENT,
	user_id INT NOT NULL,
	title VARCHAR(100)NOT NULL,
	content TEXT NOT NULL,
	published_at DATETIME NOT NULL
);
CREATE TABLE comments (
	id INT PRIMARY KEY AUTO_INCREMENT,
	PRIMARY KEY(user_id,essay_id),
	content 
	
);




