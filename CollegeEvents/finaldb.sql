windecl/*
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

/*Table structure for table `certificate` */

DROP TABLE IF EXISTS `certificate`;

CREATE TABLE `certificate` (
  `sno` int(10) NOT NULL auto_increment,
  `deptnm` varchar(100) default NULL,
  `filename` varchar(500) default NULL,
  PRIMARY KEY  (`sno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `certificate` */

insert  into `certificate`(`sno`,`deptnm`,`filename`) values (1,'ECE','cer22.docx');

/*Table structure for table `certupd` */

DROP TABLE IF EXISTS `certupd`;

CREATE TABLE `certupd` (
  `sno` int(10) NOT NULL auto_increment,
  `deptnm` varchar(100) default NULL,
  `filename` varchar(100) default NULL,
  PRIMARY KEY  (`sno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `certupd` */

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
  
  `hdphno` varchar(100) default NULL,
  `hdmail` varchar(100) default NULL,
  `hdaddr` varchar(100) default NULL,
  `hddept` varchar(100) default NULL
  
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `hodreg` */

insert  into `hodreg`(`hdname`,`hdpass`,`hdphno`,`hdmail`,`hdaddr`,`hddept`) values ('hod1','asdf','34567892','asdd@gmail.com','chennai','BCA');hodreg

/*Table structure for table `intrapar` */

DROP TABLE IF EXISTS `intrapar`;

CREATE TABLE `intrapar` (
  `sno` int(11) NOT NULL auto_increment,
  `stdnm` varchar(100) NOT NULL,
  `stdreg` varchar(100) default NULL,
  `stddept` varchar(100) default NULL,
  `stdem` varchar(100) default NULL,
  `stdyr` varchar(100) default NULL,
  `stdclg` varchar(100) default NULL,
  `stdso` varchar(100) default NULL,
  `stdevnt` varchar(100) default NULL,
  `status` varchar(100) default 'absent',
  PRIMARY KEY  (`sno`,`stdnm`),
  UNIQUE KEY `sno` (`sno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `intrapar` */

insert  into `intrapar`(`sno`,`stdnm`,`stdreg`,`stddept`,`stdem`,`stdyr`,`stdclg`,`stdso`,`stdevnt`,`status`) values (1,'deva','212000662','BCA','deva007@gmail.com','2023','st.joseph college','Symposium','PPT','Present');


/*Table structure for table `intrastd` */

DROP TABLE IF EXISTS intrastd;

CREATE TABLE `intrastd` (
  `sno` int(10) NOT NULL auto_increment,
  `stdnm` varchar(100) NOT NULL,
  `stdrg` varchar(100) default NULL,
  `stddept` varchar(100) default NULL,
  `stdem` varchar(100) default NULL,
  `stdyr` varchar(100) default NULL,
  `stdclg` varchar(100) default NULL,
  PRIMARY KEY  (`sno`,`stdnm`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `intrastd` */

insert  into `intrastd`(`sno`,`stdnm`,`stdrg`,`stddept`,`stdem`,`stdyr`,`stdclg`) values (1,'anbuu','std001','ECE','chennai.java@pantechmail.com','3','Akt');

/*Table structure for table `prinlog` */

DROP TABLE IF EXISTS `prinlog`;

CREATE TABLE `prinlog` (
  `depname` varchar(100) default NULL,
  `deppass` varchar(100) default NULL,
  `depphno` varchar(100) default NULL,
  `depmail` varchar(100) default NULL,
  `depaddr` varchar(100) default NULL,
  `depnm` varchar(100) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `prinlog` */

insert  into `prinlog`(`depname`,`deppass`,`depphno`,`depmail`,`depaddr`,`depnm`) values ('principal','1234','234567891','principal@gmail.com','chennai','bca');

/*Table structure for table `windecl` */

DROP TABLE IF EXISTS `windecl`;

CREATE TABLE `windecl` (
  `sno` int(10) NOT NULL auto_increment,
  `stdnm` varchar(100) default NULL,
  `winrun` varchar(100) default NULL,
  `evnt` varchar(100) default NULL,
  `typen` varchar(100) default NULL,
  `hstatus` varchar(100) default 'pending',
  `pstatus` varchar(100) default 'pending',
  `sele` varchar(100) default 'pending',

  PRIMARY KEY  (`sno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `windecl` */
insert  into `windecl`(`sno`,`stdnm`,`winrun`,`evnt`,`typen`,`hstatus`,`pstatus`,`sele`) values 
(1,'std001','Winner','Symposium','PPT','Approved','Approved','pendingintrastdintrapar');


/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
