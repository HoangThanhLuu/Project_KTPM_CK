FROM openjdk:17
WORKDIR /app
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
COPY target/ProductService-0.0.1-SNAPSHOT.jar ProductService.jar
EXPOSE 8802
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar /app/ProductService.jar"]
