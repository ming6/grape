package io.grape.service;

import io.grape.model.Model;
import io.grape.model.Project;

/**
 * Created by jamin on 2017/7/14.
 */
public class BaseProjectService implements ProjectService {

    private ModelService modelService;

    @Override
    public void generate(Project project) {
        for(Model model : project.getModels()){
            modelService.generate(model);
        }
    }
}
