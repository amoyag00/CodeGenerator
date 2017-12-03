package code.generator;
public class Mean {
	public static int operate(int num1 ,int num2 ,int num3){
		int result = 0;
		result = Addition.operate(num1,num2);
		result = Addition.operate(result,num3);
		result = Division.operate(result,3);

		return result;
	}
}
