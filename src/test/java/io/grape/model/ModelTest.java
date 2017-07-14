package io.grape.model;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jamin on 2017/7/13.
 */
public class ModelTest {

    @Test
    public void test(){
        Model model = new Model();
        model.setPackageName("io.grape.model");
        model.setName("User");
        List<Field> fields = new ArrayList<>();
        fields.add(new Field("id", "io.grape.model.User"));
        fields.add(new Field("id", "java.util.List<io.grape.model.User>"));
        fields.add(new Field("name", "String"));
        model.setFields(fields);
        System.out.println(model.toString());
    }
}
