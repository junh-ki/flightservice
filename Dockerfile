FROM openjdk:11

ADD target/flightservice-0.0.1-SNAPSHOT.jar flightservice-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "flightservice-0.0.1-SNAPSHOT.jar"]
