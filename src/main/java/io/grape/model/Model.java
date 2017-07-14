package io.grape.model;

import io.grape.coder.java.*;
import io.papaya.kit.CollectionKit;

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

    @Override
    public String toString() {
        JavaBuilder builder = new JavaBuilder(getName());
        builder.setPackage(getPackageName());
        if(CollectionKit.isNotEmpty(getFields())){
            for(Field modelField : getFields()){
                JavaValue.Type fieldType = new JavaValue.Type(modelField.getType());
                JavaField javaField = new JavaField(fieldType, modelField.getName());
                builder.addField(javaField);
                builder.addMethod(new JavaGetMethod(javaField));
                builder.addMethod(new JavaSetMethod(javaField));
            }
        }
        return builder.build().toString();
    }
}
