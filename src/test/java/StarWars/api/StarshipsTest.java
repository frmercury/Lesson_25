package StarWars.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class StarshipsTest {

    @BeforeTest
    void setUp(){
        RestAssured.baseURI = "https://swapi.dev/api";
    }

    @Test
    public void starshipResponse() {


        given()
                .when()
                .get("/starships/10/")
                .then()
                .log().body()
                .statusCode(200)
                .assertThat()
                .body("manufacturer", equalTo("Corellian Engineering Corporation"),
                        "max_atmosphering_speed", equalTo("1050"),
                        "cargo_capacity", equalTo("100000"))
                .body("pilots.size", equalTo(4));
    }
}
