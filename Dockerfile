FROM openjdk:8
WORKDIR /apps
COPY target/bmp-customer-bill-management-service-bs-1.0-SNAPSHOT.jar /apps
ENTRYPOINT ["java","-jar", "/apps/bmp-customer-bill-management-service-bs-1.0-SNAPSHOT.jar"]
