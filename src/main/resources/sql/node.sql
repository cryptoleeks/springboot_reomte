/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50643
Source Host           : localhost:3306
Source Database       : iprecord

Target Server Type    : MYSQL
Target Server Version : 50643
File Encoding         : 65001

Date: 2019-06-16 14:32:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `node`
-- ----------------------------
DROP TABLE IF EXISTS `node`;
CREATE TABLE `node` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pnode` varchar(255) DEFAULT NULL,
  `snode` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=391 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of node
-- ----------------------------
INSERT INTO `node` VALUES ('262', 'a1', null);
INSERT INTO `node` VALUES ('263', 'a2', null);
INSERT INTO `node` VALUES ('264', 'a3', null);
INSERT INTO `node` VALUES ('265', 'a4', null);
INSERT INTO `node` VALUES ('266', 'a5', null);
INSERT INTO `node` VALUES ('267', 'a6', null);
INSERT INTO `node` VALUES ('268', 'a7', null);
INSERT INTO `node` VALUES ('269', 'a8', null);
INSERT INTO `node` VALUES ('270', 'a9', null);
INSERT INTO `node` VALUES ('271', 'a10', null);
INSERT INTO `node` VALUES ('272', 'a11', null);
INSERT INTO `node` VALUES ('273', 'a12', null);
INSERT INTO `node` VALUES ('274', 'a13', null);
INSERT INTO `node` VALUES ('275', 'a14', null);
INSERT INTO `node` VALUES ('276', 'a15', null);
INSERT INTO `node` VALUES ('277', 'a16', null);
INSERT INTO `node` VALUES ('278', 'a17', null);
INSERT INTO `node` VALUES ('279', 'a18', null);
INSERT INTO `node` VALUES ('280', 'a19', null);
INSERT INTO `node` VALUES ('281', 'a20', null);
INSERT INTO `node` VALUES ('282', 'a21', null);
INSERT INTO `node` VALUES ('283', 'a22', null);
INSERT INTO `node` VALUES ('284', 'a23', null);
INSERT INTO `node` VALUES ('285', 'a24', null);
INSERT INTO `node` VALUES ('286', 'a25', null);
INSERT INTO `node` VALUES ('287', 'a26', null);
INSERT INTO `node` VALUES ('288', 'a27', null);
INSERT INTO `node` VALUES ('289', 'a28', null);
INSERT INTO `node` VALUES ('290', 'a29', null);
INSERT INTO `node` VALUES ('291', 'a30', null);
INSERT INTO `node` VALUES ('292', 'a31', null);
INSERT INTO `node` VALUES ('293', 'a32', null);
INSERT INTO `node` VALUES ('294', 'a33', null);
INSERT INTO `node` VALUES ('295', 'a34', null);
INSERT INTO `node` VALUES ('296', 'a35', null);
INSERT INTO `node` VALUES ('297', 'a36', null);
INSERT INTO `node` VALUES ('298', 'a37', null);
INSERT INTO `node` VALUES ('299', 'a38', null);
INSERT INTO `node` VALUES ('300', 'a39', null);
INSERT INTO `node` VALUES ('301', 'a40', null);
INSERT INTO `node` VALUES ('302', 'a41', null);
INSERT INTO `node` VALUES ('303', 'a42', null);
INSERT INTO `node` VALUES ('304', 'a43', null);
INSERT INTO `node` VALUES ('305', 'a44', null);
INSERT INTO `node` VALUES ('306', 'a45', null);
INSERT INTO `node` VALUES ('307', 'a46', null);
INSERT INTO `node` VALUES ('308', 'a47', null);
INSERT INTO `node` VALUES ('309', 'a48', null);
INSERT INTO `node` VALUES ('310', 'a49', null);
INSERT INTO `node` VALUES ('311', 'a50', null);
INSERT INTO `node` VALUES ('312', 'a51', null);
INSERT INTO `node` VALUES ('313', 'a52', null);
INSERT INTO `node` VALUES ('314', 'a53', null);
INSERT INTO `node` VALUES ('315', 'a54', null);
INSERT INTO `node` VALUES ('316', 'a55', null);
INSERT INTO `node` VALUES ('317', 'a56', null);
INSERT INTO `node` VALUES ('318', 'a57', null);
INSERT INTO `node` VALUES ('319', 'a58', null);
INSERT INTO `node` VALUES ('320', 'a59', null);
INSERT INTO `node` VALUES ('321', 'a60', null);
INSERT INTO `node` VALUES ('322', 'a61', null);
INSERT INTO `node` VALUES ('323', 'a19', 'a58');
INSERT INTO `node` VALUES ('324', 'a2', 'a9');
INSERT INTO `node` VALUES ('325', 'a17', 'a54');
INSERT INTO `node` VALUES ('326', 'a19', 'a18');
INSERT INTO `node` VALUES ('327', 'a56', 'a45');
INSERT INTO `node` VALUES ('328', 'a28', 'a1');
INSERT INTO `node` VALUES ('329', 'a44', 'a61');
INSERT INTO `node` VALUES ('330', 'a48', 'a1');
INSERT INTO `node` VALUES ('331', 'a54', 'a32');
INSERT INTO `node` VALUES ('332', 'a35', 'a25');
INSERT INTO `node` VALUES ('333', 'a22', 'a33');
INSERT INTO `node` VALUES ('334', 'a9', 'a6');
INSERT INTO `node` VALUES ('335', 'a36', 'a5');
INSERT INTO `node` VALUES ('336', 'a34', 'a43');
INSERT INTO `node` VALUES ('337', 'a35', 'a51');
INSERT INTO `node` VALUES ('338', 'a52', 'a13');
INSERT INTO `node` VALUES ('339', 'a20', 'a10');
INSERT INTO `node` VALUES ('340', 'a51', 'a6');
INSERT INTO `node` VALUES ('341', 'a30', 'a31');
INSERT INTO `node` VALUES ('342', 'a1', 'a28');
INSERT INTO `node` VALUES ('343', 'a49', 'a26');
INSERT INTO `node` VALUES ('344', 'a50', 'a53');
INSERT INTO `node` VALUES ('345', 'a16', 'a37');
INSERT INTO `node` VALUES ('346', 'a6', 'a9');
INSERT INTO `node` VALUES ('347', 'a49', 'a23');
INSERT INTO `node` VALUES ('348', 'a39', 'a29');
INSERT INTO `node` VALUES ('349', 'a46', 'a41');
INSERT INTO `node` VALUES ('350', 'a25', 'a43');
INSERT INTO `node` VALUES ('351', 'a42', 'a50');
INSERT INTO `node` VALUES ('352', 'a15', 'a28');
INSERT INTO `node` VALUES ('353', 'a52', 'a23');
INSERT INTO `node` VALUES ('354', 'a42', 'a5');
INSERT INTO `node` VALUES ('355', 'a24', 'a46');
INSERT INTO `node` VALUES ('356', 'a61', 'a27');
INSERT INTO `node` VALUES ('357', 'a32', 'a54');
INSERT INTO `node` VALUES ('358', 'a9', 'a47');
INSERT INTO `node` VALUES ('359', 'a40', 'a26');
INSERT INTO `node` VALUES ('360', 'a59', 'a10');
INSERT INTO `node` VALUES ('361', 'a45', 'a60');
INSERT INTO `node` VALUES ('362', 'a1', 'a3');
INSERT INTO `node` VALUES ('363', 'a58', 'a41');
INSERT INTO `node` VALUES ('364', 'a27', 'a55');
INSERT INTO `node` VALUES ('365', 'a57', 'a2');
INSERT INTO `node` VALUES ('366', 'a40', 'a7');
INSERT INTO `node` VALUES ('367', 'a12', 'a55');
INSERT INTO `node` VALUES ('368', 'a21', 'a8');
INSERT INTO `node` VALUES ('369', 'a34', 'a33');
INSERT INTO `node` VALUES ('370', 'a55', 'a45');
INSERT INTO `node` VALUES ('371', 'a36', 'a4');
INSERT INTO `node` VALUES ('372', 'a3', 'a15');
INSERT INTO `node` VALUES ('373', 'a44', 'a27');
INSERT INTO `node` VALUES ('374', 'a7', 'a17');
INSERT INTO `node` VALUES ('375', 'a48', 'a61');
INSERT INTO `node` VALUES ('376', 'a11', 'a56');
INSERT INTO `node` VALUES ('377', 'a22', 'a8');
INSERT INTO `node` VALUES ('378', 'a3', 'a47');
INSERT INTO `node` VALUES ('379', 'a32', 'a4');
INSERT INTO `node` VALUES ('380', 'a13', 'a29');
INSERT INTO `node` VALUES ('381', 'a7', 'a40');
INSERT INTO `node` VALUES ('382', 'a31', 'a38');
INSERT INTO `node` VALUES ('383', 'a37', 'a30');
INSERT INTO `node` VALUES ('384', 'a54', 'a59');
INSERT INTO `node` VALUES ('385', 'a31', 'a30');
INSERT INTO `node` VALUES ('386', 'a61', 'a1');
INSERT INTO `node` VALUES ('387', 'a14', 'a53');
INSERT INTO `node` VALUES ('388', 'a38', 'a9');
INSERT INTO `node` VALUES ('389', 'a12', 'a60');
INSERT INTO `node` VALUES ('390', 'a20', 'a18');

-- ----------------------------
-- Table structure for `t_userrecord`
-- ----------------------------
DROP TABLE IF EXISTS `t_userrecord`;
CREATE TABLE `t_userrecord` (
  `ip` varchar(255) NOT NULL,
  `record` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ip`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_userrecord
-- ----------------------------
INSERT INTO `t_userrecord` VALUES ('0:0:0:0:0:0:0:1', 'React-Native||Flux||友盟指数');
INSERT INTO `t_userrecord` VALUES ('127.0.0.1', '111');
INSERT INTO `t_userrecord` VALUES ('192.168.18.1', 'Javascript 编码规约');
INSERT INTO `t_userrecord` VALUES ('192.168.18.2', 'AngularJS||issues||Slim||git 基础||svn教程||Modernizr||123');
