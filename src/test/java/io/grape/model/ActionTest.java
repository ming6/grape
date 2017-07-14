package io.grape.model;

import io.papaya.function.Text;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jamin on 2017/7/14.
 */
public class ActionTest {

    @Test
    public void test(){
        Action action = new Action();
//        action.setPackageName("io.grape.model");
        action.setPath(new Text("/user/list/get"));
        action.setName("User");
        List<Field> fields = new ArrayList<>();
        fields.add(new Field("id", "io.grape.model.User"));
        fields.add(new Field("id", "java.util.List<io.grape.model.User>"));
        fields.add(new Field("name", "String"));
        action.setRequestFields(fields);
        action.setResponseFields(fields);
//        model.setFields(fields);
        System.out.println(action.toString());
    }
}
