package com.ex.api.requests;


import com.ex.api.pojo.post.cases.PostNewTestCaseBuilder;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class TestCasesRequests extends BaseRequests {

    private String resource = "index.php";
    private String postQueryParam = "/api/v2/add_case/3";
    private String getQueryParam = "/api/v2/get_case/";
    private int expectedSC = 200;

    public Map<String, Object> postNewTestCaseRequest(PostNewTestCaseBuilder body) {
        Response response = postMethods
                .withPreemptiveBasic(resource, postQueryParam, body);
        assertThat(response.statusCode()).isEqualTo(expectedSC);
        return new HashMap<String, Object>() {
            {
                put("response", response);
            }
        };
    }

    public Map<String, Object> getNewTestCaseRequest(String testCaseID) {

        Response response = getMethods
                .withPreemptiveBasic(resource, getQueryParam + testCaseID);
        assertThat(response.statusCode()).isEqualTo(expectedSC);
        return new HashMap<String, Object>() {
            {
                put("response", response);
            }
        };
    }
}