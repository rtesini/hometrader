CREATE DATABASE hometrader_dbase;
CREATE USER 'hometrader'@'localhost' IDENTIFIED BY 'ht123';
GRANT ALL PRIVILEGES ON *.* TO 'xm'@'localhost' WITH GRANT OPTION;