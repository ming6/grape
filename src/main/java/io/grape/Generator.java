package io.grape;

import io.grape.model.Model;
import io.grape.model.Project;
import io.papaya.ext.velocity.VelocityRenderService;
import io.papaya.file.BaseFileService;
import io.papaya.file.FileService;
import io.papaya.function.Xml;
import io.papaya.kit.ResourceKit;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jamin on 2017/7/11.
 */
public class Generator {

    private static final FileService fileService = new BaseFileService();

    /**
     * 数据库：
     * 1.表名，列名以类名和属性名为准，驼峰式转换下划线
     * 2.主键名称只能为ID对应属性id
     * */
    public static void main(String[] args) throws IOException, JAXBException {
        Map<String, Object> params = new HashMap();
        Xml xml = Xml.fromFile(ResourceKit.getClassPathFile("ax-api.xml"));
        Project project = xml.toObject(Project.class);
        for(Model model : project.getModels()){
            params.put("project", project);
            params.put("model", model);
            fileService.copy(ResourceKit.getClassPathFile("template/${project.name}"), "E:\\workspaces\\attackonx", new VelocityRenderService(), params);
        }
    }
}
