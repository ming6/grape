package io.grape;

/**
 * Created by jamin on 2017/7/12.
 */
public interface FieldTypeHandler {

    boolean isHandle(String type);

    String handle(String type);
}
