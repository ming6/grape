package io.grape.model;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Created by jamin on 2017/6/19.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Model {

    @XmlAttribute
    private String name;
    @XmlAttribute
    private String packageName;
    @XmlElement(name = "field")
    private List<Field> fields;
    @XmlElement(name = "action")
    private List<Action> actions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }
}
