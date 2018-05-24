-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.62-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema `work`
--

CREATE DATABASE IF NOT EXISTS `work`;
USE `work`;

--
-- Definition of table `acct_authority`
--

DROP TABLE IF EXISTS `acct_authority`;
CREATE TABLE `acct_authority` (
  `id` varchar(36) NOT NULL COMMENT '权限Id',
  `name` varchar(255) NOT NULL COMMENT '权限名称',
  PRIMARY KEY (`id`),
  KEY `name` (`name`),
  KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `acct_authority`
--

/*!40000 ALTER TABLE `acct_authority` DISABLE KEYS */;
INSERT INTO `acct_authority` (`id`,`name`) VALUES 
 ('b6d3ceb9-eae9-43a6-9064-424db8c53208','查看用户'),
 ('29a366b9-bbbf-47e4-a0c2-26eec58b1822','添加用户');
/*!40000 ALTER TABLE `acct_authority` ENABLE KEYS */;


--
-- Definition of table `acct_role`
--

DROP TABLE IF EXISTS `acct_role`;
CREATE TABLE `acct_role` (
  `id` varchar(36) NOT NULL COMMENT '角色Id',
  `name` varchar(255) NOT NULL COMMENT '角色名称',
  PRIMARY KEY (`id`),
  KEY `name` (`name`),
  KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `acct_role`
--

/*!40000 ALTER TABLE `acct_role` DISABLE KEYS */;
INSERT INTO `acct_role` (`id`,`name`) VALUES 
 ('b432d31d-ebd2-4e91-9184-1b3769e6686b','admin');
/*!40000 ALTER TABLE `acct_role` ENABLE KEYS */;


--
-- Definition of table `acct_role_authority`
--

DROP TABLE IF EXISTS `acct_role_authority`;
CREATE TABLE `acct_role_authority` (
  `role_id` varchar(36) NOT NULL COMMENT '角色id',
  `authority_id` varchar(36) NOT NULL COMMENT '权限id',
  PRIMARY KEY (`role_id`,`authority_id`),
  KEY `role_id` (`role_id`),
  KEY `authority_id` (`authority_id`),
  CONSTRAINT `acct_role_authority_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `acct_role` (`id`),
  CONSTRAINT `acct_role_authority_ibfk_2` FOREIGN KEY (`authority_id`) REFERENCES `acct_authority` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `acct_role_authority`
--

/*!40000 ALTER TABLE `acct_role_authority` DISABLE KEYS */;
INSERT INTO `acct_role_authority` (`role_id`,`authority_id`) VALUES 
 ('b432d31d-ebd2-4e91-9184-1b3769e6686b','29a366b9-bbbf-47e4-a0c2-26eec58b1822'),
 ('b432d31d-ebd2-4e91-9184-1b3769e6686b','b6d3ceb9-eae9-43a6-9064-424db8c53208');
/*!40000 ALTER TABLE `acct_role_authority` ENABLE KEYS */;


--
-- Definition of table `acct_user`
--

DROP TABLE IF EXISTS `acct_user`;
CREATE TABLE `acct_user` (
  `id` varchar(36) NOT NULL COMMENT '用户ID',
  `nick_name` varchar(255) NOT NULL COMMENT '昵称',
  `telephone` varchar(255) DEFAULT NULL COMMENT '电话',
  `register_time` datetime DEFAULT NULL COMMENT '注册时间',
  PRIMARY KEY (`id`),
  KEY `nick_name` (`nick_name`),
  KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `acct_user`
--

/*!40000 ALTER TABLE `acct_user` DISABLE KEYS */;
INSERT INTO `acct_user` (`id`,`nick_name`,`telephone`,`register_time`) VALUES 
 ('14ff5253-5912-4a3f-b51b-f50d9da0271d','zty','13022221111','2015-02-06 17:13:55'),
 ('6e5afb1d-50e1-45fe-b6fe-b9e399415387','andy','15147174722','2015-02-06 17:06:36');
/*!40000 ALTER TABLE `acct_user` ENABLE KEYS */;


--
-- Definition of table `acct_user_role`
--

DROP TABLE IF EXISTS `acct_user_role`;
CREATE TABLE `acct_user_role` (
  `user_id` varchar(36) NOT NULL COMMENT '用户Id',
  `role_id` varchar(36) NOT NULL COMMENT '角色Id',
  PRIMARY KEY (`user_id`,`role_id`),
  KEY `role_id` (`role_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `acct_user_role_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `acct_user` (`id`),
  CONSTRAINT `acct_user_role_ibfk_2` FOREIGN KEY (`role_id`) REFERENCES `acct_role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `acct_user_role`
--

/*!40000 ALTER TABLE `acct_user_role` DISABLE KEYS */;
INSERT INTO `acct_user_role` (`user_id`,`role_id`) VALUES 
 ('6e5afb1d-50e1-45fe-b6fe-b9e399415387','b432d31d-ebd2-4e91-9184-1b3769e6686b');
/*!40000 ALTER TABLE `acct_user_role` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
