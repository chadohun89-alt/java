package exampleControl;

import java.util.Scanner;

public class Control1_pro {

	public static void main(String[] args) {
		// 주차장에 요금이 기본요금은 1000원이다.
		// 기본시간은 30분이다.
		// 10분 당 100원씩 추가 예) 39분은 1000원, 40분은 1100원
		// 단 4시간 이상 주차 시 기본요금은 2500원이다.
		// 예 ) 3시간 50분 (230분) -> 3000원
		// 		4시간 12분 (252분) -> 2600원

		int cost = 1000; // 기본요금 (30분)
		int inc = 100, incTime = 10;// 10분당 100원
		int time = 30; // 기본 시간 30분
		
		// 주차시간 총 몇분 입력
		Scanner scan = new Scanner(System.in); // 시스템(컴퓨터)으로부터 입력된 키 값 받기
		
		System.out.println(" 총 몇분 주차 : ");
		int pTime = scan.nextInt(); //키보드 입력 값 받아서 정수로 변환
		
		pTime /= 10; // pTime = pTime/10 -3
		if(pTime >=24) { //4시간 이상 주차했다면
			cost = 2500; // 4시간 이상에 대한 기본요금 변경
			pTime -= 24; // 4시간 빼기, 4시간에 대한 요금은 2500원 나머지는 10분당 요금
		} else if (pTime > 3) {
			// 4시간 이상이 아니라면, 기본시간 30분으로 계산해야 된다.
			pTime -= 3; // 기본시간이 30분이니까 3빼기
		}else { // 최초 기본시간 안에서 주차 한 경우
			pTime = 0;
		}
		
		// 주차 요금 계산		
		int price = cost + pTime *100;
		System.out.println(" 주차요금 : "+ price + "원");
		

		
		
/* 기본시간 30분
 * 40분부터 추가요금 100원
 * 60분에 600원
 * 1시간 1300원, 2시간 1900원, 3시간 2500원, 3시간 50분 3000원, 4시간 2500원
 */
		
		

	}

}
