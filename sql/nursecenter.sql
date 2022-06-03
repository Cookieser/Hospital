/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.19 : Database - nursecenter
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`nursecenter` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

USE `nursecenter`;

/*Table structure for table `accommodation` */

DROP TABLE IF EXISTS `accommodation`;

CREATE TABLE `accommodation` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Start_time` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `End_time` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `bed_id` int(11) DEFAULT NULL,
  `principal` int(11) DEFAULT NULL,
  `operate_time` date DEFAULT NULL,
  `Delmark` int(11) DEFAULT NULL,
  `remarks` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `principal` (`principal`),
  CONSTRAINT `principal` FOREIGN KEY (`principal`) REFERENCES `doctor_chart` (`principal`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `accommodation` */

insert  into `accommodation`(`ID`,`Start_time`,`End_time`,`bed_id`,`principal`,`operate_time`,`Delmark`,`remarks`) values (1,'2020/1/30','2020/1/23',10,3,'2019-01-03',1,NULL),(2,'2020/5/6','2020/6/6',3,2,'2015-01-02',1,NULL),(3,'2021/4/9','2021/4/10',45,2,'2012-01-02',1,NULL),(4,'2021/6/9','2021/6/16',37,3,'2016-01-02',1,NULL),(5,'2021/6/26','2021/8/2',58,1,'2018-01-02',1,NULL),(6,'2020/1/2','2020/1/22',1,2,'2019-01-02',1,NULL),(7,'2020/1/2','2020/1/22',1,2,'2019-01-02',1,NULL);

/*Table structure for table `answer` */

DROP TABLE IF EXISTS `answer`;

CREATE TABLE `answer` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增长类型',
  `QuestionID` int(11) DEFAULT NULL,
  `Content` varchar(64) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `Delmark` int(11) DEFAULT NULL COMMENT '0-已删除;1-正常',
  `User_ID` int(11) DEFAULT NULL,
  `remarks` varchar(256) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `answer` (`QuestionID`),
  KEY `User_ID` (`User_ID`),
  CONSTRAINT `QuestionID` FOREIGN KEY (`QuestionID`) REFERENCES `question` (`ID`),
  CONSTRAINT `User_ID` FOREIGN KEY (`User_ID`) REFERENCES `patient` (`User_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `answer` */

insert  into `answer`(`ID`,`QuestionID`,`Content`,`Delmark`,`User_ID`,`remarks`) values (1,10,'腰酸背痛，需要日常中医药护理',1,2,NULL),(2,10,'需要进行腿部肌肉日常康复训练',1,3,NULL),(3,3,'子女满堂，经常探望',1,3,NULL),(4,4,'子女满堂，经常探望',1,4,NULL),(5,5,'没有突发疾病，偶尔心绞痛',1,1,NULL);

/*Table structure for table `bed` */

DROP TABLE IF EXISTS `bed`;

