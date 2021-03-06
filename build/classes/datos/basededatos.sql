-- MySQL Script generated by MySQL Workbench
-- Tue Mar 22 02:36:09 2022
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema pasajes
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `pasajes` ;

-- -----------------------------------------------------
-- Schema pasajes
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `pasajes` ;
USE `pasajes` ;

-- -----------------------------------------------------
-- Table `bus`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `bus` ;

CREATE TABLE IF NOT EXISTS `bus` (
  `idbus` CHAR(5) NOT NULL,
  `terminalorigenid` CHAR(5) NOT NULL,
  `terminaldestinoid` CHAR(5) NOT NULL,
  `estado` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`idbus`, `terminalorigenid`, `terminaldestinoid`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ciudaddestino`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ciudaddestino` ;

CREATE TABLE IF NOT EXISTS `ciudaddestino` (
  `idciudaddestino` CHAR(5) NOT NULL,
  `nombre` VARCHAR(30) NOT NULL,
  `provincia` VARCHAR(20) NOT NULL,
  `region` VARCHAR(30) NOT NULL,
  PRIMARY KEY (`idciudaddestino`))
ENGINE = InnoDB;



-- -----------------------------------------------------
-- Table `ciudadorigen`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ciudadorigen` ;

CREATE TABLE IF NOT EXISTS `ciudadorigen` (
  `idciudadorigen` CHAR(5) NOT NULL,
  `nombre` VARCHAR(30) NOT NULL,
  `provincia` VARCHAR(20) NOT NULL,
  `region` VARCHAR(30) NOT NULL,
  PRIMARY KEY (`idciudadorigen`))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `pasaje`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `pasaje` ;

CREATE TABLE IF NOT EXISTS `pasaje` (
  `idpasaje` CHAR(5) NOT NULL,
  `horasalida` VARCHAR(10) NOT NULL,
  `fechasalida` DATE NOT NULL,
  `estado` VARCHAR(15) NOT NULL,
  `asiento` INT NOT NULL,
  `idbus` CHAR(5) NOT NULL,
  `idpasajero` CHAR(5) NOT NULL,
  `preciopasaje` DOUBLE NOT NULL,
  PRIMARY KEY (`idpasaje`))
ENGINE = InnoDB;

CREATE UNIQUE INDEX `asiento_UNIQUE` ON `pasaje` (`asiento` ASC) VISIBLE;

-- -----------------------------------------------------
-- Table `pasajero`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `pasajero` ;


CREATE TABLE IF NOT EXISTS `pasajero` (
  `idpasajero` CHAR(5) NOT NULL,
  `rut` VARCHAR(10) NOT NULL,
  `nombre` VARCHAR(20) NOT NULL,
  `appaterno` VARCHAR(30) NOT NULL,
  `apmaterno` VARCHAR(30) NOT NULL,
  `fechanacimiento` DATE NOT NULL,
  `edad` INT NOT NULL,
  PRIMARY KEY (`idpasajero`))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `reserva`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `reserva` ;

CREATE TABLE IF NOT EXISTS `reserva` (
  `idreserva` CHAR(5) NOT NULL,
  `fechareserva` DATE NOT NULL,
  `pasajeroid` CHAR(5) NOT NULL,
  `pasajeid` CHAR(5) NOT NULL,
  `precio` DECIMAL(9,2) NOT NULL,
  `pagado` TINYINT NOT NULL,
  `vencido` TINYINT NOT NULL,
  PRIMARY KEY (`idreserva`, `pasajeroid`, `pasajeid`))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `terminaldestino`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `terminaldestino` ;

CREATE TABLE IF NOT EXISTS `terminaldestino` (
  `iddestino` CHAR(5) NOT NULL,
  `nombre` VARCHAR(30) NOT NULL,
  `direccion` VARCHAR(50) NOT NULL,
  `telefono` VARCHAR(10) NOT NULL,
  `idciudaddestino` CHAR(5) NOT NULL,
  PRIMARY KEY (`iddestino`, `idciudaddestino`))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `terminalorigen`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `terminalorigen` ;

CREATE TABLE IF NOT EXISTS `terminalorigen` (
  `idorigen` CHAR(5) NOT NULL,
  `nombre` VARCHAR(30) NOT NULL,
  `direccion` VARCHAR(50) NOT NULL,
  `telefono` VARCHAR(10) NOT NULL,
  `idciudadorigen` CHAR(5) NOT NULL,
  PRIMARY KEY (`idorigen`, `idciudadorigen`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
