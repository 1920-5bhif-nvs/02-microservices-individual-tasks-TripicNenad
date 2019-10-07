package at.htl.vehicleShop;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class vehicleShopResourceTest {

    @Test
    public void testSedanCount(){
        given()
                .when()
                .get("/api/sedan/amount")
                .then()
                .statusCode(200)
                .body(is("8"));
    }

    @Test
    public void testSedanAvgHorsepower(){
        given()
                .when()
                .get("api/sedan/avg/horsepower")
                .then()
                .statusCode(200)
                .body(is("470.0"));
    }

    @Test
    public void testSedanAvgPassengers(){
        given()
                .when()
                .get("api/sedan/avg/passengers")
                .then()
                .statusCode(200)
                .body(is("5.0"));
    }

}