package exampleArray;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		/*
		 * <개요>
		 * 
		 * 영화관 좌석은 (인트)이며, 배열로 관리한다.
		 * 
		 * int[] seats = new int[50];
		 * 
		 * 0 : 빈 좌석 1 : 예약된 좌석
		 * 
		 * 사용자로부터 예약인원 수 를 입력받아 원하는 위치(인덱스) 탐색하여 연속된 빈 좌석이 있으면 예약 처리하시오.
		 * 
		 * 
		 * <규칙>
		 * 
		 * 1. 연속된 빈 좌석이 있으면 1로 변경
		 * 
		 * 2. 예약이 완료되면 예약된 좌석 번호 출력
		 * 
		 * 3. 연속 좌석이 없으면 "연속 좌석이 없습니다" 출력 1차원 배열만 사용
		 * 
		 * 4. 앞자리 우선 예약
		 * 
		 * 
		 * <예시>
		 * 
		 * 예약 인원 수 : 3 
		 * 3석 예약 완료 (1번 ~ 3번)
		 * 
		 * 예약 인원 수 : 5 
		 * 연속 좌석이 없습니다
		 * 
		 * 
		 */



		// 배열 선언
		int[] seats = new int[50];
		int count1 = 0; // 공석이 연속되는 경우 카운트
		int count2 = 0; // 예약 완료된 경우 카운트

		// 예약인원 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("예약 인원을 입력해 주세요 : ");
		int user = sc.nextInt();

		// 배열에 공석과 예약석 채워넣기
		for (int i = 0; i < seats.length; i++) {
			seats[i] = (int) Math.floor(Math.random() * 2);
			System.out.println("좌석 " + (i + 1) + "번 : " + seats[i]);

			// 조건문1 (연속된 공석 찾기)
			if (seats[i] == 1)
				count1 = 0;

			else if (seats[i] == 0)
				count1++;

			// 조건문2 (예약 자리수와 공석이 일치시 할 일 > 1번 배열 값 변경(예약 처리), 2번 예약좌석 출력)
			if (count1 == user) {
				count1 = 0; // 예약 하면서 카운트 초기화
				count2++;
				
				// 배열값 1로 변경(예약 처리)
				for(int k = 0; k < user; k++ ) {
				seats[i-k] = 1;
				System.out.println("예약처리 확인 :"+(i-k+1)+"번 : "+seats[i-k]);				
				}
				
				// 예약좌석 출력
				System.out.println("예약 인원 수 : " + user + "명");
				System.out.println(user+"석 예약 완료 (" + (i - user + 2) + "번 ~ " + (i + 1) + "번)");
				break;
				// 3석 예약 완료 (1번 ~ 3번)
			}

		} // 반복문 밖
		
		// 조건문3 (예약 처리 못한 경우)
		if (count2 == 0) {
			System.out.println("연속좌석이 없습니다");
		}

	}
}
