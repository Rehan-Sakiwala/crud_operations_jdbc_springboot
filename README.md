# CRUD Operation Using JDBC and MySql driver in Spring
************Main steps for Spring Boot JDBC application************

1. Provide jdbc and mysql starter dependecnies.
    -spring-boot-starter-jdbc (jdbc api)
    -spring-boot-starter-mysql (mysql driver)

2. Provide database properties in aapplication.properties file
    -spring.datasource.url = jdbc:mysql://localhost:3306/mydb
    -spring.datasource.driver-class-name = com.mysql.cj.jdbc.Driver
    -spring.datasource.username = root
    -spring.datasource.password = root

    Note : SB auto-configures the DataSource based on the properties provided in Application.properties file.

3. Use "JdbcTemplate" class for database operations(CRUD).

**********Implementation**********:
1. Created Users table in mysql.
2. Created Spring starter with jdbc and mysql dependency.
3. Created entity package. Created User class with members as table columns in mysql table.
4. Created getter and setters for all members.
5. Configured Database by providing above 4 properties in Application.properties file.
6. Created dao package. Created UserDao (UserRepository) with @Repository annotation.
    created object of JdbcTemplate with @Autowired annotation.
    created insertUser function which takes parameter User object.
        We have to use update method of JdbcTemplate to perform operations like insert, update, delete
7. Implement CommandLineRunner in main class.
    Overrride run method by creating User object and passing values and passing that object 
        to call UserDao's isnertUser method.
8. Created other operations in CRUD using similar approach.
9. While selecting function, created class which implements RowMapper interface.
