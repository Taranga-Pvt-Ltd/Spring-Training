/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.1.73-community : Database - accounts
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`logindb` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `logindb`;


/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `role` */

insert  into `role`(`id`,`name`) values (1,'ROLE_USER');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(255) DEFAULT NULL,
  `lastname` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `phonenumber` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`firstname`,`lastname`,`email`,`phonenumber`,`username`,`password`) values (4,NULL,NULL,NULL,NULL,'ramyagr','$2a$11$A7dvLgUUI4JyvC92WlbeoODDp3JG5/TJPEQc8rWvqSTRvofLNkasG'),(5,'ramya','g r','ramya@gmail.com','7829096793','ramyashree','$2a$11$HpO.4UcnCxhYM3Rb3W.kDedy5G0h9EyVpuRwpi2pFU5fneMRK7AFq'),(6,'Mickey','Mouse','ramyachaitra123@gmail.com','8217062991','ramyashree123','$2a$11$u0AUI6KUTafcQyMHdml1beAgjf7Pl9NOb5hCHsgq/kH//efyl3EZq'),(7,'vjvgjvj','bvjvhj','bjhbvjh@vjvjvvhv','164648494948','username','$2a$11$d6dnTzoeaD/EDqSZPZ.co.0OC5/ThTXpq4apEGaOgsJap4gbGzps6'),(8,'yfygfyjgfymjg','jfjj','vhjvfjhgj@vjvjhv','164646+464','chgcfjhfc','$2a$11$mp27Y2I6ODBjGP/nGh4MeOUADzpgCVMV5ouYM0TkdVrenOAeB8tJ.'),(9,'prasanna','Mouse','ramyachaitra123@gmail.com','8217062991','prasanna','$2a$11$vkWrBaC8xRiltrIYCY9PVOkR0ek.Q3D2b.s3ae22cmpmZca1v5lfe'),(10,NULL,NULL,NULL,NULL,'sneha1','$2a$11$uXXhwgxWvSgJzFZwkl2nje12.9LLwKxluqnhmjKVVHb1QflEIqgSu'),(11,NULL,NULL,NULL,NULL,'chandrakala','$2a$11$ZD0ShNTTpFSHYA7wzyQ9Qe.zSmV1xAoLvN0klZVk6.3pn3zJM7RKy'),(12,'mahesh','m','mahesh@gmail.com','7829096793','mahesh','$2a$11$eblr8AZaCJ1P3Yc8RY6VIeJh2Wte4hJG983UbUuqSfVa0YuoA8ZXW'),(13,'ravikumar','g','ravi@gmail.com','78748484848','ravikumar','$2a$11$Me7JQQRW9IDeI11kTtnSZOo91HaqqxjH4FVCvp1X4kicLrMbhYUwy'),(14,'rammu','gr','ramya@gmail.com','7829096792','rammugr','$2a$11$M9cvH0KcLYgA5bx70Wi3Ae56wR2B/368Bow2f2W8UI1GhbRwThI.6'),(15,'monica','hjbjb','hbjjbjb@vghvhv','51616546416','monica123','$2a$11$6OfUAmJk/IZHY8MlP/S43uWBexzZOdh9.zPw5IKPg/7RH8k5G9tw.'),(16,'hvhvhv','jhjbjb','jbbbjh@vhvv','hjbvhjbvjb','jhbjbj','$2a$11$ffK7sqobSPG4NGzYgcsdceHJFCbRzk/vEsjLbVbLx2oqk9I/cwPom'),(17,'tyfytf','fvhjgv','hvjhv@chvfhyv','78290916','ramyapp','$2a$11$CaaRQ7oQ7iXQq6vWB43lNuDgiisOrSAEDaEwXh31VBQnRWBjigqdC');

/*Table structure for table `user_role` */

DROP TABLE IF EXISTS `user_role`;

CREATE TABLE `user_role` (
  `user_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`),
  KEY `fk_user_role_roleid_idx` (`role_id`),
  CONSTRAINT `fk_user_role_roleid` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_user_role_userid` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user_role` */

insert  into `user_role`(`user_id`,`role_id`) values (4,1),(5,1),(6,1),(7,1),(8,1),(9,1),(10,1),(11,1),(12,1),(13,1),(14,1),(15,1),(16,1),(17,1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
