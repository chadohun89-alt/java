package study20260109;

public class SpecialEx2 {

	public static void main(String[] args) {
		// 특별 문제2
		/* 훈련생 출결 정보가 숫자 코드 배열로 관리되고 있다.
		 * <구해야하는 값들>
		 * 1. 출석 / 지각 / 결석 횟수 각각 계산
		 * 
		 * 2. 출결 점수 계산
		 *  - 출석 : +1점
		 *  - 지각 : 0점
		 *  - 결석 : -1점
		 *  
		 * 3. 출결 위험 출력
		 * 	- 결석 3회이상 또는
		 * 	- 출결 점수 <= 8
		 */

		
		/* <생각 정리>
		 * 
		 * 우선 배열과 변수들을 설정한다.
		 * 변수 : (정수타입) 출석, 지각, 결석
		 * 반복문 + 조건문 : 출결 횟수와 점수 구하기
		 * 조건문 : 논리연산자 이용. 두가지 조건 모두 충족하면 "출결 위험 출력"
		 * 
		 */

		// 배열 및 변수 설정
		int [] attendance = {1,1,2,1,3,1,2,3,1,1,1,2,3,3,1};
		
		int score=0; // 출결 점수
		
		int countAt = 0; // 출석 횟수
		int countPer = 0; // 지각 횟수
		int countAb = 0; // 결석 횟수
		
		// 반복문 + 조건문 (출석, 지각, 결석 횟수 구하기) (출결 점수 구하기)
		
		for(int i=0; i<attendance.length;i++) {
			// 출석한 경우 > +1점 / 출석 카운팅
			if(attendance[i] ==1) {
				score ++;
				countAt++;
			}
			// 지각한 경우 > 0점 / 지각 카운팅
			if(attendance[i] ==2) {
				countPer++;
			}
			// 결석한 경우 > -1점 / 결석 카운팅
			if(attendance[i] ==3) {
				score--;
				countAb++;
			}
			
			
		}
		System.out.println("출석횟수:"+countAt+", 지각횟수:"+countPer+", 결석횟수:"+countAb);
		System.out.println("출결 점수 : "+score);
		if (countAt >=3 ||score >=8) {
			System.out.println("출결 위험");
		}
		
		
		
	}

}
