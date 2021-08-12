-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: mydb
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `fund_managers`
--

DROP TABLE IF EXISTS `fund_managers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fund_managers` (
  `employee_id` int NOT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fund_managers`
--

LOCK TABLES `fund_managers` WRITE;
/*!40000 ALTER TABLE `fund_managers` DISABLE KEYS */;
INSERT INTO `fund_managers` VALUES (1,'Bill','Sakila'),(2,'Terry','Jones'),(3,'Mike','White'),(4,'Alice','Smith'),(5,'Cindy','Williams'),(6,'Nancy','Davis'),(7,'Danny','Wilson');
/*!40000 ALTER TABLE `fund_managers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funds`
--

DROP TABLE IF EXISTS `funds`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funds` (
  `fund_id` int NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `fund_manager_employee_id` int NOT NULL,
  PRIMARY KEY (`fund_id`,`fund_manager_employee_id`),
  KEY `fk_funds_fund_manager_idx` (`fund_manager_employee_id`),
  CONSTRAINT `fk_funds_fund_manager` FOREIGN KEY (`fund_manager_employee_id`) REFERENCES `fund_managers` (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funds`
--

LOCK TABLES `funds` WRITE;
/*!40000 ALTER TABLE `funds` DISABLE KEYS */;
INSERT INTO `funds` VALUES (1,'Olympic Memorial Fund',1),(2,'UK Overseas Income Fund',1),(3,'North America Growth',1),(4,'Fuji Memorial Fund',2),(5,'Global Tech Fund',2),(6,'North America Tech Fund',3),(7,'NAM Overseas Income Fund',3),(8,'APAC Tech Fund',4),(9,'APAC United Growth',4),(10,'JYP Memorial Fund',4),(11,'National Development Fund',5),(12,'Spark Program Fund',6),(13,'State Key Lab Fund',6),(14,'EUR Innovation Fund',7),(15,'EUR Mutual Fund',7),(16,'European Union Tech Fund',7),(17,'EUR Overseas Income Fund',7);
/*!40000 ALTER TABLE `funds` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `positions`
--

DROP TABLE IF EXISTS `positions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `positions` (
  `position_id` int NOT NULL,
  `security_id` int DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  `Date_purchased` date DEFAULT NULL,
  `funds_fund_id` int NOT NULL,
  `funds_fund_manager_employee_id` int NOT NULL,
  `Securites_security_id` int NOT NULL,
  PRIMARY KEY (`position_id`,`funds_fund_id`,`funds_fund_manager_employee_id`,`Securites_security_id`),
  KEY `fk_Positions_funds1_idx` (`funds_fund_id`,`funds_fund_manager_employee_id`),
  KEY `fk_Positions_Securites1_idx` (`Securites_security_id`),
  CONSTRAINT `fk_Positions_funds1` FOREIGN KEY (`funds_fund_id`, `funds_fund_manager_employee_id`) REFERENCES `funds` (`fund_id`, `fund_manager_employee_id`),
  CONSTRAINT `fk_Positions_Securites1` FOREIGN KEY (`Securites_security_id`) REFERENCES `securites` (`security_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `positions`
--

LOCK TABLES `positions` WRITE;
/*!40000 ALTER TABLE `positions` DISABLE KEYS */;
INSERT INTO `positions` VALUES (1,1,100,'2016-01-10',1,1,1),(2,1,120,'2016-05-12',1,1,1),(3,1,200,'2016-11-14',1,1,1),(4,1,125,'2016-02-02',2,1,1),(5,1,75,'2016-05-02',2,1,1),(6,1,45,'2017-01-23',3,1,1),(7,1,60,'2017-02-25',3,1,1),(8,2,100,'2016-03-12',4,2,2),(9,2,50,'2016-03-14',4,2,2),(10,2,50,'2016-04-27',5,2,2),(11,2,75,'2016-07-17',5,2,2),(12,2,90,'2017-05-24',5,2,2),(13,2,100,'2017-09-13',6,3,2),(14,3,130,'2016-01-04',7,3,3),(15,3,150,'2016-02-22',7,3,3),(16,3,140,'2016-05-12',8,4,3),(17,3,150,'2016-06-11',8,4,3),(18,3,100,'2016-11-11',9,4,3),(19,3,65,'2016-12-30',9,4,3),(20,4,50,'2017-04-04',10,4,4),(21,4,100,'2016-05-22',11,5,4),(22,4,125,'2016-10-10',11,5,4),(23,4,180,'2016-12-12',11,5,4),(24,4,200,'2017-02-14',11,5,4),(25,4,80,'2017-06-13',12,6,4),(26,1,100,'2017-10-12',13,6,1),(27,1,120,'2017-11-20',13,6,1),(28,1,200,'2017-12-12',14,7,1),(29,1,250,'2017-12-30',15,7,1),(30,1,120,'2018-01-03',15,7,1),(31,2,125,'2016-12-28',16,7,2),(32,2,160,'2017-02-13',16,7,2),(33,2,220,'2017-04-15',17,7,2);
/*!40000 ALTER TABLE `positions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `securites`
--

DROP TABLE IF EXISTS `securites`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `securites` (
  `security_id` int NOT NULL,
  `Symbol` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`security_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `securites`
--

LOCK TABLES `securites` WRITE;
/*!40000 ALTER TABLE `securites` DISABLE KEYS */;
INSERT INTO `securites` VALUES (1,'IBM'),(2,'Visa'),(3,'Google'),(4,'CVS');
/*!40000 ALTER TABLE `securites` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'mydb'
--

--
-- Dumping routines for database 'mydb'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-11 14:06:08
