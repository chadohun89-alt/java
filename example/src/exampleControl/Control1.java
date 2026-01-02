package exampleControl;

import java.util.Scanner;

public class Control1 {

	public static void main(String[] args) {
		// 주차장에 요금이 기본요금은 1000원이다.
		// 기본시간은 30분이다.
		// 10분 당 100원씩 추가 예) 39분은 1000원, 40분은 1100원
		// 단 4시간 이상 주차 시 기본요금은 2500원이다.
		// 예 ) 3시간 50분 (230분) -> 3000원
		// 		4시간 12분 (252분) -> 2600원

		// 요금
		int bW = 1000; // 기본요금(basic wage)
		int sBW = 2500; // 4시간 요금(surcharge wage)
		int wage = 0;
		int surcharge = 100; // 할증요금 10분당 100원
		int payment = 0; // 지불요금
		
		//시간
		int basicT = 30; // 기본시간 (basic time)
		int time = 0; // 실제 주차시간

		
		
		Scanner kbd = new Scanner(System.in);
		System.out.println("주차시간을 분단위로 입력해 주세요");
		time = kbd.nextInt();
		int surchargeT = (time-basicT)/10; // 할증 계산 시간 변수

		if( time >= 240  ) {
			wage = sBW;
			surchargeT = (time-basicT-210)/10;
		
		}else {
			wage = bW;
		}
		
		if (time >=40) {
			payment = (surchargeT*surcharge)+wage;
			System.out.println("납부 요금 : "+payment);
		}else {
			payment = wage;
			System.out.println("납부 요금 : "+payment);
		}

		
/* for문, if문으로 접근
 * 기본시간 30분
 * 40분부터 추가요금 100원
 * 60분에 600원
 * 1시간 1300원, 2시간 1900원, 3시간 2500원, 3시간 50분 3000원, 4시간 2500원
 */
		
		

	}

}
