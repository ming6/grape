package ${model.packageName}.dto;

public class ${model.name}${StringKit.uppercaseFirstLetter($action.name)}RespDto {

#foreach($field in $action.respFields)
    #parse("common/Field.vm")
#end

#foreach($field in $action.respFields)
    #parse("common/GetMethod.vm")
    #parse("common/SetMethod.vm")
#end
}