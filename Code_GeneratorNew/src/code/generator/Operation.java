/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.generator;

import java.util.ArrayList;

/**
 *
 * @author alex
 */
public class Operation {
    private String name;
    private String code;
    private String [] parameterNames;
    private String type;
    
    public Operation(String name, String code, String type){
        this.name=name;
        this.code=code;
        this.type=type;
        
    }
    public String getName(){
        return this.name;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code=code;
    }
    public String getType(){
        return this.type;
    }
    
    public int getNumberParams(){
        return this.parameterNames.length;
    }
   
    public String[] getParameterNames(){
        return this.parameterNames;
    }
    public void setParameterNames(String ... names){
        ArrayList<String> parameterNames=new ArrayList<String>();
        int i=0;
        for(String s: names){
            if(!s.isEmpty()){
                parameterNames.add(s);
            }
            
        }
        this.parameterNames=parameterNames.toArray(new String[parameterNames.size()]);
    }
}
