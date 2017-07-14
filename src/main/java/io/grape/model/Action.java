package io.grape.model;

import io.grape.coder.java.*;
import io.papaya.function.Text;
import io.papaya.kit.CollectionKit;
import io.papaya.kit.StringKit;

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
    private Text path;
    @XmlAttribute
    private String method;
    @XmlElementWrapper(name = "request")
    @XmlElement(name = "field")
    private List<Field> requestFields;
    @XmlElementWrapper(name = "response")
    @XmlElement(name = "field")
    private List<Field> responseFields;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Text getPath() {
        return path;
    }

    public void setPath(Text path) {
        this.path = path;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public List<Field> getRequestFields() {
        return requestFields;
    }

    public void setRequestFields(List<Field> requestFields) {
        this.requestFields = requestFields;
    }

    public List<Field> getResponseFields() {
        return responseFields;
    }

    public void setResponseFields(List<Field> responseFields) {
        this.responseFields = responseFields;
    }

    @Override
    public String toString() {
        String name = this.path.toCamel('/').toString();
        JavaBuilder builder = new JavaBuilder(JavaType.INTERFACE, name + "Action");
        builder.addMethod(new JavaValue.Type(name + "Response"), "action", new JavaMethod.Param[]{new JavaMethod.Param(new JavaValue.Type(name + "Request"), "request")});
        Java requestJava = new Java(name + "Request");
        if(CollectionKit.isNotEmpty(requestFields)){
            for(Field requestField : requestFields){
                JavaField field = new JavaField(new JavaValue.Type(requestField.getType()), requestField.getName());
                requestJava.addField(field);
                requestJava.addMethod(new JavaGetMethod(field));
                requestJava.addMethod(new JavaSetMethod(field));
            }
        }
        builder.addJava(requestJava);
        Java responseJava = new Java(name + "Response");
        if(CollectionKit.isNotEmpty(responseFields)){
            for(Field responseField : responseFields){
                JavaField field  = new JavaField(new JavaValue.Type(responseField.getType()), responseField.getName());
                responseJava.addField(field);
                responseJava.addMethod(new JavaGetMethod(field));
                responseJava.addMethod(new JavaSetMethod(field));
            }
        }
        builder.addJava(responseJava);
        return builder.build().toString();
    }
}
