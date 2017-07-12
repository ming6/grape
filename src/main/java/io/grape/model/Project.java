package io.grape.model;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Created by jamin on 2017/7/11.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Project {

    @XmlAttribute
    private String name;
    @XmlAttribute
    private String group;
    @XmlAttribute
    private String version;
    @XmlElement(name = "model")
    private List<Model> models;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<Model> getModels() {
        return models;
    }

    public void setModels(List<Model> models) {
        this.models = models;
    }
}
