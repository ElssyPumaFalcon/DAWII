CREATE DATABASE IF NOT EXISTS dragonball_db;
USE dragonball_db;

CREATE TABLE IF NOT EXISTS dragon_ball (
    name VARCHAR(255) PRIMARY KEY,
    ki VARCHAR(50),
    max_ki VARCHAR(50),
    race VARCHAR(100),
    gender VARCHAR(50),
    description TEXT
);