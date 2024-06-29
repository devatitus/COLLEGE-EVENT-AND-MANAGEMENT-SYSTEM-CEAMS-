/*
SQLyog Ultimate v9.20 
MySQL - 5.0.22-community-nt : Database - events
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`events` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `events`;

/*Table structure for table `adlog` */

DROP TABLE IF EXISTS `adlog`;

CREATE TABLE `adlog` (
  `adname` varchar(100) default NULL,
  `adpass` varchar(100) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `adlog` */

insert  into `adlog`(`adname`,`adpass`) values ('admin','admin');

/*Table structure for table `evntco` */

DROP TABLE IF EXISTS `evntco`;

CREATE TABLE `evntco` (
  `evname` varchar(100) default NULL,
  `evpass` varchar(100) default NULL,
  `evphno` decimal(10,0) default NULL,
  `evmail` varchar(100) default NULL,
  `evaddr` varchar(100) default NULL,
  `evdept` varchar(100) default NULL,
  `evnm` varchar(100) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `evntco` */

insert  into `evntco`(`evname`,`evpass`,`evphno`,`evmail`,`evaddr`,`evdept`,`evnm`) values ('anbu','asdf','9876543212','axcvg2@gmail.com','chennai','ECE','Symposium');

/*Table structure for table `hodreg` */

DROP TABLE IF EXISTS `hodreg`;

CREATE TABLE `hodreg` (
  `hdname` varchar(100) default NULL,
  `hdpass` varchar(100) default NULL,
  `hdphno` decimal(10,0) default NULL,
  `hdmail` varchar(100) default NULL,
  `hdaddr` varchar(100) default NULL,
  `hddept` varchar(100) default NULL,
  `event` varchar(100) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `hodreg` */

/*Table structure for table `interstd` */

DROP TABLE IF EXISTS `interstd`;

CREATE TABLE `interstd` (
  `sno` int(10) NOT NULL auto_increment,
  `stdnm` varchar(100) NOT NULL,
  `stdreg` varchar(100) default NULL,
  `stddept` varchar(100) default NULL,
  `stdyr` varchar(100) default NULL,
  `stdclg` varchar(100) default NULL,
  `stdso` varchar(100) default NULL,
  `stdevnt` varchar(100) default NULL,
  `status` varchar(100) default 'absent',
  PRIMARY KEY  (`sno`,`stdnm`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `interstd` */

insert  into `interstd`(`sno`,`stdnm`,`stdreg`,`stddept`,`stdyr`,`stdclg`,`stdso`,`stdevnt`,`status`) values (1,'anbu','std0011','ECE','4','AKT','Symposium','Mock Interview','absent'),(2,'asdf','std002','CSE','3','ASDF','Symposium','PPt','Present');

/*Table structure for table `intrapar` */

DROP TABLE IF EXISTS `intrapar`;

CREATE TABLE `intrapar` (
  `sno` int(11) NOT NULL auto_increment,
  `stdnm` varchar(100) NOT NULL,
  `stdreg` varchar(100) default NULL,
  `stddept` varchar(100) default NULL,
  `stdyr` varchar(100) default NULL,
  `stdclg` varchar(100) default NULL,
  `stdso` varchar(100) default NULL,
  `stdevnt` varchar(100) default NULL,
  `status` varchar(100) default 'absent',
  PRIMARY KEY  (`sno`,`stdnm`),
  UNIQUE KEY `sno` (`sno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `intrapar` */

insert  into `intrapar`(`sno`,`stdnm`,`stdreg`,`stddept`,`stdyr`,`stdclg`,`stdso`,`stdevnt`,`status`) values (1,'a1','std001','ECE','3','Akt','Symposium','PPT','absent'),(2,'a2','std002','CSE','4','AWS','Symposium','PPT','absent');

/*Table structure for table `intrastd` */

DROP TABLE IF EXISTS `intrastd`;

CREATE TABLE `intrastd` (
  `sno` int(10) NOT NULL auto_increment,
  `stdnm` varchar(100) NOT NULL,
  `stdrg` varchar(100) default NULL,
  `stddept` varchar(100) default NULL,
  `stdyr` varchar(100) default NULL,
  `stdclg` varchar(100) default NULL,
  PRIMARY KEY  (`sno`,`stdnm`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `intrastd` */

insert  into `intrastd`(`sno`,`stdnm`,`stdrg`,`stddept`,`stdyr`,`stdclg`) values (1,'a1','std001','ECE','3','Akt'),(2,'a2','std002','CSE','4','XYZ'),(3,'a3','std003','EEE','2','ABC');

/*Table structure for table `prinlog` */

DROP TABLE IF EXISTS `prinlog`;

CREATE TABLE `prinlog` (
  `depname` varchar(100) default NULL,
  `deppass` varchar(100) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `prinlog` */

insert  into `prinlog`(`depname`,`deppass`) values ('principal','1234');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
