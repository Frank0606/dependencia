from openjdk:17
copy ./dependencias-0.0.1-SNAPSHOT /dependencias-0.0.1-SNAPSHOT
workdir /
cmd ["java", "-jar", "dependencias-0.0.1-SNAPSHOT", "--server.port=80"]