USE studentdb;

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    course VARCHAR(50),
    age INT
);

INSERT INTO students (name, course, age) VALUES
('Rahul', 'BCA', 20),
('Priya', 'MCA', 22),
('Aman', 'BTech', 21),
('Sneha', 'BSc', 19),
('Karan', 'MBA', 24);