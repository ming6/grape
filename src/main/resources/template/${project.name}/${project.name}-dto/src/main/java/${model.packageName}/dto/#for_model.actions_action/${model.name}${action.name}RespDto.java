package ${model.packageName}.dto;

public class ${model.name}${action.name}RespDto {

#foreach($field in $action.respFields)
    private ${field.type} ${field.name};
#end

#foreach($field in $action.respFields)
    public ${field.type} get${StringKit.uppercaseFirstLetter($field.name)}(){
        return $field.name;
    }
    public void set${StringKit.uppercaseFirstLetter($field.name)}(${field.type} ${field.name}){
        this.${field.name} = ${field.name};
    }
#end
}