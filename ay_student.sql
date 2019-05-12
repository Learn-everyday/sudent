/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.5.28 : Database - ay
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ay` /*!40100 DEFAULT CHARACTER SET gbk */;

USE `ay`;

/*Table structure for table `student_test` */

DROP TABLE IF EXISTS `student_test`;

CREATE TABLE `student_test` (
  `id` int(200) NOT NULL,
  `name` varchar(200) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `gender` int(200) DEFAULT NULL,
  `age` int(200) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `salary` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

/*Data for the table `student_test` */

insert  into `student_test`(`id`,`name`,`email`,`gender`,`age`,`birthday`,`salary`) values (1,'wn','111@qq.com',1,1,'2019-05-11 14:24:26',100),(2,'lc','222@qq.com',2,2,'2019-05-17 14:24:57',200),(3,'kkk',NULL,6,NULL,NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
