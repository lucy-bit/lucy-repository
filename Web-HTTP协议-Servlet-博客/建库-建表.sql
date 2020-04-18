CREATE DATABASE java20_blog04 charset utf8mb4;

USE java20_blog04;

CREATE TABLE users (
  id INT PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(100) NOT NULL UNIQUE,
  password CHAR(64) NOT NULL,
  nickname CHAR(64) NOT NULL,
  brief VARCHAR(200) NOT NULL,
  registered_at DATETIME NOT NULL
);