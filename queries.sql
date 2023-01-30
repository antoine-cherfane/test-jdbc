CREATE SCHEMA IF NOT EXISTS `test-jdbc`;

CREATE TABLE IF NOT EXISTS `test-jdbc`.`personnes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(45) DEFAULT NULL,
  `age` int DEFAULT NULL,
  PRIMARY KEY (`id`)
);

TRUNCATE TABLE `test-jdbc`.`personnes`;

INSERT INTO `test-jdbc`.`personnes` (`nom`, `age`)
VALUES ('Antoine', 21), ('Rima', 25), ('Yorgo', 23);