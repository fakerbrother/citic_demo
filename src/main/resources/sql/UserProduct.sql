CREATE TABLE `user_product` (
  `id` int(13) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(33) DEFAULT NULL COMMENT '商品名称',
  `user_id` int(3) DEFAULT NULL COMMENT 'userId',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8