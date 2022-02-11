package com.ex.api.pojo.post.cases;

import org.checkerframework.checker.units.qual.C;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class PostNewTestCaseBuilder {
    public String getTitle() {
        return title;
    }

    public int getType_id() {
        return type_id;
    }

    public int getTemplate_id() {
        return template_id;
    }

    public int getPriority_id() {
        return priority_id;
    }

    private String title;
    private int type_id;
    private int template_id;
    private int priority_id;

    private List<CustomFieldParameters> custom_steps_separated = new ArrayList<>();

    public List<CustomFieldParameters> getCustom_steps_separated() {
        return custom_steps_separated;
    }

//    private Duration estimate;

    public static Builder getTestCaseBuilder() {
        return new PostNewTestCaseBuilder().new Builder();
    }

    public class Builder {

        private Builder() {
        }

        public Builder setTitle(String Title) {
            title = Title + new Timestamp(System.currentTimeMillis());
            return this;
        }

        public Builder setType_id(int Type_id) {
            type_id = Type_id;
            return this;
        }

        public Builder setTemplate_id(int Template_id) {
            template_id = Template_id;
            return this;
        }

        public Builder setPriority_id(int Priority_id) {
            priority_id = Priority_id;
            return this;
        }

        public Builder setCustom_steps_separated() {
            CustomFieldParameters step1 = new CustomFieldParameters();
            step1.setContent("content");
            step1.setExpected("expected");
            custom_steps_separated.add(step1);
            return this;
        }

        public PostNewTestCaseBuilder build() {
            return PostNewTestCaseBuilder.this;
        }

    }

}

//        public Builder setEstimate(Duration Estimate) {
//            estimate = Estimate;
//            return this;
//        }