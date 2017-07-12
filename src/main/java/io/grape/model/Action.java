package io.grape.model;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Created by jamin on 2017/7/12.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Action {

    @XmlAttribute
    private String name;
    @XmlAttribute
    private String path;
    @XmlAttribute
    private String method;
    @XmlElementWrapper(name = "request")
    @XmlElement(name = "field")
    private List<Field> reqFields;
    @XmlElementWrapper(name = "response")
    @XmlElement(name = "field")
    private List<Field> respFields;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public List<Field> getReqFields() {
        return reqFields;
    }

    public void setReqFields(List<Field> reqFields) {
        this.reqFields = reqFields;
    }

    public List<Field> getRespFields() {
        return respFields;
    }

    public void setRespFields(List<Field> respFields) {
        this.respFields = respFields;
    }
}
