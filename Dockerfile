FROM openjdk:17-alpine
COPY target/spring-boot-image-for-docker.jar spring-boot-image-for-docker.jar
ENTRYPOINT ["java","-jar","/spring-boot-image-for-docker.jar"]