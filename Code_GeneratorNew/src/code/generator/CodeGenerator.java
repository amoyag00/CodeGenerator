/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.generator;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alex
 */
public class CodeGenerator {

    /**
     * @param args the command line arguments
     */
    ArrayList<Operation> operations;
    Repetition rep;
    Operation currentOp;
    int declarationsPointer;
    ArrayList<String> availableParams;
    public CodeGenerator(){
        operations=new ArrayList<Operation>();
        Operation addition=new Operation("Addition","","float");
        addition.setParameterNames("a","b");
        operations.add(addition);
        rep=new Repetition();
        availableParams= new ArrayList<String>();
    }
    public String convertToJavaType(String interfaceType){
        String javaType;
         if(interfaceType.equals("Integer")){
            javaType="int";
        }else{
            javaType="float";
        }
        return javaType;
    }
    
    public String createOperation(String className, String classTypeSelected, String []parameterNames,
            String []parameterTypes, String resultValue){
        
       String code, javaTypes[],classType;
       javaTypes= new String[parameterTypes.length];
       availableParams.clear();
       classType=convertToJavaType(classTypeSelected);
       for(int i=0;i<javaTypes.length;i++){
           javaTypes[i]=convertToJavaType(parameterTypes[i]);
       }
       
       className=className.substring(0, 1).toUpperCase() + className.substring(1);
       code="package code.generator;\npublic class "+className+" {\n"+
                "\tpublic static "+classType+" operate(";
       for(int i=0;i<parameterNames.length;i++){
           if(!parameterNames[i].isEmpty()){
               code+=javaTypes[i]+" "+parameterNames[i];
               availableParams.add(parameterNames[i]);
           }
   
           if(i<parameterNames.length-1){
               code+=" ,";
           }
       }
       availableParams.add("result");
      
                
        code+="){\n\t\t"+classType+" result = "+resultValue+";\n\t\t\n\t\treturn result;\n\t}\n}";
       addOperation(className, classType,code,parameterNames);
       declarationsPointer=code.indexOf("{", code.indexOf("{")+1);
        return code;
    }
    
    public void addOperation(String name, String type, String code, String ... parameterNames){
        Operation op=new Operation(name, code, type);
        operations.add(op);
        op.setParameterNames(parameterNames);
        currentOp=op;
    }
    
    public String getCodeOf(String operationName){
        for(Operation iter:operations){
            if(iter.getName().equals(operationName)){
                return iter.getCode();
            }
        }
        return null;
    }
    public Operation getOperation(String operationName){
         for(Operation op:operations){
            if(op.getName().equals(operationName)){
                return op;
            }
        }
         return null;
    }
   
    public void saveFile(String className, String text){
        String sourceDir=System.getProperty("user.dir")+"/src/code/generator/";
        
        Path file;	
	String fileName;
	
	fileName= className + ".java";
	file=Paths.get(sourceDir+fileName);	
        
        ArrayList<String>code = new ArrayList<String>(Arrays.asList(text)) ;
        try {
            Files.write(file, code,Charset.forName("UTF-8"));
        } catch (IOException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String[] getAvailableParameters(){
       
        return (availableParams.toArray(new String[availableParams.size()]));
    }
    public String generateOperation(String operation, String [] params,String storingParam){
        String generatedCode="";
        generatedCode=operation+".operate(";
     
        
        for(int i=0;i<params.length;i++){
            generatedCode+=params[i]+",";
        }
        generatedCode=generatedCode.substring(0,generatedCode.length()-1);
        generatedCode=storingParam+" = "+generatedCode;
        generatedCode+=");\n";
        currentOp.setCode(generatedCode);
        return generatedCode;
    }
    /*
    Checks that a parameter is declared. If doesn't, it delcares it
    */
    public String checkParameterExists(String code,String parameter, String initialValue){
        
        
         if(parameter.equals("result")){
            return code;
        }
        for (int i=0;i<availableParams.size();i++){
            if(parameter.equals(availableParams.get(i))){
                return code;
            }
        }
       
        code=code.substring(0,declarationsPointer+1)+"\n\t\t"+this.currentOp.getType()
                +" "+parameter+" = "+initialValue+";\n"
                + code.substring(declarationsPointer+1);
        this.currentOp.setCode(code);
        this.availableParams.add(parameter);
        return code;
    }
    
    public int getNumberOperationParams(String operation){ 
        return getOperation(operation).getNumberParams();
    }

    public String generateRepetitionTimes(String times){
        return rep.getRepetitionWithTimes(times);
    }
     public String generateRepetitionCondition(String firstParameterName,String secondParameterName,String condition){
        return rep.getRepetitionWithCondition(firstParameterName, secondParameterName, condition);
    }
     public String generateNegation(String parameter){
         return "Negation.negate("+parameter+")";
     }
  
}
