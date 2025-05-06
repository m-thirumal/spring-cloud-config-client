# spring-cloud-config-client
### What is this repository for? ###
* 0.1
* Externalized (Property files)
* Environment specific (Spring Profile)
* Consistent (Spring cloud config)
* Version Management (GIT repo source)
* Real Time Management [Refresh config properties in client without restart]


## Required Repos link

* [https://github.com/M-Thirumal/spring-cloud-config-server](https://github.com/M-Thirumal/spring-cloud-config-server)
* [https://github.com/M-Thirumal/config-repo](https://github.com/M-Thirumal/config-repo)

## Endpoints

To refresh the properties

```shell

curl -X POST http://localhost:8080/actuator/refresh
```

response is the variables that are changed.

```
["config.client.version","client.name"]% 

```

### How do I get set up? ###

* Summary of set up
* Configuration
* Dependencies

    * Spring Boot
    * Git
    * Maven 
    * Any IDE

* Database configuration
* How to run tests
* Deployment instructions

### Contribution guidelines ###

* Writing tests
* Code review
* Other guidelines

### What not to commit ####

* src/main/resources/application.properties file

### Who do I talk to? ###
* Thirumal