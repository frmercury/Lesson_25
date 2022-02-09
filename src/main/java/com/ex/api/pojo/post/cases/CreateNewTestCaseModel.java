package com.ex.api.pojo.post.cases;

public class CreateNewTestCaseModel {

    public CreateNewTestCase createNewTestCase() {
        CreateNewTestCase createNewTestCase = new CreateNewTestCase();
        createNewTestCase.setTitle("New Test Case!!!");
        createNewTestCase.setPriority_id(2);
        createNewTestCase.setTemplate_id(2);
        createNewTestCase.setType_id(2);
        return createNewTestCase;
    }


}
