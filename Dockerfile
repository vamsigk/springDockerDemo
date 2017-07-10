FROM java:8
EXPOSE 8080
ADD /target/SpringDocker.jar myApp.jar
ENTRYPOINT ["java", "-jar", "myApp.jar"]
