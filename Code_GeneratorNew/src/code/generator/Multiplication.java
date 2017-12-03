package code.generator;
public class Multiplication {
	public static int operate(int num1 ,int num2){
		int result = 0;
		for(int i=0;i<num2;i++){
			result = Addition.operate(num1,result);
		}

		return result;
	}
}
