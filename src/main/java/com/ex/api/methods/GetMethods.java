package com.ex.api.methods;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetMethods extends BaseParameters {

    public Response withPreemptiveBasic (String resource,String queryParam) {

        RestAssured.baseURI = testrail1235;

        return given()
                .auth()
                .preemptive().basic(email, password)
                .queryParam(queryParam)
                .when()
                .get(resource)
                .then()
                .extract()
                .response();
    }
}