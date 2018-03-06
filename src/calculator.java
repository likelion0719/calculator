import java.util.Scanner;

public class calculator {
	public static int getFirstValue(Scanner sc) {
		System.out.println("첫번째 수 입력");
		int first = sc.nextInt();
		return first;
	}
	public static int getSecondValue(Scanner sc) {
		System.out.println("두번째 수 입력");
		int second = sc.nextInt();
		return second;
	}
	public static String getSymbol(Scanner sc) {
		System.out.println("사칙연산 입력");
		String symbol = sc.next();
		return symbol;
	}
	public static int calculate(String symbol,int first, int second) {
		if("+".equals(symbol)) {
			first+=second;
			System.out.println("더하기값 : "+first);
		}else if ("-".equals(symbol)) {
			first-=second;
			System.out.println("빼기값 : "+first);
		}else if ("*".equals(symbol)) {
			first*=second;
			System.out.println("곱하기값 : "+first);
		}else if("/".equals(symbol)){
			first/=second;
			System.out.println("나누기값 : "+first);
		}else {
			System.out.println("사칙연산에 해당하지 않는 값을 입력");
		}
		return first;
		
	}
	
	public static void printResult(int result) {
		System.out.println("결과 값: "+result);
	}

}
