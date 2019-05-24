-- /data-style/training/mvn flyway:migrate --

--CREATE DATABASE IF NOT EXISTS training --

USE training;

CREATE TABLE IF NOT EXISTS t_administrator(
  id VARCHAR(36) PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  email VARCHAR(50) NOT NULL,
  createdAt DATETIME NOT NULL,
  updatedAt DATETIME NOT NULL
);

CREATE TABLE IF NOT EXISTS t_teacher(
  id VARCHAR(36) PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  organization VARCHAR(50) NOT NULL,
  title VARCHAR(50) NOT NULL,
  profile TEXT,
  createdAt DATETIME NOT NULL,
  updatedAt DATETIME NOT NULL
);

CREATE TABLE IF NOT EXISTS t_category(
  id VARCHAR(36) PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  createdAt DATETIME NOT NULL,
  updatedAt DATETIME NOT NULL
);

CREATE TABLE IF NOT EXISTS t_course(
  id VARCHAR(36) PRIMARY KEY,
  teacherId VARCHAR(36) NOT NULL REFERENCES t_teacher(id),
  name VARCHAR(50) NOT NULL UNIQUE,
  description VARCHAR(255) NOT NULL,
  earning VARCHAR(255),
  trainee VARCHAR(200),
  outline TEXT,
  price DECIMAL NOT NULL,
  duration INT NOT NULL,
  categoryId VARCHAR(36) NOT NULL REFERENCES t_category(id),
  createdBy VARCHAR(36) NOT NULL REFERENCES t_administrator(id),
  createdAt DATETIME NOT NULL,
  updatedAt DATETIME NOT NULL
);

CREATE TABLE IF NOT EXISTS t_calendar(
  id VARCHAR(36) PRIMARY KEY,
  courseId VARCHAR(36) NOT NULL REFERENCES t_course(id),
  place VARCHAR(50) NOT NULL,
  startDate DATETIME NOT NULL,
  endDate DATETIME NOT NULL,
  status ENUM('Available', 'Overdue') NOT NULL,
  createdAt DATETIME NOT NULL,
  updatedAt DATETIME NOT NULL
);

CREATE TABLE IF NOT EXISTS t_student(
  id VARCHAR(36) PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  email VARCHAR(50) NOT NULL,
  mobilePhone VARCHAR(20) NOT NULL,
  registeredTime DATETIME NOT NULL,
  createdAt DATETIME NOT NULL,
  updatedAt DATETIME NOT NULL
);

CREATE TABLE IF NOT EXISTS t_wish_list(
  studentId VARCHAR(36) NOT NULL REFERENCES t_student(id),
  courseId VARCHAR(36) NOT NULL REFERENCES t_course(id),
  PRIMARY KEY(studentId, courseId)
);

CREATE TABLE IF NOT EXISTS t_training(
  id VARCHAR(36) PRIMARY KEY,
  studentId VARCHAR(36) NOT NULL REFERENCES t_student(id),
  courseId VARCHAR(36) NOT NULL REFERENCES t_course(id),
  calendarId VARCHAR(36) NOT NULL REFERENCES t_calendar(id),
  price DECIMAL NOT NULL,
  subscribedTime DATETIME NOT NULL,
  createdAt DATETIME NOT NULL,
  updatedAt DATETIME NOT NULL
);

CREATE TABLE IF NOT EXISTS t_order(
  id VARCHAR(36) PRIMARY KEY,
  studentId VARCHAR(36) NOT NULL REFERENCES t_student(id),
  status ENUM('New', 'Paid', 'Confirmed', 'Completed') NOT NULL,
  placedTime DATETIME NOT NULL,
  createdAt DATETIME NOT NULL,
  updatedAt DATETIME NOT NULL
);

CREATE TABLE IF NOT EXISTS t_order_item(
  id VARCHAR(36) PRIMARY KEY,
  orderId VARCHAR(36) NOT NULL REFERENCES t_order(id),
  trainingId VARCHAR(36) NOT NULL REFERENCES t_training(id),
  createdAt DATETIME NOT NULL,
  updatedAt DATETIME NOT NULL
);

CREATE TABLE IF NOT EXISTS t_payment(
  id VARCHAR(36) PRIMARY KEY,
  studentId VARCHAR(36) NOT NULL REFERENCES t_student(id),
  orderId VARCHAR(36) NOT NULL REFERENCES t_order(id),
  amount DECIMAL NOT NULL,
  paymentStyle VARCHAR(20) NOT NULL,
  status ENUM('Success', 'Failure') NOT NULL,
  transactionTime TIMESTAMP NOT NULL,
  createdAt DATETIME NOT NULL,
  updatedAt DATETIME NOT NULL
);

