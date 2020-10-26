FROM openjdk:11
VOLUME /tmp
ADD target/Rest_api-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]