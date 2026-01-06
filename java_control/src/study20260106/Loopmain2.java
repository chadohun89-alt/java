package study20260106;

import java.util.Scanner;

public class Loopmain2 {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// 랜덤 숫자 맞추기 게임



		// 숫자 입력
		System.out.print("1~50 중 입력 : ");
		int user = scan.nextInt();
		
		// 최댓값 최솟값 변수
		int max = 50, min = 1;
		

		while (true) {
			int com = (int) Math.floor(Math.random() * (max - min + 1)) + min;
			System.out.println("컴퓨터가 고른 숫자 : "+com);
			
			// 난수가 정답보다 큰 경우 ex) 난수 : 40, 정답 : 35
			if (com > user) {
				System.out.println("DOWN");
				max = com - 1; // 최댓값 하락
			}
			
			// 난수가 정답보다 작은 경우 ex) 난수 : 20, 정답 : 35
			if (com < user) {
				System.out.println("UP");
				min = com + 1; // 최솟값 상승
			}
			
			// 난수와 정답이 같은 경우
			if (user == com) {
				System.out.println("");
				System.out.println("정답~!");
				break;
			}
		}

	}

}
