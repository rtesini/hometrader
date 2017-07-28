# Xpress-money


## Requisitos
* [Apache Maven](http://maven.apache.org) 3.0 or greater
* a local MySQL server (for running locally with devserver)
* JDK 7+

## MySql Server
 * Instalar: sudo apt-get install mysql-server
 * Iniciar: (pode ser que o start de algum erro, tente o restart)
 
 ```sh
    sudo /usr/local/Cellar/mysql/5.7.17/support-files/mysql.server start
    /usr/local/Cellar/mysql/5.7.17/support-files/mysql.server restart
```
 * Executar o script "scripts/sql/start_bd.sql"
 
 * CloudSQL tutorial
 	https://cloud.google.com/appengine/docs/java/cloud-sql/

* CloudSQL - Conectar com SQuirreL 
	https://cloud.google.com/sql/docs/mysql/admin-tools#squirrel
	

## Appengine
 * Executar Local:
	`
		mvn appengine:devserver
	`
 * Deploy Dev:
	`
		mvn appengine:update
	`
 * Deploy QA:
	`
		mvn appengine:update -Dqa
	`
 * Deploy Producao:
	`
		mvn appengine:update -Dprod
	`
