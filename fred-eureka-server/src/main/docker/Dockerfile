FROM java:8
MAINTAINER 21jhf
VOLUME /tmp
ADD fred-eureka-server-1.0.0.jar app.jar
RUN bash -c 'touch /app.jar'
ENV HOSTNAME discovery
EXPOSE 8761
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
