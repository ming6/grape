package ${model.packageName}.service.impl;

import ${model.packageName}.dao.${model.name}Dao;
import ${model.packageName}.model.${model.name};
import ${model.packageName}.service.${model.name}Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ${model.name}ServiceImpl implements ${model.name}Service {

    @Autowired
    private ${model.name}Dao ${StringKit.lowercaseFirstLetter($model.name)}Dao;
}