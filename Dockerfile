#
# Package stage
#
FROM openjdk:11-jre-slim
COPY target/lib /usr/local/lib/lib
COPY target/kafka-1.0-SNAPSHOT-runner.jar /usr/local/lib/challenge.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/challenge.jar"]