CREATE DATABASE IF NOT EXISTS `universidadejemplo`;
USE universidadejemplo;

DROP TABLE IF EXISTS `alumno`;

CREATE TABLE `alumno` (
  `idAlumno` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
  `apellido` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
  `dni` int NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `estado` tinyint(1) NOT NULL,
  PRIMARY KEY (`idAlumno`),
  UNIQUE KEY `dni` (`dni`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `alumno` VALUES (1,'Oriana','Gonazales',49310853,'1999-08-19',1),(2,'Mariano','Villalba',33119209,'1999-08-30',0),(3,'Mariano','Villalba',34589602,'1999-08-30',1),(4,'Alejandro','Marin',45666333,'1999-06-10',1),(5,'Agustina','Lopez',42666333,'1999-11-11',0);

DROP TABLE IF EXISTS `inscripcion`;

CREATE TABLE `inscripcion` (
  `idInscripto` int NOT NULL AUTO_INCREMENT,
  `idAlumno` int NOT NULL,
  `idMateria` int NOT NULL,
  `nota` double NOT NULL,
  PRIMARY KEY (`idInscripto`),
  KEY `idAlumno` (`idAlumno`),
  KEY `idMateria` (`idMateria`),
  CONSTRAINT `inscripcion_ibfk_1` FOREIGN KEY (`idAlumno`) REFERENCES `alumno` (`idAlumno`),
  CONSTRAINT `inscripcion_ibfk_2` FOREIGN KEY (`idMateria`) REFERENCES `materia` (`idMateria`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


INSERT INTO `inscripcion` VALUES (3,1,3,5),(7,2,4,0),(15,1,2,6),(17,1,5,8),(20,2,2,0),(21,1,1,8);

DROP TABLE IF EXISTS `materia`;

CREATE TABLE `materia` (
  `idMateria` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
  `año` int NOT NULL,
  `estado` tinyint(1) NOT NULL,
  PRIMARY KEY (`idMateria`),
  UNIQUE KEY `nombre` (`nombre`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `materia` VALUES (1,'Matematica',1,1),(2,'Lengua',2,1),(3,'Fisica',3,1),(4,'Geografia',4,1),(5,'Biologia',5,1),(6,'Etica',4,1),(7,'Civica',3,1),(8,'Ingles',1,1);

SELECT * FROM inscripcion WHERE idAlumno = 2
