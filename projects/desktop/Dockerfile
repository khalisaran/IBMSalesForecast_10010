FROM java:8
RUN mkdir /app
COPY build/libs/IBMSalesForecast_10010.jar /app
COPY wait-for-it.sh /app
RUN chmod +x /app/wait-for-it.sh
WORKDIR /app
CMD ["java","-jar","IBMSalesForecast_10010.jar"]