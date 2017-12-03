package code.generator;
public class Root {
	public static int operate(int num){
		int g1 = 0;

		int aux = 1;

		int aux2 = 0;

		int aux1 = 0;

		int result = num;
		while(aux!=0){
			g1 = result;

		aux1 = Division.operate(num,g1);
		aux2 = Addition.operate(aux1,g1);
		result = Division.operate(aux2,2);
		aux = Substraction.operate(g1,result);
		}

		return result;
	}
}
