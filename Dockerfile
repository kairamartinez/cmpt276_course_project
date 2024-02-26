FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:21.0.1-jdk-slim
COPY --from=build /target/cmpt276_course_project-0.0.1-SNAPSHOT.jar cmpt276_course_project.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "cmpt276_course_project.jar"]