CREATE DATABASE dbname;


CREATE TABLE Personsasasasasdasd
(
Person_Id int NOT NULL AUTO_INCREMENT,
LastName varchar(255) NOT NULL,
FirstName varchar(255),
Address varchar(255),
City varchar(123) UNIQUE,
PRIMARY KEY (Person_Id)
);

CREATE TABLE Orders
(
O_Id int NOT NULL,
OrderNo int NOT NULL,
P_Id int,
I_Id int,
PRIMARY KEY (O_Id),
FOREIGN KEY (P_Id) REFERENCES Persons(Person_Id),
FOREIGN KEY (I_Id) REFERENCES Item(I_Id)
)

CREATE TABLE Item
(
I_Id int NOT NULL,
Name int NOT NULL,
PRIMARY KEY (I_Id)
)
/*sql insert*/
INSERT INTO persons
(Person_Id,
LastName,
 FirstName,
 Address,
 City) 
VALUES (99998,'test','test','test','test1');


/*SQL UPDATE*/ 
UPDATE table_name
SET column1=value1,column2=value2,...
WHERE some_column>some_value AND OR ;

/*SQL DELETE*/
DELETE FROM table_name
WHERE some_column=some_value;

/*LIMIT*/
SELECT *
FROM Persons
LIMIT 5 order by date;

/*LIKE*/
SELECT column_name(s)
FROM table_name
WHERE column_name LIKE pattern;

/*SQL % Wildcard*/
SELECT * FROM Customers
WHERE City LIKE '%b%e%r%';

/*SQL IN */
SELECT City FROM customers
WHERE City IN ('Paris' ,'London');

/*SQL BETWEEN*/
SELECT * FROM Products
WHERE Price BETWEEN 10 AND 20;

/*SQL Aliases*/
SELECT CustomerName, Address+', '+City+', '+PostalCode+', '+Country AS Address
FROM Customers;
/* OR arba */
SELECT CustomerName, CONCAT(Address,', ',City,', ',PostalCode,', ',Country) AS Address
FROM Customers;

/*SQL Joins*/
SELECT Orders.OrderID, Customers.CustomerName, Orders.OrderDate
FROM Orders
INNER JOIN Customers
ON Orders.CustomerID=Customers.CustomerID;        

INNER JOIN
SELECT column_name(s)
FROM table1
JOIN table2
ON table1.column_name=table2.column_name;

LEFT JOIN
SELECT column_name(s)
FROM table1
LEFT JOIN table2
ON table1.column_name=table2.column_name;

SQL Aggregate Functions
AVG() - Returns the average value
COUNT() - Returns the number of rows
FIRST() - Returns the first value
LAST() - Returns the last value
MAX() - Returns the largest value
MIN() - Returns the smallest value
SUM() - Returns the sum

CREATE INDEX index_name
ON table_name (column_name)

CREATE VIEW view_name AS
SELECT column_name(s)
FROM table_name
WHERE condition