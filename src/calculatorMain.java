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
		
		System.out.println("더하기"+ (first+second));
		System.out.println("빼기"+ (first-second));
		System.out.println("곱하기"+ (first*second));
		System.out.println("나누기"+ (first/second));
}

}
