-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema secundariabd
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema secundariabd
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `secundariabd` DEFAULT CHARACTER SET utf8mb4 ;
USE `secundariabd` ;

-- -----------------------------------------------------
-- Table `secundariabd`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `secundariabd`.`usuario` (
  `id_usuario` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `contraseña` VARCHAR(32) NOT NULL,
  `estado` ENUM('activo', 'inactivo') NOT NULL,
  PRIMARY KEY (`id_usuario`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE,
  UNIQUE INDEX `contraseña_UNIQUE` (`contraseña` ASC) VISIBLE);


-- -----------------------------------------------------
-- Table `secundariabd`.`cursada`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `secundariabd`.`cursada` (
  `id_cursada` INT NOT NULL AUTO_INCREMENT,
  `anio_division` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_cursada`),
  UNIQUE INDEX `anio_division_UNIQUE` (`anio_division` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `secundariabd`.`alumno`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `secundariabd`.`alumno` (
  `id_alumno` INT NOT NULL AUTO_INCREMENT,
  `id_usuario` INT NOT NULL,
  `id_cursada` INT NOT NULL,
  PRIMARY KEY (`id_alumno`, `id_usuario`, `id_cursada`),
  INDEX `fk_alumnos_usuarios1_idx` (`id_usuario` ASC) VISIBLE,
  INDEX `fk_alumno_cursada1_idx` (`id_cursada` ASC) VISIBLE,
  CONSTRAINT `fk_alumnos_usuarios1`
    FOREIGN KEY (`id_usuario`)
    REFERENCES `secundariabd`.`usuario` (`id_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_alumno_cursada1`
    FOREIGN KEY (`id_cursada`)
    REFERENCES `secundariabd`.`cursada` (`id_cursada`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `secundariabd`.`materia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `secundariabd`.`materia` (
  `id_materia` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_materia`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `secundariabd`.`profesor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `secundariabd`.`profesor` (
  `id_profesor` INT NOT NULL AUTO_INCREMENT,
  `id_usuario` INT NOT NULL,
  PRIMARY KEY (`id_profesor`, `id_usuario`),
  INDEX `fk_profesores_usuarios1_idx` (`id_usuario` ASC) VISIBLE,
  CONSTRAINT `fk_profesores_usuarios1`
    FOREIGN KEY (`id_usuario`)
    REFERENCES `secundariabd`.`usuario` (`id_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `secundariabd`.`administrador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `secundariabd`.`administrador` (
  `id_administrador` INT NOT NULL AUTO_INCREMENT,
  `id_usuario` INT NOT NULL,
  PRIMARY KEY (`id_administrador`, `id_usuario`),
  INDEX `fk_administradores_usuarios1_idx` (`id_usuario` ASC) VISIBLE,
  CONSTRAINT `fk_administradores_usuarios1`
    FOREIGN KEY (`id_usuario`)
    REFERENCES `secundariabd`.`usuario` (`id_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `secundariabd`.`cursada/materia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `secundariabd`.`cursada/materia` (
  `id_cursada` INT NOT NULL,
  `id_materia` INT NOT NULL,
  PRIMARY KEY (`id_cursada`, `id_materia`),
  INDEX `fk_cursadas_has_materias_materias1_idx` (`id_materia` ASC) VISIBLE,
  INDEX `fk_cursadas_has_materias_cursadas1_idx` (`id_cursada` ASC) VISIBLE,
  CONSTRAINT `fk_cursadas_has_materias_cursadas1`
    FOREIGN KEY (`id_cursada`)
    REFERENCES `secundariabd`.`cursada` (`id_cursada`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_cursadas_has_materias_materias1`
    FOREIGN KEY (`id_materia`)
    REFERENCES `secundariabd`.`materia` (`id_materia`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `secundariabd`.`calificacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `secundariabd`.`calificacion` (
  `id_calificacion` INT NOT NULL AUTO_INCREMENT,
  `nota` INT NOT NULL,
  `num_examen` INT NOT NULL,
  `id_alumno` INT NOT NULL,
  `id_materia` INT NOT NULL,
  PRIMARY KEY (`id_calificacion`, `id_alumno`, `id_materia`),
  INDEX `fk_calificaciones_alumnos1_idx` (`id_alumno` ASC) VISIBLE,
  INDEX `fk_calificaciones_materias1_idx` (`id_materia` ASC) VISIBLE,
  CONSTRAINT `fk_calificaciones_alumnos1`
    FOREIGN KEY (`id_alumno`)
    REFERENCES `secundariabd`.`alumno` (`id_alumno`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_calificaciones_materias1`
    FOREIGN KEY (`id_materia`)
    REFERENCES `secundariabd`.`materia` (`id_materia`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `secundariabd`.`profesor/cursada`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `secundariabd`.`profesor/cursada` (
  `id_profesor` INT NOT NULL,
  `id_cursada` INT NOT NULL,
  PRIMARY KEY (`id_profesor`, `id_cursada`),
  INDEX `fk_profesores_has_cursadas_cursadas1_idx` (`id_cursada` ASC) VISIBLE,
  INDEX `fk_profesores_has_cursadas_profesores1_idx` (`id_profesor` ASC) VISIBLE,
  CONSTRAINT `fk_profesores_has_cursadas_profesores1`
    FOREIGN KEY (`id_profesor`)
    REFERENCES `secundariabd`.`profesor` (`id_profesor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_profesores_has_cursadas_cursadas1`
    FOREIGN KEY (`id_cursada`)
    REFERENCES `secundariabd`.`cursada` (`id_cursada`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
