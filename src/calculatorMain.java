import java.util.Scanner;

public class calculatorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = calculator.getFirstValue(sc);
		int result = first;
		while(true) {
			String symbol = calculator.getSymbol(sc);
			
			if("quit".equals(symbol)) {
				calculator.printResult(result);
				break;
			}else {
				int second = calculator.getSecondValue(sc);
				result =calculator.calculate(symbol, result, second);
			}
				
						
		
		}
		
		
		
}

}
