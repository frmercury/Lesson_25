package com.ex.api.methods;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetMethods extends BaseParameters {

    public Response withPreemptiveBasic (String resource,String queryParam, String body) {

        RestAssured.baseURI = testrail1235;

        return given()
                .auth()
                .preemptive().basic(email, password)
                .contentType(ContentType.JSON)
                .queryParam(queryParam)
                .body(body)
                .when()
                .post(resource)
                .then()
                .extract()
                .response();
    }
}