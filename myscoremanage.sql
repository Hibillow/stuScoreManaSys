/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50610
 Source Host           : localhost:3306
 Source Schema         : myscoremanage

 Target Server Type    : MySQL
 Target Server Version : 50610
 File Encoding         : 65001

 Date: 18/01/2020 17:06:57
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `psw` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, 'admin', 'admin', '21232f297a57a5a743894a0e4a801fc3');

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course_no` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `course_hour` int(11) NULL DEFAULT 0,
  `course_credit` int(1) NULL DEFAULT 0,
  `course_year` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `semester` int(11) NULL DEFAULT 0,
  `type` int(11) NULL DEFAULT 0,
  `teach_no` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0',
  `attendance_percent` float(11, 2) NULL DEFAULT NULL,
  `work_percent` float(11, 2) NULL DEFAULT NULL,
  `experiment_percent` float(11, 2) NULL DEFAULT NULL,
  `other_percent` float(11, 2) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `course_no`(`course_no`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES (1, '41ea949a49444e4c8a9564f3ffb0fa15', 'Java程序设计', 48, 5, '2019-2020', 1, 0, '201901', 30.00, 30.00, 30.00, 10.00);
INSERT INTO `course` VALUES (2, 'b5a844ba3d8746cbbda76c59d0e6fd0f', '数据结构', 48, 4, '2019-2020', 1, 0, 't0009', 30.00, 30.00, 30.00, 10.00);
INSERT INTO `course` VALUES (3, 'dada3749b8894990b87371f30d4dd0b8', '', 48, 4, '2019-2020', 2, 0, 'test_t001', NULL, NULL, NULL, NULL);
INSERT INTO `course` VALUES (4, '2019004', '数据库设计', 48, 4, '2019-2020', 1, 0, 't0009', 30.00, 30.00, 30.00, 10.00);

-- ----------------------------
-- Table structure for course_time_table
-- ----------------------------
DROP TABLE IF EXISTS `course_time_table`;
CREATE TABLE `course_time_table`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course_year` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `semester` int(11) NULL DEFAULT NULL,
  `course_no` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `week_day` int(11) NOT NULL,
  `jieci` int(11) NOT NULL,
  `address` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `teach_no` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for sclass
-- ----------------------------
DROP TABLE IF EXISTS `sclass`;
CREATE TABLE `sclass`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `class_no` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `grade` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `speciality` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sclass
-- ----------------------------
INSERT INTO `sclass` VALUES (2, '2017001', '发范德萨', '2017', '002');
INSERT INTO `sclass` VALUES (3, '2019001', '计算机2班', '2019', '002');
INSERT INTO `sclass` VALUES (4, '2019002', '计算机3班', '2018', '002');

