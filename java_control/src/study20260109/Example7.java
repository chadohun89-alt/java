package study20260109;

import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		// 문제 7
		
		int score;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해 주세요 : ");
		score = sc.nextInt();
		
		if(score >=90) System.out.println("A학점");
		else if(score >=80) System.out.println("B학점");
		else if(score >=70) System.out.println("C학점");
		else if(score >=60) System.out.println("D학점");
		else System.out.println("F학점");

	}

}