CREATE TABLE `bed` (
  `ID` int(20) NOT NULL AUTO_INCREMENT COMMENT '自增长类型',
  `Bed_Number` int(11) DEFAULT NULL,
  `State` int(11) DEFAULT NULL COMMENT '0为无人；1为有人',
  `Room_ID` int(20) DEFAULT NULL,
  `Room_Clean` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `Delmark` int(11) DEFAULT NULL COMMENT '0为已删除；1为正常',
  `remarks` varchar(256) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `room` (`Room_ID`),
  CONSTRAINT `room` FOREIGN KEY (`Room_ID`) REFERENCES `room` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf16;

/*Data for the table `bed` */

insert  into `bed`(`ID`,`Bed_Number`,`State`,`Room_ID`,`Room_Clean`,`Delmark`,`remarks`) values (1,12021,0,2,'2022/6/1',1,NULL),(2,12022,1,2,'2022/6/2',1,NULL),(3,12043,1,3,'2022/6/3',1,NULL),(4,22036,0,4,'2022/6/4',1,NULL),(5,22052,1,5,'2022/6/5',1,NULL),(6,12041,1,6,'2022/5/29',1,NULL),(7,12042,1,7,'2022/5/30',1,NULL),(8,12043,1,2,'2022/5/31',1,NULL);

/*Table structure for table `doctor_chart` */

DROP TABLE IF EXISTS `doctor_chart`;

CREATE TABLE `doctor_chart` (
  `principal` int(11) NOT NULL AUTO_INCREMENT,
  `doctor_num` int(11) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `work_year` varchar(20) DEFAULT NULL,
  `Account` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `birthday` varchar(20) DEFAULT NULL,
  `Title` varchar(20) DEFAULT NULL,
  `department` varchar(20) DEFAULT NULL,
  `Delmark` varchar(1) DEFAULT NULL,
  `remarks` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`principal`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `doctor_chart` */

insert  into `doctor_chart`(`principal`,`doctor_num`,`name`,`age`,`work_year`,`Account`,`password`,`gender`,`birthday`,`Title`,`department`,`Delmark`,`remarks`) values (1,125,'王普普',34,'10','cookies','679543','女','1988/8/5','护士','内科','1',NULL),(2,246,'卢晓晶',43,'15','xiaoxiao','492873','女','1979/6/8','护士','内科','1',NULL),(3,576,'齐豪',32,'9','qihao','240250','中','1990/10/18','医生','外科','1',NULL),(4,580,'陈大大',35,'11','dada','537468','女','1987/12/1','医生','外科','1',NULL),(5,325,'张正湘',57,'29','zhengxiang','493756','男','1965/3/30','护士','外科','1',NULL),(6,254,'卓英',39,'6','ying','785375','女','1983/6/21','医生','外科','1',NULL),(7,511,'刘衡',58,'30','heng','900546','男','1964/9/10','护士','外科','1',NULL);

/*Table structure for table `patient` */

DROP TABLE IF EXISTS `patient`;

CREATE TABLE `patient` (
  `User_ID` int(11) NOT NULL AUTO_INCREMENT,
  `patient_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `gender` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `principal` int(11) DEFAULT NULL,
  `load_time` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `Idcard` varchar(18) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `home_address` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `Account` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `Password` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `Delmark` int(11) DEFAULT NULL,
  `remarks` varchar(256) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`User_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `patient` */

insert  into `patient`(`User_ID`,`patient_name`,`gender`,`principal`,`load_time`,`Idcard`,`home_address`,`phone`,`Account`,`Password`,`Delmark`,`remarks`) values (1,'李欣欣','男',2,'2019/1/1','130925199106132623','河南省沧州市盐山县','14176507215','xinrei','135984',0,NULL),(2,'齐小豪','女',2,'2015/1/2','360428197205147527','江西省九江市都昌县','17890346177','xiaohao','946284',1,NULL),(3,'雷凡凡','男',3,'2012/1/2','350322197801261718','福建省莆田市仙游县','19340038054','fanfan','246891',1,NULL),(4,'吴天天','女',3,'2016/1/2','44172119720310362X','广东省阳江市阳西县','18120244613','tiantian','324235',1,NULL),(5,'陈达达','女',3,'2018/1/2','510623198601073613','四川省德阳市中江县','18379413070','dada','435788',1,NULL);

/*Table structure for table `question` */

DROP TABLE IF EXISTS `question`;

CREATE TABLE `question` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增长类型',
  `Title` varchar(64) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `DelMark` int(11) DEFAULT NULL COMMENT '0-已删除；1-正常',
  `Module_Name` int(11) DEFAULT NULL COMMENT '1为养老;2为疗养;3为轻型残疾;4为严重残疾',
  `remarks` varchar(256) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `question` */

insert  into `question`(`ID`,`Title`,`DelMark`,`Module_Name`,`remarks`) values (1,'您的问题是位于哪一部位？',1,0,NULL),(2,'您是否存在行动障碍？',1,0,NULL),(3,'您的子女是否经常探望？',1,0,NULL),(4,'您是否存在慢性病？',1,0,NULL),(5,'您是否患有突发疾病？',1,0,NULL),(6,'您是否有家族遗传病',1,0,NULL),(7,'您是否拥有残疾证',1,0,NULL),(8,'您是否拥有基本的自理能力',1,0,NULL),(9,'您是否拥有精神疾病',1,1,NULL),(10,'您是否需要心理干预',1,1,NULL);

/*Table structure for table `rare_equipment_management_table` */

DROP TABLE IF EXISTS `rare_equipment_management_table`;

CREATE TABLE `rare_equipment_management_table` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'auto_increment',
  `equipment_name` varchar(16) DEFAULT NULL,
  `equipment_type` varchar(16) DEFAULT NULL,
  `in_use` int(11) DEFAULT NULL COMMENT '0-nonuse;1-in_use',
  `Delmark` int(11) DEFAULT NULL COMMENT '0-delete;1-normal',
  `Room_ID` int(20) NOT NULL,
  `remarks` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `roomid` (`Room_ID`),
  CONSTRAINT `roomid` FOREIGN KEY (`Room_ID`) REFERENCES `room` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `rare_equipment_management_table` */

insert  into `rare_equipment_management_table`(`ID`,`equipment_name`,`equipment_type`,`in_use`,`Delmark`,`Room_ID`,`remarks`) values (1,'呼吸机','医疗型',1,1,4,NULL),(2,'呼吸机','医疗型',0,1,1,NULL),(3,'麻将桌','娱乐型',0,1,2,NULL),(4,'麻将桌','娱乐型',0,1,3,NULL),(5,'心电图机','医疗型',0,1,5,NULL),(6,'心电图机','医疗型',0,1,6,NULL),(7,'血压仪','医疗型',0,1,7,NULL),(8,'血压仪','医疗型',0,1,5,NULL),(9,'血压仪','医疗型',0,1,5,NULL);

/*Table structure for table `rare_equipment_use_table` */

DROP TABLE IF EXISTS `rare_equipment_use_table`;

CREATE TABLE `rare_equipment_use_table` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'auto_increment',
  `Start_time` varchar(20) DEFAULT NULL,
  `End_time` varchar(20) DEFAULT NULL,
  `user_ID` int(11) DEFAULT NULL,
  `Delmark` int(11) DEFAULT NULL,
  `remarks` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `In_use` (`user_ID`),
  CONSTRAINT `In_use` FOREIGN KEY (`user_ID`) REFERENCES `patient` (`User_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `rare_equipment_use_table` */

insert  into `rare_equipment_use_table`(`ID`,`Start_time`,`End_time`,`user_ID`,`Delmark`,`remarks`) values (1,'2022-6-1','2022-6-11',1,1,NULL),(2,'2022-6-2','2022-6-3',2,1,NULL),(3,'2022-6-3','2022-6-6',3,1,NULL),(4,'2022-6-4','2022-6-9',4,1,NULL),(5,'2022-6-5','2022-6-6',2,1,NULL),(6,'2022-6-6','2022-6-30',1,1,NULL),(7,'2022-6-1','2022-6-11',1,1,NULL);

/*Table structure for table `room` */

DROP TABLE IF EXISTS `room`;

CREATE TABLE `room` (
  `ID` int(20) NOT NULL AUTO_INCREMENT COMMENT '自增长类型',
  `Type` int(11) DEFAULT NULL COMMENT '1为普通护理房间；2为特殊护理房间；3为娱乐室；4为设备室',
  `Max` int(11) DEFAULT NULL,
  `Remark` varchar(64) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `department` int(11) DEFAULT NULL COMMENT '0为内科；1为外科；2为棋牌与戏曲放映；3为_；4为器械设备间',
  `Room_ID` int(20) NOT NULL,
  `principal` int(11) DEFAULT NULL,
  `Delmark` int(11) DEFAULT NULL COMMENT '0为已删除；1为正常',
  `remarkS` varchar(256) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `principal` (`principal`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `room` */

insert  into `room`(`ID`,`Type`,`Max`,`Remark`,`department`,`Room_ID`,`principal`,`Delmark`,`remarkS`) values (1,1,4,'阳面靠近楼梯',3,1201,5,0,NULL),(2,1,4,'阴面靠近楼梯',3,1202,7,1,NULL),(3,1,3,'阳面有卫浴',3,1204,2,1,NULL),(4,2,1,'阴面',0,1200,1,1,NULL),(5,2,2,'阴面',1,2205,3,1,NULL),(6,3,10,'阳面拐角',2,3101,6,1,NULL),(7,4,10,'阴面朝南',4,4101,4,1,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
