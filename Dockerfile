FROM openjdk:8-jre
ADD target/bmp-customer-bill-management-service-0.1.jar bmp-customer-bill-management-service.jar
RUN sh -c 'touch /bmp-customer-bill-management-service.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/bmp-customer-bill-management-service.jar"]