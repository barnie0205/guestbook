DROP DATABASE IF EXISTS guestbook;
CREATE DATABASE guestbook;
USE guestbook;

CREATE TABLE book_entry (
                            id INT PRIMARY KEY AUTO_INCREMENT,
                            author VARCHAR(50) NOT NULL,
                            message VARCHAR(200) NOT NULL
);