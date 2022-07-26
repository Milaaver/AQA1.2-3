package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PostmanEchoTest {
    @Test
    void shouldReturnDemoAccounts() {
        given()
                .baseUri("https://postman-echo.com")
            .body("Best book")
       .when()
            .post("/post")
       .then()
            .statusCode(200)
            .body("data", equalTo("Best book"))
        ;

    }
}
