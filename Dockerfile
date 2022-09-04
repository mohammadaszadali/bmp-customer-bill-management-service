FROM openjdk:8
RUN mkdir apps
COPY target/bmp-customer-bill-management-service
Public
-bs-1.0-SNAPSHOT.jar apps/
ENTRYPOINT ["java","-jar", bmp-customer-bill-management-service
Public "apps/-bs-1.0-SNAPSHOT.jar"]
