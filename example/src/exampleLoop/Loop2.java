package exampleLoop;

import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		/*
		 * 1월 5일 과제2
		 * 
		 * 업다운 게임. 내가 숫자를 제시하면 컴퓨터가 맞추도록 설계. 랜덤 범위를 업 다운으로 줄이도록 설계 범위 1~50 내가 37입력 컴퓨터
		 * 25제시 내가 UP, 범위 26~50으로 변경 컴퓨터 40제시 내가 DOWN, 범위 26~39으로 변경 컴퓨터 31제시 내가 UP, 범위
		 * 32~39으로 변경
		 */
		
		// 최댓값과 최솟값 변수
		int max = 50;
		int min = 1;
		
		// 숫자 입력
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1~50 중 입력 : ");
		int user = scan.nextInt();
		
		// 컴퓨터 숫자 고르기
		int com = (int) Math.floor(Math.random() * max) + min;
		System.out.println("컴퓨터가 고른 숫자 : " + com);

		
		// 반복문과 조건문
		// 반복문 컴퓨터가 정답을 맞출 때까지 반복
		// 조건문 만약 컴퓨터가 제시한 숫자가 정답보다 낮다면 UP, 높다면 DOWN 출력
		// 조건문 UP, DOWN 반영해서 다시 범위 지정
		while (true) {

			if (com < user) { // 난수가 정답보다 작은 경우 /ex) 난수 : 35, 정답 : 40
				System.out.println("UP");
				min = com+1; // 최솟값 상승
				com = (int) Math.floor(Math.random() * (max - min + 1)) + min;

				System.out.println("컴퓨터가 고른 숫자 : " + com);
			} else if (com > user) { // 난수가 정답보다 큰 경우 /ex) 난수 : 35, 정답 : 25
				System.out.println("DOWN");
				max = com-1; // 최댓값 하락
				com = (int) Math.floor(Math.random() * (max - min + 1)) + min;
				System.out.println("컴퓨터가 고른 숫자 : " + com);
			} else if (user == com) {
				System.out.println("");
				System.out.println("정답~!!");
				break;
			}

		}
	}
}
