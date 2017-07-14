package io.grape.model;

import java.util.List;

/**
 * Created by jamin on 2017/7/14.
 */
public class ActionRespDto {

    private List<ActionRespParam> params;

    public List<ActionRespParam> getParams() {
        return params;
    }

    public void setParams(List<ActionRespParam> params) {
        this.params = params;
    }

    @Override
    public String toString() {
        return null;
    }
}
