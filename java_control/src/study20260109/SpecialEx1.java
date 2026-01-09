package study20260109;

public class SpecialEx1 {

	public static void main(String[] args) {
		// 특별 문제1
		/* 학원 관리 시스템 월별 매출 데이터를 배열로 관리하는 중
		 * <구해야 하는 값들>
		 * 1. 연간 총 매출
		 * 2. 월 평균 매출(정수)
		 * 3. 최고 매출 월과 금액
		 * 4. 최저 매출 월과 금액
		 * 5. 평균 이상 매출인 월의 개수
		 */

		int [] monthlySales = {1200, 950, 1430, 800, 1600, 1700, 900, 1100, 1550, 1800, 1300, 2000};
		// (1월 ~ 12월 순서, 단위 : 만원)
		
		// 변수 설정
		int tot=0; // 1번 연간 총매출 변수
		int avg=0; // 2번 월 평균 매출 변수
		int max = monthlySales[0]; // 3번 최고 매출 금액 변수
		int maxMonth = 0; // 3번 최고 매출 월 변수
		int min = monthlySales[0]; // 4번 최저 매출 금액 변수
		int minMonth = 0; // 4번 최저 매출 월 변수
		int count = 0; // 5번 평균 이상인 월의 개수 변수
		
		for(int i=0; i<monthlySales.length;i++) {
			tot += monthlySales[i]; // 1번
			avg = tot/monthlySales.length; // 2번
			
			// 조건문 3번 구하기(최고)
			if(max<monthlySales[i]) {
				max = monthlySales[i];
				maxMonth = i+1;
			}
			
			// 조건문 4번 구하기(최저)
			if(min>monthlySales[i]) {
				min = monthlySales[i];
				minMonth = i+1;
			}
			

		}
		//반복문+조건문 5번 구하기(평균 이상인 월의 개수)
		for(int i =0; i<monthlySales.length;i++) { 
			if(monthlySales[i] >= avg) {
				count++;
			}
		}
		
		System.out.println("연간 총 매출 : "+tot+"원"); // 1번
		System.out.println("월 평균 매출 : "+avg+"원"); // 2번
		System.out.println("최고매출 금액 : "+max+"원"+", 최고 매출 월 : "+maxMonth+"월"); // 3번
		System.out.println("최저매출 금액 : "+min+"원"+", 최저 매출 월 : "+minMonth+"월"); // 4번
		System.out.println("평균 이상인 월의 개수 : "+count+"개"); // 5번
		
		
		
		
	}

}
