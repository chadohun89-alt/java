package park;

import java.util.Scanner;

public class park8 {

	public static void main(String[] args) {
		// 짝수인지 3의 배수인지 판별하기
		// 정수를 입력받아 짝수인지, 3의 배수인지, 둘 다인지, 아무것도 아닌지 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num%2==0 && num%3==0) {
			System.out.println("2와 3의 배수입니다.");
		}else if(num%2==0) {
			System.out.println("2의 배수입니다.");
		}else if(num%3==0) {
			System.out.println("3의 배수입니다.");
		}else {
			System.out.println("아무것도 아니죠~!");
		}

	}

}
