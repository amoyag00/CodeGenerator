package code.generator;
public class Power {
	public static int operate(int base ,int exp){
		int result = 1;
		for(int i=0;i<exp;i++){
			result = Multiplication.operate(base,result);
		}

		return result;
	}
}
