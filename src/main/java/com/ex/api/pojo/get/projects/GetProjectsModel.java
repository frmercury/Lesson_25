package com.ex.api.pojo.get.projects;

import java.util.ArrayList;
import java.util.List;

public class GetProjectsModel {
    List<GetProjects> getProjects = new ArrayList<>();

    public List<GetProjects> getGetProjects() {
        return getProjects;
    }

    public void setGetProjects(List<GetProjects> getProjects) {
        this.getProjects = getProjects;
    }
}
