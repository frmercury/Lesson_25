package com.ex.api;


import com.ex.api.pojo.post.cases.PostNewTestCaseBuilder;
import io.restassured.response.Response;
import org.assertj.core.api.Assertions;
import org.json.JSONObject;
import org.testng.annotations.Test;


import java.util.Map;


public class AddTestCaseSuite extends BaseTest {


    @Test
    public void addStepTestCaseTest() {
        /**
         * Создание тест-кейса POST
         */
        Map<String, Object> stepTestCase = testCasesRequests
                .postNewTestCaseRequest(new PostNewTestCaseBuilder().getTestCaseBuilder()
                        .setTitle("New Automated StepTestCase ")
                        .setTemplate_id(2)
                        .setType_id(3)
                        .setPriority_id(2)
                        .setCustom_steps_separated()
                        .setEstimate("1m")
                        .build());
        /**
         * Получение id созданного тест-кейса
         */

        Response stepCaseResponse = (Response) stepTestCase.get("response");
        JSONObject stepCaseJsonObject = new JSONObject(stepCaseResponse.asString());
        String stepCaseID = String.valueOf(stepCaseJsonObject.get("id"));
        /**
         * Проверка условия через отдельный метод GET (POST возвращает аналогичный респонс)
         */
        Map<String, Object> stepTestCaseGet = testCasesRequests
                .getNewTestCaseRequest(stepCaseID);
        Response stepCaseResponseGet = (Response) stepTestCaseGet.get("response");
        JSONObject stepCaseResponseJsonObject = new JSONObject(stepCaseResponseGet.asString());
        Assertions.assertThat(stepCaseResponseJsonObject.get("template_id")).isEqualTo(2);
    }

    @Test
    public void addTextTestCaseTest() {
        Map<String, Object> textTestCase = testCasesRequests
                .postNewTestCaseRequest(new PostNewTestCaseBuilder().getTestCaseBuilder()
                        .setTitle("New Automated TextTestCase ")
                        .setTemplate_id(1)
                        .setType_id(3)
                        .setPriority_id(2)
                        .build());

        Response textCaseResponse = (Response) textTestCase.get("response");
        JSONObject textCaseJsonObject = new JSONObject(textCaseResponse.asString());
        String textCaseID = String.valueOf(textCaseJsonObject.get("id"));

        Map<String, Object> textTestCaseGet = testCasesRequests
                .getNewTestCaseRequest(textCaseID);
        Response textCaseResponseGet = (Response) textTestCaseGet.get("response");
        JSONObject textCaseResponseJsonObject = new JSONObject(textCaseResponseGet.asString());
        Assertions.assertThat(textCaseResponseJsonObject.get("template_id")).isEqualTo(1);
    }

    @Test
    public void addExploratoryTestCaseTest() {
        Map<String, Object> exploratoryTestCase = testCasesRequests
                .postNewTestCaseRequest(new PostNewTestCaseBuilder().getTestCaseBuilder()
                        .setTitle("New Automated ExploratoryTestCase ")
                        .setTemplate_id(3)
                        .setType_id(3)
                        .setPriority_id(3)
                        .build());
        Response expCaseResponse = (Response) exploratoryTestCase.get("response");
        JSONObject expCaseJsonObject = new JSONObject(expCaseResponse.asString());
        String expCaseID = String.valueOf(expCaseJsonObject.get("id"));

        Map<String, Object> expTestCaseGet = testCasesRequests
                .getNewTestCaseRequest(expCaseID);
        Response expCaseResponseGet = (Response) expTestCaseGet.get("response");
        JSONObject expCaseResponseJsonObject = new JSONObject(expCaseResponseGet.asString());
        Assertions.assertThat(expCaseResponseJsonObject.get("template_id")).isEqualTo(3);
    }
}
