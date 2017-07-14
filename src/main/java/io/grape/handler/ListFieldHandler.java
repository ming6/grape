package io.grape.handler;

import io.grape.FieldHandler;
import io.grape.model.Field;

/**
 * Created by jamin on 2017/7/13.
 */
public class ListFieldHandler implements FieldHandler {

    @Override
    public Field handle(Field field) {
        field.setType("List<>");
        return null;
    }
}
