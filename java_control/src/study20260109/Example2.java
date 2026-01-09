package study20260109;

public class Example2 {

	public static void main(String[] args) {
		// 문제2 
		// 정수타입 a = 10, b = 20의 각 변수들이 상대의 값으로 출력되도록 하기.
		
		int a = 10;
		int b = 20;
		
		
		int temp = b;
		b = a;
		a = temp;
				

		
		System.out.println("변수 a의 값 출력 : "+a);
		System.out.println("변수 b의 값 출력 : "+b);
		
		

	}

}
