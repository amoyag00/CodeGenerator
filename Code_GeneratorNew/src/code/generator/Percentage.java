package code.generator;
public class Percentage {
	public static int operate(int num ,int percent){
		int aux = 0;

		int result = 0;
		aux = Multiplication.operate(num,percent);
		result = Division.operate(aux,100);

		return result;
	}
}
