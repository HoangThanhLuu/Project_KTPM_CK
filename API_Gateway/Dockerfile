FROM openjdk:17
WORKDIR /app
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
COPY target/API_Gateway-0.0.1-SNAPSHOT.jar API_Gateway.jar
EXPOSE 8803
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar /app/API_Gateway.jar"]
