package study20260105;

import java.util.Scanner;

public class LoopMain {

	public static void main(String[] args) {

//		for( int i = 1 ;  i <= 10;  i++) {
//			System.out.println( i );
//		}

//		for (int i = 1; i <= 100; i++) {
//			if (i % 10 == 0)
//				System.out.println(i);
//		}

		Scanner scan = new Scanner(System.in);

//		System.out.print("정수 입력 : ");
//		int num = scan.nextInt();
//		
//		for(int i = 1; i<=num ; i++) {
//			System.out.println(i);
//		}

		// 1부터 12까지 출력하는데
		// 4의 배수에는 four라고 출력하시오

//		for (int i = 1; i <= 12; i++) {
//
//			if (i % 4 == 0) {
//				System.out.println("숫자 : four");
//			} else {
//				System.out.println("숫자 : " + i);
//			}
//		}
//
//		int count = 0;
//
//		for (int i = 1; i <= 1000; i++) {
//			if (i % 17 == 0) {
//				count++;
//			}
//		}
//		System.out.println("17의 배수 : " + count + "개");

		// 문제
		// 동전 앞면 뒷면 맞추기 게임
		// 게임을 총 10판 진행 하기
		// 게임에서 내가 맞춘 횟수는 총 몇번인지 출력하기

		// 고려
		// count필요 > 내가 맞춘 회수 / for문 필요 > 10판 진행 / if문 필요 > 동전 앞면 뒷면

//		int count = 0; // 횟수 카운트용 변수
//		System.out.print("동전 앞(1) 뒤(2)면 맞추기 10회 \n입력 : ");
//
//		
//		for (int i =1 ; i<=10 ; i++) { // 총 10회 반복
//			
//			// 난수 설정(1-앞면, 2-뒷면)과 나의 선택
//			int coin = (int) Math.floor(Math.random()*2)+1;
//			int user = scan.nextInt();
//			
//			//조건문 (내가 고른 동전의 면이 실제와 일치하는지)
//			if (user == coin) {
//				System.out.println("맞추었습니다.");
//				count++;
//			}else {
//				System.out.println("틀렸습니다.");
//			}
//		}
//		System.out.println("내가 맞춘 횟수 : "+count+"회");

//		int ok = 0; // 내가 맞춘 건지 누적저장 변수
//
//		for (int i = 1; i <= 10; i++) {
//			int coin = (int) Math.floor(Math.random() * 2) + 1;
//
//			// 1 - 앞면, 2 - 뒷면
//			System.out.println("동전 앞면 뒷면 맞추기");
//			System.out.print("1-앞면, 2-뒷면 \n 입력 : ");
//			int user = scan.nextInt();
//
//			// 조건문 (내가 맞추었는지 여부)
//			if (user == coin) {
//				System.out.println("맞추기 성공!!!");
//				ok++;
//			} else
//				System.out.println("맞추기 실패.....");
//		}
//		System.out.println("내가 맞춘 횟수 : " + ok);

		// 무한 루프 - 반복문은 조건식이 참인경우에 계속 반복 수행을 한다.
		// 무조건 참이 되게 조건식을 설정하면 무한 반복을 할 수 있다.
		// 무한루프는 지정된 회수가 없기에 멈추지 않고 계속 동작한다.
		// 그래서 무한루프 구현 시 특정 조건을 걸어 둔다.

//		for (;true;) {
//			
//		}

//		for(;;) {
//			;
//		}

//		while(true) {
//			System.out.println(" 나는 무한 루프이다.");
//		}

//		int i = 10;
//		while(true) {
//			System.out.println(i);
//			i++;
//			if( i == 40 ) break;
//		}

//		while (true) {
//			int num = (int) Math.floor(Math.random() * 20) + 1;
//			System.out.println(num);
//			if (num == 11) break;
//		}
		
		
		// 랜덤 숫자 맞추기 게임
		
		int com = (int)Math.floor(Math.random()* 50)+1;
		
		while(true) {
			System.out.print("1~50 중 입력 : ");
			int user = scan.nextInt();
			
			if( user > com ) {
				System.out.println("DOWN");
			}
			if(user < com) {
				System.out.println("UP");
			}
			if(user == com ) {
				System.out.println(" 정답 !");
				break;
			}
		}
		
		
	}
	
}

/*
 * 1월 5일 과제1
 * 
 * 가위 바위 보 게임을 총 15판 진행 > for문으로 15회 반복, if문으로 승, 패, 무 구분 게임을 진행 하면서 1판 끝날 때 마다
 * 몇승, 몇패, 몇무 출력하기 > count1, count2, count3로 처리
 * 
 * 1월 5일 과제2
 * 
 * 업다운 게임. 내가 숫자를 제시하면 컴퓨터가 맞추도록 설계. 랜덤 범위를 업 다운으로 줄이도록 설계
 * 범위 1~50
 * 내가 37입력
 * 컴퓨터 25제시
 * 내가 UP, 범위 26~50으로 변경
 * 컴퓨터 40제시
 * 내가 DOWN, 범위 26~39으로 변경
 * 컴퓨터 31제시
 * 내가 UP, 범위 32~39으로 변경
 * 
 * 
 */

/*
 * 반복문 - for, while, do~while 반복문이란 특정 코드를 정해진 횟수만큼 반복 동작 시키는 과정이다. 또는 횟수의 제한 없이
 * 동작 시킬 수 있다.
 * 
 * for문
 * 
 * for( 초기값 ; 조건식; 증감식 ) { 반복 실행할 내용; 반복 실행 할 내용; }
 * 
 * for( int i = 1; i<=9; i = i+2) {
 * 
 * }
 * 
 * 1부터 시작하여 1씩 증가하는 형태로 반복문을 작성한다. 그래야 몇번 반복 시킬 것인지 작성하기도 편하고 파악하기도 빠르고
 * 
 * for(Member m : MemberList) {
 * 
 * }
 * 
 */