package io.grape.service;

import io.grape.seed.java.Java;
import io.grape.model.Model;

/**
 * Created by jamin on 2017/7/14.
 */
public abstract class JavaModelService implements ModelService {

    public abstract Java getJava(Model model);

    @Override
    public void generate(Model model) {

    }
}
