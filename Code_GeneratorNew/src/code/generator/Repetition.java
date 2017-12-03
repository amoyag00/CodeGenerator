/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.generator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alex
 */
public class Repetition {
	public String getRepetitionWithTimes(String parameter) {
            return "for(int i=0;i<"+parameter+";i++){\n\t\t";
        }
        public String getRepetitionWithCondition(String firstParameterName,String secondParameterName,String condition) {
            String base="while("+firstParameterName;
            if(condition.equals("Equal")){
                base+="==";
            }else if(condition.equals("Not equal")){
                base+="!=";
            }else if(condition.equals("Greater than")){
                base+=">";
            }else if(condition.equals("Smaller than")){
                base+="<";
            }else if(condition.equals("Greater or equal than")){
                base+=">=";
            }else if(condition.equals("Smaller or equal than")){
                base+="<=";
            }    
            base+=secondParameterName+"){\n\t\t";
            return base;
        }
		
}