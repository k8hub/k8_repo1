FROM openjdk:8-alpine
VOLUME /tmp
ADD target/spring-boot-docker.jar spring-boot-docker.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/spring-boot-docker.jar"]