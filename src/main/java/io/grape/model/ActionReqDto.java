package io.grape.model;

import io.grape.coder.java.JavaBuilder;
import io.grape.coder.java.JavaValue;

import java.util.List;

/**
 * Created by jamin on 2017/7/14.
 */
public class ActionReqDto {

    private List<ActionReqParam> params;

    public List<ActionReqParam> getParams() {
        return params;
    }

    public void setParams(List<ActionReqParam> params) {
        this.params = params;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
