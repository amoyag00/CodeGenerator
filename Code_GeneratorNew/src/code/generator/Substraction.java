package code.generator;
public class Substraction {
	public static int operate(int num1 ,int num2){
		int result = 0;
		result = Addition.operate(num1,Negation.negate(num2));

		return result;
	}
}
