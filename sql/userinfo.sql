/*
Navicat MySQL Data Transfer

Source Server         : qianfeng
Source Server Version : 50640
Source Host           : localhost:3306
Source Database       : demo1

Target Server Type    : MYSQL
Target Server Version : 50640
File Encoding         : 65001

Date: 2019-06-17 17:49:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `userinfo`
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `USERID` int(11) NOT NULL AUTO_INCREMENT,
  `USERNAME` varchar(32) DEFAULT NULL,
  `PASSWORD` varchar(32) DEFAULT NULL,
  `REGEMAIL` varchar(100) DEFAULT NULL COMMENT '注册邮箱',
  `MOBILE` varchar(15) DEFAULT NULL,
  `ICON` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`USERID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='用户信息表';

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES ('1', 'zhangzhantu', 'c882bb01acdf30c5f7ba19c532731f6a', 'zhangzhantu@163.com', '13312344321', null);
INSERT INTO `userinfo` VALUES ('2', 'kechengyue', 'c882bb01acdf30c5f7ba19c532731f6a', 'kechengyue@163.com', '18887654321', null);
INSERT INTO `userinfo` VALUES ('3', 'baimeng', 'c882bb01acdf30c5f7ba19c532731f6a', 'baimengle@hotmail.com', '18665432198', null);
INSERT INTO `userinfo` VALUES ('4', 'zhangyang', 'c882bb01acdf30c5f7ba19c532731f6a', 'zhangyang@163.com', '13676543211', null);
INSERT INTO `userinfo` VALUES ('5', 'liuqiyu', 'c882bb01acdf30c5f7ba19c532731f6a', 'liuqiyu@hotmail.com', '13888881111', null);
INSERT INTO `userinfo` VALUES ('6', 'maying', 'c882bb01acdf30c5f7ba19c532731f6a', 'maying@163.com', '18777778888', null);
INSERT INTO `userinfo` VALUES ('7', 'laiyongli', 'c882bb01acdf30c5f7ba19c532731f6a', 'laiyongli@163.com', '13344556677', null);
INSERT INTO `userinfo` VALUES ('8', 'yuanjiongyang', 'c882bb01acdf30c5f7ba19c532731f6a', 'yuanjiongyang@163.com', '13388776655', null);
INSERT INTO `userinfo` VALUES ('9', 'zhangsan', '123456', '123456@qq.com', '18811224455', null);
