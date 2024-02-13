FROM eclipse-temurin:17-jdk-focal

# Refer to Maven build -> finalName
ARG JAR_FILE=target/spring-boot-docker-0.0.1-SNAPSHOT.jar

# cd /app
WORKDIR /app

# cp target/spring-boot-docker-0.0.1-SNAPSHOT.jar /app/app.jar
COPY ${JAR_FILE} app.jar

# java -jar /app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]