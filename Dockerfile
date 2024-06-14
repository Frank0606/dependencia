from openjdk:17
copy ./dependencias-0.0.1-SNAPSHOT.jar /dependencias-0.0.1-SNAPSHOT.jar
workdir /
cmd ["java", "-jar", "dependencias-0.0.1-SNAPSHOT.jar", "--server.port=80"]