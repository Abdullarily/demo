FROM openjdk:17
COPY . .
WORKDIR . .
RUN javac DemoApplication.java
CMD ["java", "DemoApplication"]