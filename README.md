# technical-task-ad
To run the application, the system needs to be equipped with the following software :-
- JDK 1.8 (https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html)
- Apache Tomcat 9.0.71 (https://tomcat.apache.org/download-90.cgi)
- MySQL 8 (Server + Workbench) (https://dev.mysql.com/downloads/windows/installer/8.0.html)
  (install SQL with username as "root" and password as "root")

1) Copy/move the war file "technical-task.war" to the "webapps" folder present in apache tomcat 9 directory(.../apache-tomcat-9.0.71\apache-tomcat-9.0.71\webapps)
2) Create a database using the "task-sql.sql" file or by executing the below query in MySQL 8.0 command line client
      - create database supermart
3) To start the server execute the "startup.bat" file from the "bin" folder present in apache tomcat 9 directory (.../apache-tomcat-9.0.71\apache-tomcat-9.0.71\bin)

The server should then start after the execution of the above steps

The swagger documentation is available at the URL - http://localhost:8080/technical-task/swagger-ui/ 
