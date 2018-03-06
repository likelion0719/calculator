import java.util.Scanner;

public class calculatorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 입력값");
		int first = sc.nextInt();
		System.out.println("첫번째 입력값: "+first);
	
		System.out.println("두번째 입력값");
		int second = sc.nextInt();
		System.out.println("두번째 입력값: "+second);
		
		System.out.println("연산 부호 입력");
		String symbol = sc.next();
		
		if("+".equals(symbol)) {
			System.out.println("더하기 값: "+ (first+second));
		}else if ("-".equals(symbol)) {
			System.out.println("빼기 값: "+ (first-second));
		}else if ("-".equals(symbol)) {
			System.out.println("곱하기 값: "+ (first*second));
		}else if("/".equals(symbol)){
			System.out.println("나누기 값: "+ (first/second));
		}else {
			System.out.println("사칙연산에 해당하지 않는 값을 입력");
		}
		
		
}

}
