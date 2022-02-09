package com.ex.api;

import org.testng.annotations.Test;

import java.sql.Timestamp;
import java.util.Map;

public class AddTestCaseSuite extends BaseTest {
    String body = String.format("{\n" +
            "  \"title\": \"This is a test case\",\n" +
            "  \"type_id\": 1,\n" +
            "  \"priority_id\": 3,\n" +
            "  \"estimate\": \"3m\",\n" +
            "  \"refs\": \"RF-1, RF-2\",\n" +
            "  \"custom_steps_separated\": [\n" +
            "    {\n" +
            "      \"content\": \"Step 1\",\n" +
            "      \"expected\": \"Expected Result 1\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"content\": \"Step 2\",\n" +
            "      \"expected\": \"Expected Result 2\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"shared_step_id\": 3\n" +
            "     }\n" +
            "  ]\n" +
            "}");
//, new Timestamp(System.currentTimeMillis())

    @Test
    public void addTestCaseTest(){
        Map<String, Object> mapTestCases = testCasesRequests
                .postNewTestCaseRequest(body,200);
    }
}
