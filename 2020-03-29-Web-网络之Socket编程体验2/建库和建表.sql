CREATE DATABASE IF NOT EXISTS java20_0329 CHARSET utf8mb4;
USE java20_0329;

CREATE TABLE IF NOT EXISTS vocabulary (
  en VARCHAR(20) NOT NULL UNIQUE,
  cn VARCHAR(100) NOT NULL
);

INSERT INTO vocabulary (en, cn) VALUES
  ("dog", "狗"),
  ("cat", "猫");