FROM openjdk:11
COPY target/at_school_test-1.0-SNAPSHOT-jar-with-dependencies.jar /at_school_test.jar
CMD ["java","-jar","/at_school_test.jar"]