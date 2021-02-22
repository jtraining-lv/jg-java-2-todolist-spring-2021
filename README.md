# javaguru-java-2-todolist

This is project with AppStart

# mysql dockeer image
mysql requires image

build docker image

```bash
docker build --tag javaguru-mysql .

# if requiree list images
docker image ls 
# or removee imagee
docker image rm my-prepopulated-image

docker run -d -p 3306:3306 --name javaguru-mysql \
-e MYSQL_ROOT_PASSWORD=root javaguru-mysql

docker exec -it javaguru-mysql bash
root@c86ff80d7524:/# mysql -uroot -p
Enter password: (root)
mysql> show databases;

show databases;

use todolist;

show tables;
```

in application.properties

- change hibernate.hbm2ddl.auto=validate -> create to allow automatic creation of missing columns in database (forward eengineering)

cheeck documentationm

```
Possible values of the property hibernate.hbm2ddl.auto
You can specify one of the following values for the hibernate.hbm2ddl.auto property:
create: let Hibernate creates tables according to the mapped entity classes. Hibernate attempts to drop the tables if exist. S0o use this value when you want to create the database for the first time. If you use it in the 2nd time, previous data will be lost.
create-drop: use this value if you want Hibernate to create tables and then drop them when the session ends. This value is suitable for running unit tests on a temporary database or in-memory database, without the need to keep data.
update: use this value in case you want to apply changes in the entity classes into the database, e.g. adding new columns to an existing table, or create additional tables from new entity classes. Note that Hibernate won’t alter the tables if you change only attributes of columns, e.g. nullability, unique, length, and the like.
validate: use this value if you want Hibernate to validate the database schema against the mapped entity classes. Upon testing, I found that Hibernate checks only if the tables exist or not. If not, it throws SchemaManagementException – reporting tables missing.
none: tell Hibernate do not touch the database schema. Use this value when the database is stable and in production mode.
```

# Swagger UI

http://localhost:8080/swagger-ui/

