#Backend technical Test v2,

Technical stack :
Docker for containerize the application
Mapstruct for java bean mappings at compile-time.
H2 as in-memory database.
Liquibase is for managing database. 
JaCoCo for test coverage report.

Business requirement :
For secured operation :
login : Miquel
Password : Miquel 
Phone number must be 10 digits
First name and last name must follows the pattern [A-Z][a-z]
example :
First name : Badr (valid)
Last name : Kacimi (valid)

First name : BADR (not valid)
Last name : kacimi (not valid)



##Build project
To build the project, run the maven command
```
mvn clean install
```

##Run the project
```
docker-compose up --build
```

##Visualize and interact with the API's resources :

http://localhost:9999/swagger-ui.html
