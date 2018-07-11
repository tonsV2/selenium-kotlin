#FROM selenium/standalone-chrome
#RUN sudo apt -y update && sudo apt -y install openjdk-8-jdk
#WORKDIR /src
#ADD --chown=seluser . .
#CMD ./gradlew --stacktrace test

FROM openjdk:8-jdk-alpine
WORKDIR /src
ADD . .
CMD ./gradlew test

#FROM openjdk:8-jre-alpine
#FROM gradle:alpine
#WORKDIR /app
#ADD gradlew...
#COPY --from=builder /src/target/*-0.0.1-SNAPSHOT.jar .
#CMD exec gradle test


#HEALTHCHECK --interval=10s --timeout=3s CMD wget --quiet --tries=1 --spider http://localhost:8080/api/tagsByRank || exit 1
