package code.generator;
public class Factorial {
	public static int operate(int num){
		int counter = 0;

		int result = 1;
		for(int i=0;i<num;i++){
			counter = Addition.operate(counter,1);
		result = Multiplication.operate(result,counter);
		}

		return result;
	}
}
