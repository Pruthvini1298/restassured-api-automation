package com.api.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Getuserstests {

    @Test
    public void testGetUsers() {
        RestAssured.baseURI = "https://reqres.in/api";
        Response response = RestAssured
                .given()
                .when()
                .get("/users?page=2");

        assertEquals(200, response.statusCode());
    }
}
