import java.util.Scanner;

public class cal1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("계산식 입력");
		String value = sc.nextLine();
		String [] values = value.split(" ");
		int first = Integer.parseInt(values[0]);
		int result = first;
		for(int i=1; i<values.length; i+=2) {
			String symbol = values[i];
			int second = Integer.parseInt(values[i+1]);
			result = calculator.calculate(symbol, result, second);
		}
		calculator.printResult(result);
		
		sc.close();
	}
}
