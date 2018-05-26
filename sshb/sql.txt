CREATE TABLE `person` (
  `id` bigint(11) NOT NULL auto_increment,
  `created` bigint(255) NOT NULL,
  `username` varchar(255) NOT NULL,
   `address` varchar(255) NOT NULL,
	`phone` varchar(255) NOT NULL,
 	`remark` varchar(255) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;


https://www.cnblogs.com/xrog/p/6359706.html