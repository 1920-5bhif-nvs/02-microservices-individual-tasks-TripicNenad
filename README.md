# 02-microservices-individual-tasks by Tripic Nenad
I've made a **quarkus**-application, which basically adds a few methods to the [project](https://github.com/1920-5bhif-nvs/01-assignment-quarkus-jpa-TripicNenad) from the last homework. Additionally I added a few unit tests to test these methods and to show that it perfectly works with the other independent project = **MICROSERVICES**.

## Create:

```
mvn io.quarkus:quarkus-maven-plugin:0.11.0:create \
        -DprojectGroupId=at.htl.vehicleShop \
        -DprojectArtifactId=quarkus-microservice-vehicleshop \
        -DclassName="at.htl.vehicleShop.vehicleShopResource" \
		-Dpath="hello"
```

##	Pom.xml
**Metrics**:

    <dependency>  
	  <groupId>io.quarkus</groupId>  
	  <artifactId>quarkus-smallrye-metrics</artifactId>  
	</dependency>

**Health-Report:**

    <dependency>  
	  <groupId>io.quarkus</groupId>  
	  <artifactId>quarkus-smallrye-health</artifactId>  
	</dependency>

**JUnit5:**

    <dependency>  
	  <groupId>io.quarkus</groupId>  
	  <artifactId>quarkus-junit5</artifactId>  
	  <scope>test</scope>  
	</dependency>


## Usage of Metrics & Health
### Metrics:

-   @Counted - is a metric annotation on the `list()` method to count how many times the list of systems method is requested.

In Code example: `@Counted(name = "getNumberOfSedans")`

-   @Timed - basically creates a timer when the method is created so you can measure how long it takes from invokation to the response.

In Code example: `@Timed(name = "timer", description = "This is how long it takes to perform this task: ", unit = MetricUnits.MILLISECONDS)`

-   @Gauge - A gauge is a metric that represents a single numerical value that can arbitrarily go up and down. Eg. counter for requests

The corresponding curl statement would be:
```
curl -H"Accept: application/json" localhost:8181/metrics/application

```

![alt text](metrics.jpg)



### Health:
The corresponding curl statement would be:
```
curl -H"Accept: application/json" http://localhost:8181/health

```

![alt text](health.jpg)


## Research
**Prometheus:**



   [Prometheus](https://github.com/prometheus) is a application used for event monitoring and alerting.



**Istio:**

[Istio](https://istio.io/) let's you control the flow of traffic and API calls between services, conduct a range of tests, and upgrade gradually with deployments. Istio is a so called "service-mesh", a service mesh is a dedicated infrastructure layer that controls service-to-service communication over a network. It provides a method in which separate parts of an application can communicate with each other. Service meshes appear commonly in concert with cloud-based applications, containers and **microservices**.

