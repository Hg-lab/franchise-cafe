CREATE DATABASE `franchise-cafe` DEFAULT CHARACTER SET UTF8;

create user 'cafe-admin'@localhost identified by 'admin';
create user 'cafe-admin'@'%' identified by 'admin';

GRANT ALL PRIVILEGES ON `franchise-cafe`.* TO 'cafe-admin'@'localhost';
FLUSH PRIVILEGES;


mysql -u cafe-admin -p
USE study_db;