-- ----------------------------
-- Table structure for scores
-- ----------------------------
DROP TABLE IF EXISTS `scores`;
CREATE TABLE `scores`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stuno` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `score` float(30, 1) NULL DEFAULT NULL,
  `course_no` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `attendance` float(11, 2) NULL DEFAULT NULL,
  `work` float(11, 2) NULL DEFAULT NULL,
  `experiment` float(11, 2) NULL DEFAULT NULL,
  `other` float(11, 2) NULL DEFAULT NULL,
  `class_no` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `stuno`(`stuno`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 654 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of scores
-- ----------------------------
INSERT INTO `scores` VALUES (650, '20190201', 84.1, '41ea949a49444e4c8a9564f3ffb0fa15', 89.00, 78.00, 87.00, 90.00, '2019001');
INSERT INTO `scores` VALUES (652, '2019003', 0.0, 'b5a844ba3d8746cbbda76c59d0e6fd0f', 90.00, 88.00, 78.00, 43.00, '2019002');
INSERT INTO `scores` VALUES (653, '2019003', 89.2, '2019004', 90.00, 89.00, 89.00, 89.00, '2019002');

-- ----------------------------
-- Table structure for speciality
-- ----------------------------
DROP TABLE IF EXISTS `speciality`;
CREATE TABLE `speciality`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `speciality_no` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '',
  `name` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `speciality_no`(`speciality_no`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 266 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of speciality
-- ----------------------------
INSERT INTO `speciality` VALUES (264, '001', '软件工程111');
INSERT INTO `speciality` VALUES (265, '002', '计算机');

-- ----------------------------
-- Table structure for stu
-- ----------------------------
DROP TABLE IF EXISTS `stu`;
CREATE TABLE `stu`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stuno` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '',
  `name` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `psw` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sex` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `grade` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sclass` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `speciality` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `stuno`(`stuno`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 268 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of stu
-- ----------------------------
INSERT INTO `stu` VALUES (265, '20190201', '小红', '202cb962ac59075b964b07152d234b70', '女', '2019', '2019001', '002');
INSERT INTO `stu` VALUES (267, '2019003', '张三', 'e10adc3949ba59abbe56e057f20f883e', '男', '2918', '2019002', '002');

-- ----------------------------
-- Table structure for stu_course
-- ----------------------------
DROP TABLE IF EXISTS `stu_course`;
CREATE TABLE `stu_course`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stuno` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '',
  `course_no` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `stuclass`(`stuno`, `course_no`) USING BTREE,
  INDEX `stuno`(`stuno`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `teachno` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `psw` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sex` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `teachno`(`teachno`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES (9, 'deWE', 'admin', '202cb962ac59075b964b07152d234b70', '男');
INSERT INTO `teacher` VALUES (17, 't0009', '张瑞红', 'd9b1d7db4cd6e70935368a1efb10e377', '女');
INSERT INTO `teacher` VALUES (18, 't004', 'admin', '202cb962ac59075b964b07152d234b70', '男');
INSERT INTO `teacher` VALUES (19, '11', '111', '202cb962ac59075b964b07152d234b70', '男');
INSERT INTO `teacher` VALUES (20, 'test_t001', 'morty', '202cb962ac59075b964b07152d234b70', '男');
INSERT INTO `teacher` VALUES (21, '111111', '1111', '0f28b5d49b3020afeecd95b4009adf4c', '男');
INSERT INTO `teacher` VALUES (22, '1111', '111', 'b59c67bf196a4758191e42f76670ceba', '男');
INSERT INTO `teacher` VALUES (23, '222', '222', 'bcbe3365e6ac95ea2c0343a2395834dd', '男');
INSERT INTO `teacher` VALUES (25, '121', '121', '4c56ff4ce4aaf9573aa5dff913df997a', '男');
INSERT INTO `teacher` VALUES (26, '201901', '李四', '202cb962ac59075b964b07152d234b70', '男');

-- ----------------------------
-- Procedure structure for proc_initData
-- ----------------------------
DROP PROCEDURE IF EXISTS `proc_initData`;
delimiter ;;
CREATE PROCEDURE `proc_initData`()
BEGIN
    DECLARE i INT DEFAULT 201703001;
		DECLARE LN VARCHAR(300);
    DECLARE MN VARCHAR(200);
    DECLARE FN VARCHAR(200);
		DECLARE LN_N INT;
    DECLARE MN_N INT;
    DECLARE FN_N INT;
		DECLARE TMP VARCHAR(1000);
		SET LN='李王张刘陈杨黄赵周吴徐孙朱马胡郭林何高梁郑罗宋谢唐韩曹许邓萧冯曾程蔡彭潘袁于董余苏叶吕魏蒋田杜丁沈姜范江傅钟卢汪戴崔任陆廖姚方金邱夏谭韦贾邹石熊孟秦阎薛侯雷白龙段郝孔邵史毛常万顾赖武康贺严尹钱施牛洪龚';
		SET MN='德绍宗邦裕傅家積善昌世贻维孝友继绪定呈祥大正启仕执必定仲元魁家生先泽远永盛在人为任伐风树秀文光谨潭棰';
		SET FN='丽云峰磊亮宏红洪量良梁良粮靓七旗奇琪谋牟弭米密祢磊类蕾肋庆情清青兴幸星刑';
		SET LN_N= LENGTH(LN);
		SET MN_N=LENGTH(MN);
		SET FN_N=LENGTH(FN);
    WHILE i<=201703010 DO
				SET TMP=CAST(SUBSTRING(LN,cast(RAND()*LN_N as SIGNED),1) AS CHAR);
        SET TMP=CONCAT(TMP,CAST(SUBSTRING(MN,cast(RAND()*MN_N as SIGNED) ,1) AS CHAR));
				SET TMP=CONCAT(TMP,CAST(SUBSTRING(FN,cast(RAND()*FN_N as SIGNED) ,1) AS CHAR));
        INSERT INTO stu(stuno,name,psw,sex,phone,qq) VALUES(i,TMP,'123','男','1234567890','1234567890');
        SET i = i+1;
    END WHILE;
END
;;
delimiter ;

-- ----------------------------
-- Procedure structure for proc_initDatas
-- ----------------------------
DROP PROCEDURE IF EXISTS `proc_initDatas`;
delimiter ;;
CREATE PROCEDURE `proc_initDatas`()
BEGIN
    DECLARE i INT DEFAULT 201803001;
    WHILE i<=201803010 DO
        INSERT INTO stu_sco(stuno,courseid,score,type) VALUES(i,'c007', floor(rand()*100),'已批改');
        SET i = i+1;
    END WHILE;
END
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
