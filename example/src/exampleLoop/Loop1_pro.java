package exampleLoop;

import java.util.Scanner;

public class Loop1_pro {

	public static void main(String[] args) {
		// 1월 5일 과제

		// 가위 바위 보 게임을 총 15판 진행 > for문으로 15회 반복, if문으로 승, 패, 무 구분
		// 게임을 진행 하면서 1판 끝날 때 마다
		// 몇승, 몇패, 몇무 출력하기 > count1, count2, count3로 처리
		// 가위 ==1 / 바위 == 2 / 보 == 3

		int winCount = 0, loseCount = 0, drawCount = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 15; i++) {
			int com = (int) Math.floor(Math.random() * 3) + 1;
			System.out.print("가위(1), 바위(2), 보(3) 입력 : ");
			int user = sc.nextInt();

			System.out.println(" 컴퓨터 : " + com + " 나 : " + user);

			int res = user - com;
			if (res == 0) {
				System.out.println(" 비김 ");
				drawCount++;
			} else if (res == -2 || res == 1) {
				System.out.println("나의 승리");
				winCount++;
			} else {
				System.out.println("나의 패배....");
				loseCount++;
			}

			System.out.println("승 : " + winCount + " 패 : " + loseCount + " 무 : " + drawCount);
		}
	}
}
