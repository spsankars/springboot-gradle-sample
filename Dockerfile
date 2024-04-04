FROM openjdk:21

WORKDIR /app

COPY build/libs/app-1.0-SNAPSHOT.jar /app

EXPOSE 8080


ENTRYPOINT ["java", "-jar", "app-1.0-SNAPSHOT.jar"]