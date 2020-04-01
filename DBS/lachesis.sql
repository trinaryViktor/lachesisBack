-- MySQL dump 10.13  Distrib 8.0.19, for Linux (x86_64)
--
-- Host: localhost    Database: lachesis
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `fitbitData`
--

DROP TABLE IF EXISTS `fitbitData`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fitbitData` (
  `fid` int NOT NULL,
  `heart_rate` int DEFAULT NULL,
  `time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`fid`),
  CONSTRAINT `fitbitData_ibfk_1` FOREIGN KEY (`fid`) REFERENCES `patients_fitbit` (`fid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fitbitData`
--

LOCK TABLES `fitbitData` WRITE;
/*!40000 ALTER TABLE `fitbitData` DISABLE KEYS */;
INSERT INTO `fitbitData` VALUES (1,56,'2020-02-23 12:04:33'),(2,68,'2020-02-28 14:14:19');
/*!40000 ALTER TABLE `fitbitData` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patients`
--

DROP TABLE IF EXISTS `patients`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patients` (
  `pid` int NOT NULL AUTO_INCREMENT,
  `mid` int NOT NULL,
  `dobyear` int DEFAULT NULL,
  `dobmonth` int DEFAULT NULL,
  `dobday` int DEFAULT NULL,
  `first_name` varchar(20) DEFAULT NULL,
  `middle_name` varchar(20) DEFAULT NULL,
  `last_name` varchar(20) DEFAULT NULL,
  `weight` int DEFAULT NULL,
  `height` int DEFAULT NULL,
  `location` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`pid`),
  KEY `mid` (`mid`),
  KEY `patients_first_name_index` (`first_name`),
  KEY `patients_last_name_index` (`last_name`),
  KEY `patients_middle_name_index` (`middle_name`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patients`
--

LOCK TABLES `patients` WRITE;
/*!40000 ALTER TABLE `patients` DISABLE KEYS */;
INSERT INTO `patients` VALUES (1,1,1995,11,16,'Zheng',NULL,'Jin',70,175,'A'),(2,2,1996,3,19,'hy',NULL,'yang',60,167,'B'),(3,3,1980,12,31,'wow',NULL,'yeah',50,150,'C'),(4,5,1995,11,16,'Zhengtest',NULL,'Jin',70,175,'A');
/*!40000 ALTER TABLE `patients` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patients_fitbit`
--

DROP TABLE IF EXISTS `patients_fitbit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patients_fitbit` (
  `matchId` int NOT NULL AUTO_INCREMENT,
  `mid` int NOT NULL,
  `fid` int NOT NULL,
  `start` datetime DEFAULT NULL,
  `finish` datetime DEFAULT NULL,
  PRIMARY KEY (`matchId`),
  KEY `fid` (`fid`),
  KEY `mid` (`mid`),
  CONSTRAINT `patients_fitbit_ibfk_1` FOREIGN KEY (`mid`) REFERENCES `patients` (`mid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patients_fitbit`
--

LOCK TABLES `patients_fitbit` WRITE;
/*!40000 ALTER TABLE `patients_fitbit` DISABLE KEYS */;
INSERT INTO `patients_fitbit` VALUES (1,1,1,'2020-02-23 12:02:06','2020-02-23 12:04:18'),(2,2,2,'2020-02-27 14:15:05','2020-02-28 14:15:10');
/*!40000 ALTER TABLE `patients_fitbit` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-06  0:22:36
