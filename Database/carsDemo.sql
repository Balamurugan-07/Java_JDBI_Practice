CREATE DATABASE carsDemo;
USE carsDemo;
CREATE TABLE cars(
	carID INT PRIMARY KEY AUTO_INCREMENT,
    carName VARCHAR(20),
    carPrice DOUBLE
);

INSERT INTO cars(carName, carPrice) VALUES ("Audi", 250000.00), ("BMW", 300000.00);