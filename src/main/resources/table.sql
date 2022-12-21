-- cloud_config_db.properties definition

CREATE TABLE `properties` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_on` date NOT NULL,
  `application` varchar(255) NOT NULL,
  `profile` varchar(255) NOT NULL,
  `prop_key` varchar(255) NOT NULL,
  `value` varchar(255) NOT NULL,
  `label` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=436 DEFAULT CHARSET=latin1;