package exam14;

import java.util.Scanner;

public class DivisionQuiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("=== 나눗셈 계산기 ===");

		// 1. 첫 번째 숫자 입력
		System.out.println("첫 번째 정수 : ");
		String num1_ = sc.nextLine(); // "5"
		
		
		int num1;
		try {
			num1 = Integer.parseInt(num1_);
			
		}catch(Exception e) {
			num1 = -1;
		}
		System.out.println("num1 : " + num1);

//		String temp = num1_;
//		for (int i = 0; i <= 9; i++) {
//			temp = temp.replace(i + "", "");
//		}
//		System.out.println("temp : ["+ temp+"]");
//		
//		int num1 = 0;
//		if (temp.equals("")) {
//			num1 = Integer.parseInt(num1_);
//		}else {
//			System.out.println("숫자만 입력가능합니다.");
//			return;
//		}
		
		
//		int num1 = Integer.parseInt(num1_);
//
//		System.out.println("num1 : " + num1);

		// 2. 첫 번째 숫자 입력
//		System.out.println("두 번째 정수 : ");
//		int num2 = sc.nextInt();

		// 3. 나눗셈 수행
//		int result = num1 / num2;
//		System.out.println("결과: " + num1 + "/" + num2 + "=" + result);

	}

}
