package io.grape.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * Created by jamin on 2017/6/19.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Field {

    @XmlAttribute
    private String name;
    @XmlAttribute
    private String type;
    @XmlElement(name = "field")
    private List<Field> fields;

    public Field(String name, String type){
        this.name = name;
        this.type = type;
    }
    public Field(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }
}
