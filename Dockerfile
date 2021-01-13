FROM openjdk:8-jre
COPY ./source/build/libs/tchallenge-service.jar /app/app.jar
CMD ["java","-jar","/app/app.jar"]
