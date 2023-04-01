-- MySQL dump 10.13  Distrib 8.0.27, for macos11 (x86_64)
--
-- Host: 127.0.0.1    Database: npms
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
-- Table structure for table `approvallog`
--

DROP TABLE IF EXISTS `approvallog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `approvallog` (
  `app_id` int NOT NULL AUTO_INCREMENT,
  `app_flow_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `app_opp_id` int DEFAULT NULL,
  `app_submit_people` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `app_submit_date` datetime DEFAULT NULL,
  `app_people` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `app_status` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `app_opinion` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `app_result` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`app_id`),
  KEY `approvallog_opportunity_buffer_oppb_id_fk` (`app_opp_id`),
  CONSTRAINT `approvallog_opportunity_buffer_oppb_id_fk` FOREIGN KEY (`app_opp_id`) REFERENCES `opportunity_buffer` (`oppb_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `approvallog`
--

LOCK TABLES `approvallog` WRITE;
/*!40000 ALTER TABLE `approvallog` DISABLE KEYS */;
/*!40000 ALTER TABLE `approvallog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `c_agree_degree`
--

DROP TABLE IF EXISTS `c_agree_degree`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `c_agree_degree` (
  `agree_id` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `agree_degree` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`agree_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `c_agree_degree`
--

LOCK TABLES `c_agree_degree` WRITE;
/*!40000 ALTER TABLE `c_agree_degree` DISABLE KEYS */;
INSERT INTO `c_agree_degree` VALUES ('10','fully support'),('20','support'),('30','neutral');
/*!40000 ALTER TABLE `c_agree_degree` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `c_bu`
--

DROP TABLE IF EXISTS `c_bu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `c_bu` (
  `cbu_id` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `cbu_name` varchar(80) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`cbu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `c_bu`
--

LOCK TABLES `c_bu` WRITE;
/*!40000 ALTER TABLE `c_bu` DISABLE KEYS */;
INSERT INTO `c_bu` VALUES ('01','Industry Division 1'),('02','Industry Division 2'),('03','Industry Division 3'),('04','Industry Division 4'),('05','Industry Division 5'),('06','Product Division 1'),('07','Product Division 2'),('08','Product Division 3'),('09','Product Division 4'),('10','Product Division 5'),('11','Industry Division 1-Consulting Division 1'),('12','Industry Division 2-Consulting Division 2'),('13','Industry Division 3-Consulting Division 3'),('14','Industry business department 3- business development department'),('15','Product Division 1 - Product Consulting Department'),('16','Product Division 1 - Product Development Department');
/*!40000 ALTER TABLE `c_bu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `c_business_type`
--

DROP TABLE IF EXISTS `c_business_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `c_business_type` (
  `bus_id` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `bus_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`bus_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `c_business_type`
--

LOCK TABLES `c_business_type` WRITE;
/*!40000 ALTER TABLE `c_business_type` DISABLE KEYS */;
INSERT INTO `c_business_type` VALUES ('01','Third-party software service'),('02','Third-party software service'),('03','own software product'),('04','own software product'),('05','system integration'),('06','non-product development'),('07','Product development');
/*!40000 ALTER TABLE `c_business_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `c_compete_pos`
--

DROP TABLE IF EXISTS `c_compete_pos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `c_compete_pos` (
  `cp_id` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `cp_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`cp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `c_compete_pos`
--

LOCK TABLES `c_compete_pos` WRITE;
/*!40000 ALTER TABLE `c_compete_pos` DISABLE KEYS */;
INSERT INTO `c_compete_pos` VALUES ('10','only choice'),('20','leader'),('30','evenly matched'),('40','behind');
/*!40000 ALTER TABLE `c_compete_pos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `c_customer_relation`
--

DROP TABLE IF EXISTS `c_customer_relation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `c_customer_relation` (
  `cusrel_relation_id` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `cusrel_relation_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`cusrel_relation_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `c_customer_relation`
--

LOCK TABLES `c_customer_relation` WRITE;
/*!40000 ALTER TABLE `c_customer_relation` DISABLE KEYS */;
INSERT INTO `c_customer_relation` VALUES ('10','parent company'),('20','Subsidiary'),('30','holding company');
/*!40000 ALTER TABLE `c_customer_relation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `c_customer_status`
--

DROP TABLE IF EXISTS `c_customer_status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `c_customer_status` (
  `cus_status_id` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `cus_status_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`cus_status_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `c_customer_status`
--

LOCK TABLES `c_customer_status` WRITE;
/*!40000 ALTER TABLE `c_customer_status` DISABLE KEYS */;
INSERT INTO `c_customer_status` VALUES ('10','normal'),('20','freeze ');
/*!40000 ALTER TABLE `c_customer_status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `c_effect`
--

DROP TABLE IF EXISTS `c_effect`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `c_effect` (
  `effect_id` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `effect_degree` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`effect_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `c_effect`
--

LOCK TABLES `c_effect` WRITE;
/*!40000 ALTER TABLE `c_effect` DISABLE KEYS */;
INSERT INTO `c_effect` VALUES ('10','tall'),('20','middle'),('30','short');
/*!40000 ALTER TABLE `c_effect` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `c_enterprise_property`
--

DROP TABLE IF EXISTS `c_enterprise_property`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `c_enterprise_property` (
  `ep_id` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `ep_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`ep_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `c_enterprise_property`
--

LOCK TABLES `c_enterprise_property` WRITE;
/*!40000 ALTER TABLE `c_enterprise_property` DISABLE KEYS */;
INSERT INTO `c_enterprise_property` VALUES ('10','foreign investment'),('20','sino foreign joint venture'),('30','state owned enterprises'),('40','private Enterprise'),('99','other');
/*!40000 ALTER TABLE `c_enterprise_property` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `c_opp_origin`
--

DROP TABLE IF EXISTS `c_opp_origin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `c_opp_origin` (
  `coo_id` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `coo_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`coo_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `c_opp_origin`
--

LOCK TABLES `c_opp_origin` WRITE;
/*!40000 ALTER TABLE `c_opp_origin` DISABLE KEYS */;
INSERT INTO `c_opp_origin` VALUES ('10','company'),('20','personal'),('30','manufacturers');
/*!40000 ALTER TABLE `c_opp_origin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `c_opportunity_status`
--

DROP TABLE IF EXISTS `c_opportunity_status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `c_opportunity_status` (
  `opp_status_id` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `opp_status_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`opp_status_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `c_opportunity_status`
--

LOCK TABLES `c_opportunity_status` WRITE;
/*!40000 ALTER TABLE `c_opportunity_status` DISABLE KEYS */;
INSERT INTO `c_opportunity_status` VALUES ('10','draft'),('20','in process'),('30','normal'),('40','pause'),('50','closure'),('60','return');
/*!40000 ALTER TABLE `c_opportunity_status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `c_payer`
--

DROP TABLE IF EXISTS `c_payer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `c_payer` (
  `pay_id` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `pay_decision` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`pay_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `c_payer`
--

LOCK TABLES `c_payer` WRITE;
/*!40000 ALTER TABLE `c_payer` DISABLE KEYS */;
INSERT INTO `c_payer` VALUES ('10','final decision maker'),('20','decision maker'),('30','technical director'),('40','user');
/*!40000 ALTER TABLE `c_payer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `c_position`
--

DROP TABLE IF EXISTS `c_position`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `c_position` (
  `pos_id` varchar(8) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `pos_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`pos_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `c_position`
--

LOCK TABLES `c_position` WRITE;
/*!40000 ALTER TABLE `c_position` DISABLE KEYS */;
INSERT INTO `c_position` VALUES ('10000030','general manager'),('20000010','vice president of marketing'),('20000020','marketing specialist'),('30000010','director of sales'),('30000030','account manager'),('50000000','senior leadership');
/*!40000 ALTER TABLE `c_position` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `c_product`
--

DROP TABLE IF EXISTS `c_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `c_product` (
  `cpro_id` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `cpro_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`cpro_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `c_product`
--

LOCK TABLES `c_product` WRITE;
/*!40000 ALTER TABLE `c_product` DISABLE KEYS */;
INSERT INTO `c_product` VALUES ('01','SAP'),('02','ORACLE'),('03','NSRM'),('06','NPMS'),('07','NFOL');
/*!40000 ALTER TABLE `c_product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `c_product_bu_rel`
--

DROP TABLE IF EXISTS `c_product_bu_rel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `c_product_bu_rel` (
  `cpbr_id` int NOT NULL AUTO_INCREMENT,
  `cpbr_pro_id` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `cpbr_bu_id` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`cpbr_id`),
  KEY `c_product_bu_rel_c_product_cpro_id_fk` (`cpbr_pro_id`),
  KEY `c_product_bu_rel_c_bu_cbu_id_fk` (`cpbr_bu_id`),
  CONSTRAINT `c_product_bu_rel_c_bu_cbu_id_fk` FOREIGN KEY (`cpbr_bu_id`) REFERENCES `c_bu` (`cbu_id`),
  CONSTRAINT `c_product_bu_rel_c_product_cpro_id_fk` FOREIGN KEY (`cpbr_pro_id`) REFERENCES `c_product` (`cpro_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `c_product_bu_rel`
--

LOCK TABLES `c_product_bu_rel` WRITE;
/*!40000 ALTER TABLE `c_product_bu_rel` DISABLE KEYS */;
INSERT INTO `c_product_bu_rel` VALUES (1,'01','01'),(2,'01','02'),(3,'01','03'),(4,'01','04'),(5,'02','05'),(6,'03','06'),(7,'06','07'),(8,'07','07');
/*!40000 ALTER TABLE `c_product_bu_rel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `c_project_sub_opp_type`
--

DROP TABLE IF EXISTS `c_project_sub_opp_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `c_project_sub_opp_type` (
  `pso_id` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `pso_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`pso_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `c_project_sub_opp_type`
--

LOCK TABLES `c_project_sub_opp_type` WRITE;
/*!40000 ALTER TABLE `c_project_sub_opp_type` DISABLE KEYS */;
INSERT INTO `c_project_sub_opp_type` VALUES ('01','implementation of third party software products'),('02','custom development'),('05','third party service'),('06','third party software products'),('07','third party software product maintenance fee'),('08','implementation of own software products'),('09','own software product'),('12','other software product'),('14','non product development'),('15','product development');
/*!40000 ALTER TABLE `c_project_sub_opp_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `c_project_type_product_rel`
--

DROP TABLE IF EXISTS `c_project_type_product_rel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `c_project_type_product_rel` (
  `cptpr_id` int NOT NULL AUTO_INCREMENT,
  `cptpr_bus_id` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `cptpr_pro_id` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`cptpr_id`),
  KEY `c_project_type_product_rel_c_product_cpro_id_fk` (`cptpr_pro_id`),
  KEY `c_project_type_product_rel_c_project_sub_opp_type_pso_id_fk` (`cptpr_bus_id`),
  CONSTRAINT `c_project_type_product_rel_c_product_cpro_id_fk` FOREIGN KEY (`cptpr_pro_id`) REFERENCES `c_product` (`cpro_id`),
  CONSTRAINT `c_project_type_product_rel_c_project_sub_opp_type_pso_id_fk` FOREIGN KEY (`cptpr_bus_id`) REFERENCES `c_project_sub_opp_type` (`pso_id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `c_project_type_product_rel`
--

LOCK TABLES `c_project_type_product_rel` WRITE;
/*!40000 ALTER TABLE `c_project_type_product_rel` DISABLE KEYS */;
INSERT INTO `c_project_type_product_rel` VALUES (8,'01','01'),(9,'01','02'),(10,'06','01'),(11,'06','02'),(12,'07','01'),(13,'07','02'),(14,'08','03'),(15,'08','06'),(16,'08','07'),(17,'09','03'),(18,'09','06'),(19,'09','07');
/*!40000 ALTER TABLE `c_project_type_product_rel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `competitor`
--

DROP TABLE IF EXISTS `competitor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `competitor` (
  `comp_id` int NOT NULL AUTO_INCREMENT,
  `comp_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `comp_position` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `comp_opp_id` varchar(8) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`comp_id`),
  KEY `competitor_c_compete_pos_cp_id_fk` (`comp_position`),
  KEY `competitor_opportunity_opp_id_fk` (`comp_opp_id`),
  CONSTRAINT `competitor_c_compete_pos_cp_id_fk` FOREIGN KEY (`comp_position`) REFERENCES `c_compete_pos` (`cp_id`),
  CONSTRAINT `competitor_opportunity_opp_id_fk` FOREIGN KEY (`comp_opp_id`) REFERENCES `opportunity` (`opp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `competitor`
--

LOCK TABLES `competitor` WRITE;
/*!40000 ALTER TABLE `competitor` DISABLE KEYS */;
INSERT INTO `competitor` VALUES (1,'xiao mi','30','20210004'),(2,'NBA','20','20210001'),(3,'NCAA','30','20210001'),(4,'medium soft','30','20210003'),(8,NULL,NULL,'20210007'),(9,'test four opponent',NULL,'20210008');
/*!40000 ALTER TABLE `competitor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `competitor_buffer`
--

DROP TABLE IF EXISTS `competitor_buffer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `competitor_buffer` (
  `compb_id` int NOT NULL AUTO_INCREMENT,
  `compb_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `compb_position` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `compb_opp_id` int DEFAULT NULL,
  PRIMARY KEY (`compb_id`),
  KEY `competitor_buffer_c_compete_pos_cp_id_fk` (`compb_position`),
  KEY `competitor_buffer_opportunity_buffer_oppb_id_fk` (`compb_opp_id`),
  CONSTRAINT `competitor_buffer_c_compete_pos_cp_id_fk` FOREIGN KEY (`compb_position`) REFERENCES `c_compete_pos` (`cp_id`),
  CONSTRAINT `competitor_buffer_opportunity_buffer_oppb_id_fk` FOREIGN KEY (`compb_opp_id`) REFERENCES `opportunity_buffer` (`oppb_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `competitor_buffer`
--

LOCK TABLES `competitor_buffer` WRITE;
/*!40000 ALTER TABLE `competitor_buffer` DISABLE KEYS */;
INSERT INTO `competitor_buffer` VALUES (1,NULL,NULL,4),(2,NULL,NULL,5),(3,NULL,NULL,6),(6,NULL,NULL,25),(7,NULL,NULL,26);
/*!40000 ALTER TABLE `competitor_buffer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contact`
--

DROP TABLE IF EXISTS `contact`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contact` (
  `con_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `con_customer_id` varchar(6) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `con_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `con_dept` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `con_role` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `con_landline_phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `con_mobile_phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `con_fax` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `con_email` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `con_qq` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `con_wechat` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`con_id`),
  KEY `contact_customer_cus_id_fk` (`con_customer_id`),
  CONSTRAINT `contact_customer_cus_id_fk` FOREIGN KEY (`con_customer_id`) REFERENCES `customer` (`cus_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contact`
--

LOCK TABLES `contact` WRITE;
/*!40000 ALTER TABLE `contact` DISABLE KEYS */;
INSERT INTO `contact` VALUES ('1414102004387594124','800002','George','sales','manager','65539171','17136381916','123461','1231@qq.com','12383617','32973216'),('1414102004387594212','800001','Kate','sales','manager','65539171','17136381916','123461','1231@qq.com','12383617','32973216'),('1414102004387594242','800001','Leo','sales','manager','65539171','17136381916','123461','1231@qq.com','12383617','32973216'),('1414102004387594245','800001','James','sales','manager','65539171','17136381916','123461','1231@qq.com','12383617','32973216'),('1414102004387594555','800002','Mike','sales','manager','65539171','17136381916','123461','1231@qq.com','12383617','32973216'),('1414167929556090882','800007','David',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('1414170713080811521','800008','David',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('1414428898534420482','800009','Tim','sales','manager','666666','17136381916','123461','666666@qq.com','12383617','32973216'),('1418055183986921473','800012','Rise','sales','manager','65539171','17136381916','123461','1231@qq.com','12383617','32973216'),('1418055184007892994','800012','Oxford','sales','manager','65539171','17136381916','123461','1231@qq.com','12383617','32973216'),('1418059155149754369','800009','Lucas','sales','manager','65539171','17136381916','123461','1231@qq.com','12383617','32973216');
/*!40000 ALTER TABLE `contact` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `cus_id` varchar(6) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `cus_name` varchar(70) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `cus_country` varchar(6) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `cus_city` varchar(70) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `cus_address` varchar(120) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `cus_postcode` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `cus_website` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `cus_taxpayer_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `cus_tax_category` varchar(4) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `cus_account_allocation_section` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `cus_enterprise_property` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `cus_annual_sales_revenue` double DEFAULT NULL,
  `cus_product_type` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `cus_software_brand` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `cus_effect_of_informationization` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `cus_sales_dept_id` varchar(7) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `cus_customer_manager_id` varchar(8) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `cus_status` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`cus_id`),
  UNIQUE KEY `customer_cus_taxpayer_id_uindex` (`cus_taxpayer_id`),
  KEY `customer_c_customer_status_cus_status_id_fk` (`cus_status`),
  KEY `customer_c_enterprise_property_ep_id_fk` (`cus_enterprise_property`),
  KEY `customer_department_dept_id_fk` (`cus_sales_dept_id`),
  KEY `customer_employee_emp_id_fk` (`cus_customer_manager_id`),
  CONSTRAINT `customer_c_customer_status_cus_status_id_fk` FOREIGN KEY (`cus_status`) REFERENCES `c_customer_status` (`cus_status_id`),
  CONSTRAINT `customer_c_enterprise_property_ep_id_fk` FOREIGN KEY (`cus_enterprise_property`) REFERENCES `c_enterprise_property` (`ep_id`),
  CONSTRAINT `customer_department_dept_id_fk` FOREIGN KEY (`cus_sales_dept_id`) REFERENCES `department` (`dept_id`),
  CONSTRAINT `customer_employee_emp_id_fk` FOREIGN KEY (`cus_customer_manager_id`) REFERENCES `employee` (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES ('800001','HUAWEI','China','Beijing','Beijing Chaoyang district rose appartment 103 room','110110','www.huawei.com','1','1','10','30',300000,'IT','HUAWEI phones','good','8021140','800123','10'),('800002','Honnor','China','Beijing','Beijing Chaoyang district rose appartment 203 room','111110','www.honnor.com','2','1','10','30',300000,'IT','Honnor phones','good','8021140','800123','10'),('800003','Tencent','China','Guangdong','Guangdong good district green house 801room','134262','www.tencent.com','3','1','10','30',300000,'IT','CF','good','8021140','800126','10'),('800004','Neusoft','China','Shenyang','Shenyang hunnan district zhihui street 300','119119','www.huawei.com','4','1','10','30',300000,'IT','HIS','fantastic','8021130','800127','10'),('800005','Neuedu','China','Shenyang','Shenyang hunnan district zhihui street 300','119119','www.neusoft.edu.com','5','1','10','30',300000,'IT','NEU','fantastic','8021130','800127','10'),('800006','CBA','China','Beijing','Beijing street001','110110','www.cba.com','6','1','10','30',300000,'sport','CBA','good','8021130','800127','10'),('800007','NBA','USA','LA','100 Street','110110','www.nba.com','7','1','10','30',300000,'sport','NBA','good','8021140','800126','10'),('800008','NBL','USA','LA','100 Street','110110','www.nbl.com','9999','1','10','20',300000,'sport','NBL','good','8021140','800126','10'),('800009','NCAA','CNC','LAC','800 Street','898989','abc.com','1111','1','10','20',100000,'sport','NCAA','good','8021140','800123','10'),('800010','OPPO','China','Beijing','300 Street','222222','www.oppo.com','1000','1','10','30',100000,'IT','phone','good','8031100','800132','10'),('800011','DELL','USA','NY','300 Street','222222','www.dell.com','123','1','10','30',100000,'IT','computer','good','8031100','800132','10'),('800012','ACER','China','NY','100 Street','111000','www.acer.com','8849921','1','10','20',100000,'IT','computer','good','8021140','800123','20');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_related`
--

DROP TABLE IF EXISTS `customer_related`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer_related` (
  `cusrel_id` int NOT NULL AUTO_INCREMENT,
  `cusrel_cus_id` varchar(6) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `cusrel_cus_related_cus_id` varchar(6) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `cusrel_relation` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`cusrel_id`),
  KEY `customer_related_c_customer_relation_cusrel_relation_id_fk` (`cusrel_relation`),
  KEY `customer_related_customer_cus_id_fk` (`cusrel_cus_id`),
  KEY `customer_related_customer_cus_id_fk_2` (`cusrel_cus_related_cus_id`),
  CONSTRAINT `customer_related_c_customer_relation_cusrel_relation_id_fk` FOREIGN KEY (`cusrel_relation`) REFERENCES `c_customer_relation` (`cusrel_relation_id`),
  CONSTRAINT `customer_related_customer_cus_id_fk` FOREIGN KEY (`cusrel_cus_id`) REFERENCES `customer` (`cus_id`),
  CONSTRAINT `customer_related_customer_cus_id_fk_2` FOREIGN KEY (`cusrel_cus_related_cus_id`) REFERENCES `customer` (`cus_id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_related`
--

LOCK TABLES `customer_related` WRITE;
/*!40000 ALTER TABLE `customer_related` DISABLE KEYS */;
INSERT INTO `customer_related` VALUES (1,'800001','800002','10'),(2,'800001','800003','10'),(3,'800001','800006','10'),(4,'800004','800005','10'),(5,'800004','800006','10'),(15,'800007','800001','10'),(16,'800008','800001','10'),(28,'800012','800001','10'),(31,'800009','800004','10'),(32,'800009','800001','10');
/*!40000 ALTER TABLE `customer_related` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `department` (
  `dept_id` varchar(7) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `dept_name` varchar(80) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`dept_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES ('8011000','general managers office'),('8012000','general managers office'),('8015000','personnel administration center'),('8015010','human resources department'),('8015020','administration department'),('8021110','sell one'),('8021120','sell two'),('8021130','sell three'),('8021140','sell four'),('8021150','sell five'),('8021210','marketing department'),('8031100','industry division one'),('8031110','industry division two'),('8031120','industry division three'),('8031200','industry division two'),('8031310','industry business department three consulting department'),('8031320','industry business department three  business development department'),('8042100','product division one'),('8042110','product division one  product consulting department'),('8042120','product division one product development department'),('8042210','product division two  product consulting department'),('8042220','product division two  wms product department'),('8042300','product business department three'),('8042400','product division four');
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `emp_id` varchar(8) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `emp_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `emp_password` varchar(64) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `emp_dept_id` varchar(7) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `emp_position_id` varchar(8) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`emp_id`),
  KEY `employee_c_position_pos_id_fk` (`emp_position_id`),
  KEY `employee_department_dept_id_fk` (`emp_dept_id`),
  CONSTRAINT `employee_c_position_pos_id_fk` FOREIGN KEY (`emp_position_id`) REFERENCES `c_position` (`pos_id`),
  CONSTRAINT `employee_department_dept_id_fk` FOREIGN KEY (`emp_dept_id`) REFERENCES `department` (`dept_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES ('800123','tom','$2a$10$M90kZMExrMzprk0eyQC87OXO9seAzOwAmZt7FqWsul1DC59mwNgkK','8021140','30000030'),('800124','jerry','$2a$10$M90kZMExrMzprk0eyQC87OXO9seAzOwAmZt7FqWsul1DC59mwNgkK','8011000','10000030'),('800125','jack','$2a$10$M90kZMExrMzprk0eyQC87OXO9seAzOwAmZt7FqWsul1DC59mwNgkK','8021140','30000010'),('800126','kate','$2a$10$M90kZMExrMzprk0eyQC87OXO9seAzOwAmZt7FqWsul1DC59mwNgkK','8021140','30000030'),('800127','paul','$2a$10$M90kZMExrMzprk0eyQC87OXO9seAzOwAmZt7FqWsul1DC59mwNgkK','8021130','30000030'),('800128','jim','$2a$10$M90kZMExrMzprk0eyQC87OXO9seAzOwAmZt7FqWsul1DC59mwNgkK','8015000','50000000'),('800129','kim','$2a$10$M90kZMExrMzprk0eyQC87OXO9seAzOwAmZt7FqWsul1DC59mwNgkK','8021210','20000010'),('800130','petter','$2a$10$M90kZMExrMzprk0eyQC87OXO9seAzOwAmZt7FqWsul1DC59mwNgkK','8021210','20000020'),('800131','lucy','$2a$10$M90kZMExrMzprk0eyQC87OXO9seAzOwAmZt7FqWsul1DC59mwNgkK','8031100','30000030'),('800132','david','$2a$10$M90kZMExrMzprk0eyQC87OXO9seAzOwAmZt7FqWsul1DC59mwNgkK','8031100','30000030'),('800133','rose','$2a$10$M90kZMExrMzprk0eyQC87OXO9seAzOwAmZt7FqWsul1DC59mwNgkK','8031100','10000030');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `handoverlog`
--

DROP TABLE IF EXISTS `handoverlog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `handoverlog` (
  `h_id` int NOT NULL AUTO_INCREMENT,
  `h_out_cus_manager_id` varchar(8) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `h_in_cus_manager_id` varchar(8) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `h_cus_id` varchar(6) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `h_opp_id` varchar(8) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`h_id`),
  KEY `handoverLog_employee_emp_id_fk` (`h_out_cus_manager_id`),
  KEY `handoverLog_employee_emp_id_fk_2` (`h_in_cus_manager_id`),
  KEY `handoverLog_opportunity_opp_id_fk` (`h_opp_id`),
  KEY `handoverlog_customer_cus_id_fk` (`h_cus_id`),
  CONSTRAINT `handoverlog_customer_cus_id_fk` FOREIGN KEY (`h_cus_id`) REFERENCES `customer` (`cus_id`),
  CONSTRAINT `handoverLog_employee_emp_id_fk` FOREIGN KEY (`h_out_cus_manager_id`) REFERENCES `employee` (`emp_id`),
  CONSTRAINT `handoverLog_employee_emp_id_fk_2` FOREIGN KEY (`h_in_cus_manager_id`) REFERENCES `employee` (`emp_id`),
  CONSTRAINT `handoverLog_opportunity_opp_id_fk` FOREIGN KEY (`h_opp_id`) REFERENCES `opportunity` (`opp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `handoverlog`
--

LOCK TABLES `handoverlog` WRITE;
/*!40000 ALTER TABLE `handoverlog` DISABLE KEYS */;
INSERT INTO `handoverlog` VALUES (6,'800127','800125','800006','20210001'),(7,'800127','800125','800006','20210002'),(16,'800125','800127','800006','20210001'),(17,'800125','800127','800006','20210002'),(18,'800127','800125','800006','20210001'),(19,'800127','800125','800006','20210002'),(20,'800125','800127','800006','20210001'),(21,'800125','800127','800006','20210002');
/*!40000 ALTER TABLE `handoverlog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `opportunity`
--

DROP TABLE IF EXISTS `opportunity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `opportunity` (
  `opp_id` varchar(8) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `opp_name` varchar(80) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `opp_sales_dept` varchar(7) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `opp_customer_manager_id` varchar(8) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `opp_sign_time` datetime DEFAULT NULL,
  `opp_belonging` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `opp_status` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `opp_phase` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `opp_type` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `opp_product` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `opp_background` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `opp_cigarettes` varchar(1) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `opp_cus_id` varchar(6) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `opp_origin` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`opp_id`),
  KEY `opportunity_c_opportunity_status_opp_status_id_fk` (`opp_status`),
  KEY `opportunity_c_project_sub_opp_type_pso_id_fk` (`opp_type`),
  KEY `opportunity_department_dept_id_fk` (`opp_sales_dept`),
  KEY `opportunity_employee_emp_id_fk` (`opp_customer_manager_id`),
  KEY `opportunity_customer_cus_id_fk` (`opp_cus_id`),
  KEY `opportunity_c_product_cpro_id_fk` (`opp_product`),
  KEY `opportunity_c_bu_cbu_id_fk` (`opp_belonging`),
  KEY `opportunity_c_opp_origin_coo_id_fk` (`opp_origin`),
  CONSTRAINT `opportunity_c_bu_cbu_id_fk` FOREIGN KEY (`opp_belonging`) REFERENCES `c_bu` (`cbu_id`),
  CONSTRAINT `opportunity_c_opp_origin_coo_id_fk` FOREIGN KEY (`opp_origin`) REFERENCES `c_opp_origin` (`coo_id`),
  CONSTRAINT `opportunity_c_opportunity_status_opp_status_id_fk` FOREIGN KEY (`opp_status`) REFERENCES `c_opportunity_status` (`opp_status_id`),
  CONSTRAINT `opportunity_c_product_cpro_id_fk` FOREIGN KEY (`opp_product`) REFERENCES `c_product` (`cpro_id`),
  CONSTRAINT `opportunity_c_project_sub_opp_type_pso_id_fk` FOREIGN KEY (`opp_type`) REFERENCES `c_project_sub_opp_type` (`pso_id`),
  CONSTRAINT `opportunity_customer_cus_id_fk` FOREIGN KEY (`opp_cus_id`) REFERENCES `customer` (`cus_id`),
  CONSTRAINT `opportunity_department_dept_id_fk` FOREIGN KEY (`opp_sales_dept`) REFERENCES `department` (`dept_id`),
  CONSTRAINT `opportunity_employee_emp_id_fk` FOREIGN KEY (`opp_customer_manager_id`) REFERENCES `employee` (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `opportunity`
--

LOCK TABLES `opportunity` WRITE;
/*!40000 ALTER TABLE `opportunity` DISABLE KEYS */;
INSERT INTO `opportunity` VALUES ('20210001','CBA Opportunity No. 1','8021130','800125','2023-02-12 15:50:45','01','30','D','01','01','none','1','800006','10'),('20210002','CBA Opportunity No. 2','8021130','800125','2023-02-12 15:50:53','01','30','A','01','02',' none','1','800006','10'),('20210003','Neusoft Opportunity No. 1','8021130','800127','2023-02-12 23:50:57','02','30','D','01','01','OMG','0','800004','10'),('20210004','Huawei Opportunity No. 1','8021140','800123','2023-02-14 23:51:01','01','20','E','01','01','ffffffffff','0','800001','10'),('20210005','Oppo Opportunity No. 1','8031100','800132','2023-02-14 23:51:01','01','30','D','01','01','none','0','800010','10'),('20210006','Dell Opportunity No. 1','8031100','800132','2023-02-14 23:51:01','01','30','C','01','01','none','0','800011','10'),('20210007','test339','8021140','800123','2023-02-14 23:51:01','03','30','D','01','01','ffffffffff','0','800001','10'),('20210008','test4','8021140','800123','2023-02-14 23:51:01','03','30','C','01','01','ffffffffff','0','800001','10');
/*!40000 ALTER TABLE `opportunity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `opportunity_buffer`
--

DROP TABLE IF EXISTS `opportunity_buffer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `opportunity_buffer` (
  `oppb_id` int NOT NULL AUTO_INCREMENT,
  `oppb_name` varchar(80) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `oppb_sales_dept` varchar(7) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `oppb_customer_manager_id` varchar(8) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `oppb_sign_time` datetime DEFAULT NULL,
  `oppb_belonging` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `oppb_status` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `oppb_phase` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `oppb_type` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `oppb_product` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `oppb_background` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `oppb_cigarettes` varchar(1) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `oppb_cus_id` varchar(6) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `oppb_approve_status` varchar(1) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `oppb_opp_id` varchar(8) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `oppb_origin` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `oppb_submit_date` date DEFAULT NULL,
  PRIMARY KEY (`oppb_id`),
  KEY `opportunity_buffer_c_business_type_bus_id_fk` (`oppb_type`),
  KEY `opportunity_buffer_c_opportunity_status_opp_status_id_fk` (`oppb_status`),
  KEY `opportunity_buffer_c_product_cpro_id_fk` (`oppb_product`),
  KEY `opportunity_buffer_customer_cus_id_fk` (`oppb_cus_id`),
  KEY `opportunity_buffer_department_dept_id_fk` (`oppb_sales_dept`),
  KEY `opportunity_buffer_employee_emp_id_fk` (`oppb_customer_manager_id`),
  KEY `opportunity_buffer_c_bu_cbu_id_fk` (`oppb_belonging`),
  KEY `opportunity_buffer_c_opp_origin_coo_id_fk` (`oppb_origin`),
  CONSTRAINT `opportunity_buffer_c_bu_cbu_id_fk` FOREIGN KEY (`oppb_belonging`) REFERENCES `c_bu` (`cbu_id`),
  CONSTRAINT `opportunity_buffer_c_business_type_bus_id_fk` FOREIGN KEY (`oppb_type`) REFERENCES `c_business_type` (`bus_id`),
  CONSTRAINT `opportunity_buffer_c_opp_origin_coo_id_fk` FOREIGN KEY (`oppb_origin`) REFERENCES `c_opp_origin` (`coo_id`),
  CONSTRAINT `opportunity_buffer_c_opportunity_status_opp_status_id_fk` FOREIGN KEY (`oppb_status`) REFERENCES `c_opportunity_status` (`opp_status_id`),
  CONSTRAINT `opportunity_buffer_c_product_cpro_id_fk` FOREIGN KEY (`oppb_product`) REFERENCES `c_product` (`cpro_id`),
  CONSTRAINT `opportunity_buffer_customer_cus_id_fk` FOREIGN KEY (`oppb_cus_id`) REFERENCES `customer` (`cus_id`),
  CONSTRAINT `opportunity_buffer_department_dept_id_fk` FOREIGN KEY (`oppb_sales_dept`) REFERENCES `department` (`dept_id`),
  CONSTRAINT `opportunity_buffer_employee_emp_id_fk` FOREIGN KEY (`oppb_customer_manager_id`) REFERENCES `employee` (`emp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `opportunity_buffer`
--

LOCK TABLES `opportunity_buffer` WRITE;
/*!40000 ALTER TABLE `opportunity_buffer` DISABLE KEYS */;
INSERT INTO `opportunity_buffer` VALUES (1,'Huawei Opportunity 2','8021140','800123','2023-03-14 23:51:01','01','20','C','01','01','none','0','800001','0',NULL,'10','2021-05-19'),(2,'Huawei Opportunity 3','8021140','800123','2023-03-14 23:51:01','01','10','D','01','01','none','0','800001','0',NULL,'10','2021-05-20'),(4,'test1','8021140','800123','2023-03-14 23:51:01','01','10','A','01','01','none','0','800001','0',NULL,'10','2021-05-21'),(5,'test2','8021140','800123','2023-02-14 23:51:01','02','10','A','01','01','none','0','800001','0',NULL,'10','2021-05-22'),(6,'test3','8021140','800123','2023-03-14 23:51:01','03','20','D','01','01','ffffffffff','0','800001','1',NULL,'10','2021-07-22'),(15,'Neusoft Opportunity No. 1','8021130','800127','2023-03-14 23:51:01','01','20','E','01','01','hhhhhh','0','800004','0','20210003','10','2021-05-25'),(21,'Neusoft Opportunity No. 2','8021130','800127','2023-03-14 23:51:01','03','20','A','01','01','ppppppp','0','800004','0','20210003','10','2021-05-26'),(25,'Huawei Opportunity 6','8021140','800123','2023-03-14 23:51:01','03','20','D','01','01','ffffffffff','0','800001','0',NULL,'10','2021-07-22'),(26,'Huawei Opportunity 8','8021140','800123','2023-03-14 23:51:01','02','20','E','01','01','ffffffffff','0','800001','0',NULL,'10','2021-07-22'),(27,'Huawei Opportunity 1','8021140','800123','2023-03-14 23:51:01','02','20','D','01','01','p200','0','800001','1','20210004','10','2021-07-22');
/*!40000 ALTER TABLE `opportunity_buffer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payer`
--

DROP TABLE IF EXISTS `payer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payer` (
  `p_id` int NOT NULL AUTO_INCREMENT,
  `p_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `p_dept` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `p_position` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `p_phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `p_decision` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `p_effect` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `p_agree` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `p_opp_id` varchar(8) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`p_id`),
  KEY `payer_c_agree_degree_agree_id_fk` (`p_agree`),
  KEY `payer_c_effect_effect_id_fk` (`p_effect`),
  KEY `payer_c_payer_pay_id_fk` (`p_decision`),
  KEY `payer_opportunity_opp_id_fk` (`p_opp_id`),
  CONSTRAINT `payer_c_agree_degree_agree_id_fk` FOREIGN KEY (`p_agree`) REFERENCES `c_agree_degree` (`agree_id`),
  CONSTRAINT `payer_c_effect_effect_id_fk` FOREIGN KEY (`p_effect`) REFERENCES `c_effect` (`effect_id`),
  CONSTRAINT `payer_c_payer_pay_id_fk` FOREIGN KEY (`p_decision`) REFERENCES `c_payer` (`pay_id`),
  CONSTRAINT `payer_opportunity_opp_id_fk` FOREIGN KEY (`p_opp_id`) REFERENCES `opportunity` (`opp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payer`
--

LOCK TABLES `payer` WRITE;
/*!40000 ALTER TABLE `payer` DISABLE KEYS */;
INSERT INTO `payer` VALUES (1,'Petter','storehouse','staff','139999999','10','10','10','20210001'),(2,'Rogger','storehouse','staff','139999999','10','10','10','20210001'),(3,'Richird','IT','staff','139999999','10','10','10','20210004'),(4,'Tomas','IT','staff','139999999','10','10','10','20210004'),(8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'20210007'),(9,'test4-payer',NULL,NULL,NULL,NULL,NULL,NULL,'20210008');
/*!40000 ALTER TABLE `payer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payer_buffer`
--

DROP TABLE IF EXISTS `payer_buffer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payer_buffer` (
  `pb_id` int NOT NULL AUTO_INCREMENT,
  `pb_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `pb_dept` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `pb_position` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `pb_phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `pb_decision` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `pb_effect` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `pb_agree` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `pb_opp_id` int DEFAULT NULL,
  PRIMARY KEY (`pb_id`),
  KEY `payer_buffer_c_agree_degree_agree_id_fk` (`pb_agree`),
  KEY `payer_buffer_c_effect_effect_id_fk` (`pb_effect`),
  KEY `payer_buffer_opportunity_buffer_oppb_id_fk` (`pb_opp_id`),
  KEY `payer_buffer_c_payer_pay_id_fk` (`pb_decision`),
  CONSTRAINT `payer_buffer_c_agree_degree_agree_id_fk` FOREIGN KEY (`pb_agree`) REFERENCES `c_agree_degree` (`agree_id`),
  CONSTRAINT `payer_buffer_c_effect_effect_id_fk` FOREIGN KEY (`pb_effect`) REFERENCES `c_effect` (`effect_id`),
  CONSTRAINT `payer_buffer_c_payer_pay_id_fk` FOREIGN KEY (`pb_decision`) REFERENCES `c_payer` (`pay_id`),
  CONSTRAINT `payer_buffer_opportunity_buffer_oppb_id_fk` FOREIGN KEY (`pb_opp_id`) REFERENCES `opportunity_buffer` (`oppb_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payer_buffer`
--

LOCK TABLES `payer_buffer` WRITE;
/*!40000 ALTER TABLE `payer_buffer` DISABLE KEYS */;
INSERT INTO `payer_buffer` VALUES (1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,4),(2,NULL,NULL,NULL,NULL,NULL,NULL,NULL,5),(3,NULL,NULL,NULL,NULL,NULL,NULL,NULL,6),(6,NULL,NULL,NULL,NULL,NULL,NULL,NULL,25),(7,NULL,NULL,NULL,NULL,NULL,NULL,NULL,26);
/*!40000 ALTER TABLE `payer_buffer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sub_opportunity`
--

DROP TABLE IF EXISTS `sub_opportunity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sub_opportunity` (
  `sub_opp_id` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `sub_opp_name` varchar(80) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `sub_opp_type` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `sub_opp_product` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `sub_opp_dept` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `sub_opp_currency` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `sub_opp_money` double DEFAULT NULL,
  `sub_opp_opp_id` varchar(8) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `sub_opp_status` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`sub_opp_id`),
  KEY `sub_opportunity_c_project_sub_opp_type_pso_id_fk` (`sub_opp_type`),
  KEY `sub_opportunity_opportunity_opp_id_fk` (`sub_opp_opp_id`),
  KEY `sub_opportunity_c_bu_cbu_id_fk` (`sub_opp_dept`),
  KEY `sub_opportunity_c_product_cpro_id_fk` (`sub_opp_product`),
  KEY `sub_opportunity_c_opportunity_status_opp_status_id_fk` (`sub_opp_status`),
  CONSTRAINT `sub_opportunity_c_bu_cbu_id_fk` FOREIGN KEY (`sub_opp_dept`) REFERENCES `c_bu` (`cbu_id`),
  CONSTRAINT `sub_opportunity_c_opportunity_status_opp_status_id_fk` FOREIGN KEY (`sub_opp_status`) REFERENCES `c_opportunity_status` (`opp_status_id`),
  CONSTRAINT `sub_opportunity_c_product_cpro_id_fk` FOREIGN KEY (`sub_opp_product`) REFERENCES `c_product` (`cpro_id`),
  CONSTRAINT `sub_opportunity_c_project_sub_opp_type_pso_id_fk` FOREIGN KEY (`sub_opp_type`) REFERENCES `c_project_sub_opp_type` (`pso_id`),
  CONSTRAINT `sub_opportunity_opportunity_opp_id_fk` FOREIGN KEY (`sub_opp_opp_id`) REFERENCES `opportunity` (`opp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sub_opportunity`
--

LOCK TABLES `sub_opportunity` WRITE;
/*!40000 ALTER TABLE `sub_opportunity` DISABLE KEYS */;
INSERT INTO `sub_opportunity` VALUES ('2020000101','CBA1 Chance No. 1 - Sub Chance 1','01','01','01','CNY',5000,'20210001',NULL),('2020000102','CBA1 Chance No. 1 - Sub Chance 2','01','01','01','CNY',5000,'20210001',NULL),('2020000103','CBA1 Chance No. 1 - Sub Chance 3','01','02','02','CNY',5000,'20210001',NULL),('2020000401','Huawei Opportunity No. 1 - Sub-Opportunity 1','01','01','02','CNY',5000,'20210004',NULL),('2020000402','Huawei Opportunity No. 1 - Sub-Opportunity 2','01','01','01','CNY',5000,'20210004',NULL),('2021000700',NULL,NULL,NULL,NULL,NULL,NULL,'20210007','30'),('2021000800','test4 sub chance',NULL,NULL,NULL,NULL,NULL,'20210008','30');
/*!40000 ALTER TABLE `sub_opportunity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sub_opportunity_buffer`
--

DROP TABLE IF EXISTS `sub_opportunity_buffer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sub_opportunity_buffer` (
  `sub_oppb_id` int NOT NULL AUTO_INCREMENT,
  `sub_oppb_name` varchar(80) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `sub_oppb_type` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `sub_oppb_product` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `sub_oppb_dept` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `sub_oppb_currency` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `sub_oppb_money` double DEFAULT NULL,
  `sub_oppb_status` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `sub_oppb_opp_id` int DEFAULT NULL,
  PRIMARY KEY (`sub_oppb_id`),
  KEY `sub_opportunity_buffer_c_bu_cbu_id_fk` (`sub_oppb_dept`),
  KEY `sub_opportunity_buffer_c_opportunity_status_opp_status_id_fk` (`sub_oppb_status`),
  KEY `sub_opportunity_buffer_c_product_cpro_id_fk` (`sub_oppb_product`),
  KEY `sub_opportunity_buffer_c_project_sub_opp_type_pso_id_fk` (`sub_oppb_type`),
  KEY `sub_opportunity_buffer_opportunity_buffer_oppb_id_fk` (`sub_oppb_opp_id`),
  CONSTRAINT `sub_opportunity_buffer_c_bu_cbu_id_fk` FOREIGN KEY (`sub_oppb_dept`) REFERENCES `c_bu` (`cbu_id`),
  CONSTRAINT `sub_opportunity_buffer_c_opportunity_status_opp_status_id_fk` FOREIGN KEY (`sub_oppb_status`) REFERENCES `c_opportunity_status` (`opp_status_id`),
  CONSTRAINT `sub_opportunity_buffer_c_product_cpro_id_fk` FOREIGN KEY (`sub_oppb_product`) REFERENCES `c_product` (`cpro_id`),
  CONSTRAINT `sub_opportunity_buffer_c_project_sub_opp_type_pso_id_fk` FOREIGN KEY (`sub_oppb_type`) REFERENCES `c_project_sub_opp_type` (`pso_id`),
  CONSTRAINT `sub_opportunity_buffer_opportunity_buffer_oppb_id_fk` FOREIGN KEY (`sub_oppb_opp_id`) REFERENCES `opportunity_buffer` (`oppb_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sub_opportunity_buffer`
--

LOCK TABLES `sub_opportunity_buffer` WRITE;
/*!40000 ALTER TABLE `sub_opportunity_buffer` DISABLE KEYS */;
INSERT INTO `sub_opportunity_buffer` VALUES (1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,4),(2,NULL,NULL,NULL,NULL,NULL,NULL,NULL,5),(3,NULL,NULL,NULL,NULL,NULL,NULL,NULL,6),(6,NULL,NULL,NULL,NULL,NULL,NULL,NULL,25),(7,NULL,NULL,NULL,NULL,NULL,NULL,NULL,26);
/*!40000 ALTER TABLE `sub_opportunity_buffer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trackinglog`
--

DROP TABLE IF EXISTS `trackinglog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trackinglog` (
  `t_id` int NOT NULL AUTO_INCREMENT,
  `t_opp_id` varchar(8) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `t_type` varchar(2) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `t_date` datetime DEFAULT NULL,
  `t_our_party` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `t_cus_party` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `t_third_party` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `t_contact_way` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `t_place` varchar(40) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `t_contact_condition` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `t_contact_effect` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`t_id`),
  KEY `trackingLog_c_business_type_bus_id_fk` (`t_type`),
  KEY `trackingLog_opportunity_opp_id_fk` (`t_opp_id`),
  CONSTRAINT `trackingLog_c_business_type_bus_id_fk` FOREIGN KEY (`t_type`) REFERENCES `c_business_type` (`bus_id`),
  CONSTRAINT `trackingLog_opportunity_opp_id_fk` FOREIGN KEY (`t_opp_id`) REFERENCES `opportunity` (`opp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trackinglog`
--

LOCK TABLES `trackinglog` WRITE;
/*!40000 ALTER TABLE `trackinglog` DISABLE KEYS */;
INSERT INTO `trackinglog` VALUES (1,'20210001','01','2021-05-16 10:02:02','jim','kim','tim','cell phone','','good','good'),(2,'20210003','01','2021-05-18 10:02:09','Andy','Alex','Ajax','face to face','neusoft ridges','good','good'),(4,'20210003','01','2021-05-18 10:02:09','Billy','Emma','Howard','face to face','neu','good','good'),(5,'20210003','01','2021-05-18 10:02:09','Bob','Eureka','Hoo','face to face','neu','good','good');
/*!40000 ALTER TABLE `trackinglog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `worklog`
--

DROP TABLE IF EXISTS `worklog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `worklog` (
  `w_id` int NOT NULL AUTO_INCREMENT,
  `w_time` datetime DEFAULT NULL,
  `w_content` varchar(1024) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `w_dept_id` varchar(7) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `w_cus_mgr_id` varchar(8) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`w_id`),
  KEY `workLog_department_dept_id_fk` (`w_dept_id`),
  KEY `workLog_employee_emp_id_fk` (`w_cus_mgr_id`),
  CONSTRAINT `workLog_department_dept_id_fk` FOREIGN KEY (`w_dept_id`) REFERENCES `department` (`dept_id`),
  CONSTRAINT `workLog_employee_emp_id_fk` FOREIGN KEY (`w_cus_mgr_id`) REFERENCES `employee` (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `worklog`
--

LOCK TABLES `worklog` WRITE;
/*!40000 ALTER TABLE `worklog` DISABLE KEYS */;
/*!40000 ALTER TABLE `worklog` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-08 18:17:34
