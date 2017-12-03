package code.generator;
public class Division {
	public static int operate(int dividendo ,int divisor){
		int aux = dividendo;

		int result = 0;
		while(aux>=divisor){
			result = Addition.operate(result,1);
		aux = Substraction.operate(aux,divisor);
		}

		return result;
	}
}
