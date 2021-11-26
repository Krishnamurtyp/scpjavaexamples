# Getting Started
# Secure Coding Examples
> Implementation of Secure Software Design Patterns for Java

## Quickstart
Requires
- Docker
- Java JDK
- Maven

### Development
Clone repository into IntelliJ

### Initialize Testing Databases
In the root directory of this project there is the PostgresDB directory.

    For Mac:        Open this directory in the Finder window and select the script startDB. 
    For Windows:    Open this directory in the File Explorer window and select the script startDB.sh.

This will start the database from the latest Postgres Docker image.  Postgres is running on port 5432 and the 
default database is named postres.  The username and password is 'postgres'.
            
### Run the examples.
Once the database is running, run this application in Intellij.  Once the web application
is up, open a browser and navigate to url "localhost:8080".  The content displayed
is an explanation of code vulnerabilities and their mitigation. 

###Tear down this web application
Stop the web application running and navigate to the terminal window running the Postgres 
database.  Either type Control key and the 'C' key to terminate the process or

    For Mac:        Open this directory in the Finder window and select the script stopDB.
    For Windows:    Open this directory in the File Explorer window and select the script stopDB.sh.

This will shut down Postgres.

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.7/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.7/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.5.7/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data JDBC](https://docs.spring.io/spring-data/jdbc/docs/current/reference/html/)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Using Spring Data JDBC](https://github.com/spring-projects/spring-data-examples/tree/master/jdbc/basics)

