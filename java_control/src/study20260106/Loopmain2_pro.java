package study20260106;

import java.util.Scanner;

public class Loopmain2_pro {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("=========== 숫자야구 ===========");

		int com1 = (int) Math.floor(Math.random() * 9) + 1;
		int com2 = 0;
		int com3 = 0;

		do { // 숫자 3개 중복없이 나오게 하기
			com2 = (int) Math.floor(Math.random() * 9) + 1;
			com3 = (int) Math.floor(Math.random() * 9) + 1;
		} while (!(com1 != com2 && com1 != com3 && com2 != com3));

		System.out.println(com1);System.out.println(com2);System.out.println(com3);

		while (true) {
			int str = 0, ball = 0;
			System.out.println("1~9 중에 숫자 세개 입력 : ");
			int user1 = scan.nextInt();
			int user2 = scan.nextInt();
			int user3 = scan.nextInt();

			if (com1 == user1)
				str++;
			if (com2 == user2)
				str++;
			if (com3 == user3)
				str++;

			if (user1 == com2 || user1 == com3)
				ball++;
			if (user2 == com1 || user2 == com3)
				ball++;
			if (user3 == com1 || user3 == com2)
				ball++;

			System.out.println(str + "스트라이크 , " + ball + "볼 , " + (3 - str - ball) + "아웃");

			if (str == 3) {
				System.out.println("정답!!!");
				break;
			}
		}

//			// 스트라이크 조건식 (유저1 == 컴1, 유저2 == 컴2, 유저3 == 컴3 / or 연산자)
//			if(user1 == com1 || user2 == com2 || user3 == com3) {
//				// 원스트라이크
//				if(user1 == com1) {
//					str++;
//				}
//				if(user2 == com2) {
//					str++;
//				}
//				if(user3 == com3) {
//					str++;
//				}
//			// 볼 조건식 (스트라이크가 아니라면, 유저1 == 컴2 && 유저1 == 컴3 / and 연산자)
//			}else if((user1 == com2 && user1 == com3) ||
//					(user2 == com1&&user2 == com3)||
//					(user3==com1&&user3 == com2)) {
//				if(user1 ==com2 && user1 == com3) {
//					ball++;
//				}
//				if(user2 == com1&&user2 == com3) {
//					ball++;
//				}
//				if(user3==com1&&user3 == com2) {
//					ball++;
//				}
//			}else {

	}

//			System.out.println("스트라이크 : "+ str);
//			System.out.println("볼 : "+ ball);
//			System.out.println("아웃 : "+ out);
}

//		// 랜덤 숫자 맞추기 게임
//
//		// 최댓값 최솟값 변수
//		int max = 50;
//		int min = 1;
//
//		// 숫자 입력
//		System.out.print("1~50 중 입력 : ");
//		int user = scan.nextInt();
//		
//		// 컴퓨터가 고른 숫자
//		int com = (int) Math.floor(Math.random() * (max - min + 1)) + min;
//		System.out.println("컴퓨터가 고른 숫자 : "+com);
////		
////		do {
////		if(user >= max && user <= min) {
////			System.out.println("숫자를 올바로 입력해 주세요");
////		}} while()
//		
//		//반복문 컴퓨터가 정답 찾을 때까지 반복
//		while (true) {
//
//			// 난수가 정답보다 큰 경우 ex) 난수 : 40, 정답 : 35
//			if (com > user) {
//				System.out.println("DOWN");
//				max = com - 1; // 최댓값 하락
//				com = (int) Math.floor(Math.random() * (max - min + 1)) + min;
//				System.out.println("컴퓨터가 고른 숫자 : " + com);
//			}
//			
//			// 난수가 정답보다 작은 경우 ex) 난수 : 20, 정답 : 35
//			if (com < user) {
//				System.out.println("UP");
//				min = com + 1; // 최솟값 상승
//				com = (int) Math.floor(Math.random() * (max - min + 1)) + min;
//				System.out.println("컴퓨터가 고른 숫자 : " + com);
//			}
//			
//			// 난수와 정답이 같은 경우
//			if (user == com) {
//				System.out.println("");
//				System.out.println("정답~!");
//				break;
//			}
//		}
