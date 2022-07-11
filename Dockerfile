FROM openjdk:17-oracle
EXPOSE 8079
ADD /target/mc-api-gateway-0.0.1-SNAPSHOT.jar mc-api-gateway.jar
ENTRYPOINT ["java", "-jar", "mc-api-gateway.jar"]
