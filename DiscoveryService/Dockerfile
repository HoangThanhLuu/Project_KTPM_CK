FROM openjdk:17
WORKDIR /app
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
COPY target/DiscoveryService-0.0.1-SNAPSHOT.jar DiscoveryService.jar
EXPOSE 8761
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar /app/DiscoveryService.jar"]
