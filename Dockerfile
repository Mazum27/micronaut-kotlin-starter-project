FROM ghcr.io/graalvm/jdk:ol7-java17 as graalvm
EXPOSE 8085
COPY api/build/libs/*-all-optimized.jar app.jar
ENV JAVA_OPTS="-Xmx2048m"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar app.jar" ]