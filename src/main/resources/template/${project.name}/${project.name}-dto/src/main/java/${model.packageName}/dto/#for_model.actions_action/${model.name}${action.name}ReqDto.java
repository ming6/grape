package ${model.packageName}.dto;

public class ${model.name}${action.name}ReqDto {

#foreach($field in $action.reqFields)
    private ${field.type} ${field.name};
#end

#foreach($field in $action.reqFields)
    public ${field.type} get${StringKit.uppercaseFirstLetter($field.name)}(){
        return $field.name;
    }
    public void set${StringKit.uppercaseFirstLetter($field.name)}(${field.type} ${field.name}){
        this.${field.name} = ${field.name};
    }
#end
}