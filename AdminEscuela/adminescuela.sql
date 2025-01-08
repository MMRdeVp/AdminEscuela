DROP DATABASE IF EXISTS adminescuela;
CREATE DATABASE adminescuela;
USE adminescuela;

CREATE TABLE Direccion (
    id INT AUTO_INCREMENT PRIMARY KEY, 
    nombre VARCHAR(100) NOT NULL,      
    apellidos VARCHAR(150) NOT NULL  
);

CREATE TABLE Secretaria (
    id INT AUTO_INCREMENT PRIMARY KEY, 
    nombre VARCHAR(100) NOT NULL,      
    apellidos VARCHAR(150) NOT NULL     
);

CREATE TABLE PadresAlumno (
    id INT AUTO_INCREMENT PRIMARY KEY,  
    nombre VARCHAR(100) NOT NULL,       
    apellidos VARCHAR(150) NOT NULL,   
    telefono VARCHAR(15) NOT NULL,     
    email VARCHAR(150) NOT NULL       
);

CREATE TABLE Curso (
    id INT AUTO_INCREMENT PRIMARY KEY, 
    nombre VARCHAR(10) NOT NULL UNIQUE 
);

INSERT INTO Curso (nombre) VALUES ('DAM'), ('DAW'), ('ASIR'), ('SMIR');

CREATE TABLE Alumno (
    id INT AUTO_INCREMENT PRIMARY KEY,         
    nombre VARCHAR(100) NOT NULL,              
    apellidos VARCHAR(150) NOT NULL,                   
    padres_id INT NOT NULL,                    
    amonestaciones BOOLEAN NOT NULL DEFAULT 0, 
    matricula_id INT NOT NULL,                 
    
    FOREIGN KEY (padres_id) REFERENCES PadresAlumno(id) ON DELETE CASCADE, 
    FOREIGN KEY (matricula_id) REFERENCES Curso(id) ON DELETE CASCADE      
);

SELECT (nombre, apellidos) FROM Secretaria;

