CREATE SCHEMA IF NOT EXISTS monaco;

CREATE TABLE IF NOT EXISTS monaco.document (
	id INT NOT NULL AUTO_INCREMENT,
    password_hash VARCHAR(100) NOT NULL,
    filename VARCHAR(100) NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    filetype ENUM('java', 'ts', 'c', 'cpp', 'py', 'html', 'css', 'js') NOT NULL,
    PRIMARY KEY ( id )
);