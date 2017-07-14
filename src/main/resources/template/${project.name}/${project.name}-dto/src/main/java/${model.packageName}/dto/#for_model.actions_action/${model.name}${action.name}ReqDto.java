package ${model.packageName}.dto;

public class ${model.name}${StringKit.uppercaseFirstLetter($action.name)}ReqDto {

#foreach($field in $action.reqFields)
    #parse("common/Field.vm")
#end

#foreach($field in $action.reqFields)
    #parse("common/GetMethod.vm")
    #parse("common/SetMethod.vm")
#end
}