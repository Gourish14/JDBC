CREATE DATABASE EMPLOYEE_DB;
CREATE SCHEMA EMP_DB;

USE EMP_DB;
CREATE TABLE EMPLOYEE(EMP_ID int, FirstName varchar(40), LastName varchar(40), Gender varchar(10), Salary float, Active varchar(10));

INSERT INTO EMPLOYEE VALUES(1, 'Rohan', 'Bassi', 'Male', 20000.00, 'True');
INSERT INTO EMPLOYEE VALUES(2, 'Darshan', 'Kumar', 'Male', 30000.00, 'True');
INSERT INTO EMPLOYEE VALUES(3, 'Gourish', 'Bhagat', 'Male', 40000.00, 'True');
INSERT INTO EMPLOYEE VALUES(4, 'Swati', 'Kumari', 'Female', 50000.00, 'True');
INSERT INTO EMPLOYEE VALUES(5, 'Ruby', 'Dash', 'Female', 60000.00, 'True');

SELECT * FROM EMPLOYEE;