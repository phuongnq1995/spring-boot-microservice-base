##ECOMMERCE PROJECT NOTE

##How to build microservice project:
## step1 - Pulling redis image from docker hub
docker pull redis

## step2 - Running the container
docker run -d -p 6379:6379 --name my-redis redis

Run config-server first

##Build clean install in root project

Run eureka-server
Run product-service
...
Run gateway-server

##How to mapping service uri to Gateway-server
http://localhost:8765/{application-name}/uri

Ex: product-service:http://localhost:8080/product/limit
-> gateway-server: http://localhost:8765/product-service/product/limit


