FROM openjdk:17
WORKDIR /app
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
COPY target/UserService-0.0.1-SNAPSHOT.jar UserService.jar
EXPOSE 8801
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar /app/UserService.jar"]
