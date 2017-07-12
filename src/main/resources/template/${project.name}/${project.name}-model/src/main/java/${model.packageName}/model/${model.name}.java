package ${model.packageName}.model;

public class ${model.name} {

#foreach($field in $model.fields)
    private ${field.type} ${field.name};
#end

#foreach($field in $model.fields)
    public ${field.type} get${StringKit.uppercaseFirstLetter($field.name)}(){
        return $field.name;
    }
    public void set${StringKit.uppercaseFirstLetter($field.name)}(${field.type} ${field.name}){
        this.${field.name} = ${field.name};
    }
#end
}
