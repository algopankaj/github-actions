FROM openjdk:11-jre-slim
EXPOSE 8080
ADD target/springboot-github-actions springboot-github-actions.jar
ENTRYPOINT ["java", "-jar", "/springboot-github-actions.jar"]
