package exampleLoop;

import java.util.Scanner;

public class Loop1 {

	public static void main(String[] args) {
		// 	1월 5일 과제
		
		// 가위 바위 보 게임을 총 15판 진행 > for문으로 15회 반복, if문으로 승, 패, 무 구분
		// 게임을 진행 하면서 1판 끝날 때 마다
		// 몇승, 몇패, 몇무 출력하기 > count1, count2, count3로 처리
		// 가위 ==1 / 바위 == 2 / 보 == 3
		
		int count1 = 0; // 승리 카운트
		int count2 = 0; // 패배 카운트
		int count3 = 0; // 무승부 카운트
		int count4 = 0; // 총횟수 카운트
		
		Scanner sc = new Scanner(System.in);

		
		// 반복문 15회 반복
		for(int i =1;i<=15;i++) {
			System.out.print("안 내면 술래 가위바위보~ (가위: 1, 바위: 2, 보: 3) : ");
			
			// 컴퓨터와 user의 가위바위보 정하기
			int com = (int)Math.floor(Math.random()*3)+1;
			int user = sc.nextInt();
			
			//조건문 승리, 패배, 무승부
			if((user ==1 &&  com==3)||(user == 2&& com == 1)||(user==3 && com==2) ) {
				count1++;
				System.out.print("승리 : "+count1+"회 / ");
			}else if((com ==1 &&  user==3)||(com == 2&& user == 1)||(com==3 && user==2)) {
				count2++;
				System.out.print("패배 : "+count2+"회 / ");
			}else {
				if(user > 3) {
					System.out.println("숫자를 바로 입력하시오");
				}else {
					count3++;
					System.out.print("무승부 :"+count3+"회 / ");
				}
			}
			// 총횟수 카운트
			count4++;
			System.out.println("총횟수 : "+count4+"회");
		}
System.out.println("---<게임 종료>--- \n 승리 : "+count1+"회 \n 패배 : "+count2+"회 \n 무승부 :"+count3+"회");
	}

}
