FROM gradle:jdk11

RUN mkdir -p /home
ENV APP_HOME /home
ENV JAR_FILE ${APP_HOME}/app.jar

COPY build/libs/demo-0.0.1.jar $JAR_FILE

CMD ["java", "-Dspring.data.mongodb.uri=mongodb://mongo:27017/spring-mongo", "-jar", "/home/app.jar"]