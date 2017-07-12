package ${model.packageName}.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ${model.packageName}.service.${model.name}Service;
#foreach($action in $model.actions)
import ${model.packageName}.dto.${model.name}${action.name}ReqDto;
import ${model.packageName}.dto.${model.name}${action.name}RespDto;
#end

@RestController
public class ${model.name}Action {

    @Autowired
    private ${model.name}Service ${StringKit.lowercaseFirstLetter($model.name)}Service;

#foreach($action in $model.actions)
    @RequestMapping(value = "${action.path}", method = RequestMethod.${action.method})
    public ${model.name}${action.name}RespDto ${StringKit.lowercaseFirstLetter($action.name)}(@RequestBody ${model.name}${action.name}ReqDto reqDto){
        ${model.name}${action.name}RespDto respDto = new ${model.name}${action.name}RespDto();

        return respDto;
    }
#end

}
