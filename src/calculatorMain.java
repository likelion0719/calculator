import java.util.Scanner;

public class calculatorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 입력값");
		int first = sc.nextInt();
		System.out.println("첫번째 입력값: "+first);
		String symbol;
		int second = 0;
		
		while(true) {
			System.out.println("연산 부호 입력");
			 symbol = sc.next();
			
			if("quit".equals(symbol)) {
				System.out.println("결과: "+first);
				break;
			}else {
				System.out.println("두번째 입력값");
				second = sc.nextInt();
				System.out.println("두번째 입력값: "+second);

				if("+".equals(symbol)) {
					first+=second;
				}else if ("-".equals(symbol)) {
					first-=second;
				}else if ("*".equals(symbol)) {
					first*=second;
				}else if("/".equals(symbol)){
					first/=second;
				}else {
					System.out.println("사칙연산에 해당하지 않는 값을 입력");
				}

			}
				
						
		
		}
		
		
		
}

}
