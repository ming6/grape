package io.grape;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by jamin on 2017/7/12.
 */
public abstract class BaseFieldTypeHandler implements FieldTypeHandler {

    private static final List<FieldTypeHandler> handlers = new LinkedList<>();

    static {

    }

    @Override
    public String handle(String type) {
        for(FieldTypeHandler handler : handlers){
            if(handler.isHandle(type)){
                return handler.handle(type);
            }
        }
        return null;
    }
}
