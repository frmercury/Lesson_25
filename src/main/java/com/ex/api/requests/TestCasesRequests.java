package com.ex.api.requests;

import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class TestCasesRequests extends BaseRequests {

    private String resource = "index.php";
    private String queryParam = "/api/v2/add_case/1";

    public Map<String, Object> postNewTestCaseRequest(String body, int expectedSC) {
        Response response = postMethods
                .withPreemptiveBasic(resource,queryParam,body);
        assertThat(response.statusCode()).isEqualTo(expectedSC);
        return new HashMap<String, Object>() {
            {
                put("response", response);
            }
        };
    }
}
