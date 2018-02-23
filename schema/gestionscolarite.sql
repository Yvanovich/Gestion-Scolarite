/*
SQLyog Ultimate v11.5 (64 bit)
MySQL - 5.5.50 : Database - gestionscolarite
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`gestionscolarite` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `gestionscolarite`;

/*Table structure for table `etudiant` */

DROP TABLE IF EXISTS `etudiant`;

CREATE TABLE `etudiant` (
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  `classe` varchar(15) NOT NULL,
  `age` int(3) NOT NULL,
  `sexe` varchar(10) NOT NULL,
  `dateDeNaissance` varchar(20) NOT NULL,
  `numero` int(15) DEFAULT NULL,
  `tuteur` varchar(30) DEFAULT NULL,
  `tuteurnum` int(15) DEFAULT NULL,
  `addresse` varchar(20) NOT NULL,
  `matricule` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `etudiant` */

insert  into `etudiant`(`nom`,`prenom`,`classe`,`age`,`sexe`,`dateDeNaissance`,`numero`,`tuteur`,`tuteurnum`,`addresse`,`matricule`) values ('Kyo','Kusanagi','Upper Sixth',19,'Male','12/06/1998',678784350,'Ryusaki',678784368,'Mendong','AZ12E3'),('Yugi','Kuza','Form Five',15,'Male','05/04/2002',697412367,'Hinata',678784368,'Biyem assi','QS12D4'),('Ino','Amane','Lower Sixth',18,'Female','18/07/1999',678777850,'Mikasa',676684324,'Nsimeyong','WX78C2'),('Sakura','Oichi','Upper Sixth',18,'Female','15/01/1999',222489843,'Sora',333864299,'TQC','ER89T7');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
