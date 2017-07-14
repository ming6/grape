package io.grape.model;

import io.grape.coder.java.*;

/**
 * Created by jamin on 2017/7/13.
 */
public class ModelDao {

    private Model model;

    public ModelDao(Model model){
        this.model = model;
    }

    @Override
    public String toString() {
        JavaBuilder builder = new JavaBuilder(model.getName() + "Dao");
        return builder.build().toString();
    }
}
