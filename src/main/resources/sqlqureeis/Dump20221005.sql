CREATE DATABASE  IF NOT EXISTS `jukebox` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `jukebox`;
-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: jukebox
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Table structure for table `playlist`
--

DROP TABLE IF EXISTS `playlist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `playlist` (
  `playlistName` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `playlist`
--

LOCK TABLES `playlist` WRITE;
/*!40000 ALTER TABLE `playlist` DISABLE KEYS */;
/*!40000 ALTER TABLE `playlist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `playlist1`
--

DROP TABLE IF EXISTS `playlist1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `playlist1` (
  `playlistId` int DEFAULT NULL,
  `Id` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `playlist1`
--

LOCK TABLES `playlist1` WRITE;
/*!40000 ALTER TABLE `playlist1` DISABLE KEYS */;
/*!40000 ALTER TABLE `playlist1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `song`
--

DROP TABLE IF EXISTS `song`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `song` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL,
  `duration` varchar(40) DEFAULT NULL,
  `albumName` varchar(200) DEFAULT NULL,
  `artistName` varchar(50) DEFAULT NULL,
  `genre` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `song`
--

LOCK TABLES `song` WRITE;
/*!40000 ALTER TABLE `song` DISABLE KEYS */;
INSERT INTO `song` VALUES (1,'all time low','00.03.38','Human -Condition','John-Bellion','Indie'),(2,'cheap thnills','00.03.33','Acting','Sia','pop-Rop'),(3,'doser','00:04:03','joy','Chainsmokers','rock'),(4,'Despacito','00:04:41','Despacita','Luis-Fonsi','Latin-pop'),(5,'Hello World','00:02:51','Walkerverse','Alan-Walker','Country');
/*!40000 ALTER TABLE `song` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `songpath`
--

DROP TABLE IF EXISTS `songpath`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `songpath` (
  `id` int DEFAULT NULL,
  `paths` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `songpath`
--

LOCK TABLES `songpath` WRITE;
/*!40000 ALTER TABLE `songpath` DISABLE KEYS */;
INSERT INTO `songpath` VALUES (1,'src/main/resources/songs/All Time Low.wav'),(2,'src/main/resources/songs/Cheap Thrills.wav'),(3,'src/main/resources/songs/Kesariya.wav'),(4,'src/main/resources/songs/Despacito.wav'),(5,'src/main/resources/songs/Hello World.wav');
/*!40000 ALTER TABLE `songpath` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-10-05 15:57:08
