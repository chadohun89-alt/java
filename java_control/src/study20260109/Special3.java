package study20260109;

public class Special3 {

	public static void main(String[] args) {
		// 특별 문제3
		/* 상담팀이 일주일 동안 상담 기록을 남겼는데, 기록이 숫자 코드로 저장돼 있다.
		 * 팀장인 당신은 아래 기준으로 주간 리포트 1장을 자동으로 뽑아야 한다.
		 * 
		 * <구해야 하는 값들?
		 * 
		 * 1. 총합 요약
		 * 		- 주간 상담 총합
		 * 		- 주간 계약 총합
		 * 		- 주간 클레임 총합
		 * 
		 * 2. 전환율(계약/상담) 최고 요일 찾기
		 * 
		 * 3. 위험 요일 찾기
		 * 
		 * 4. 베스트 2일 뽑기
		 * 		- 1등 : ?요일(점수?)
		 * 		- 2등 : ?요일(점수?)
		 * 
		 * 
		 */
		
		
		
		//배열 및 변수 선언
		
		// 7일동안 하루 상담 수
		int[] 상담수 = {12, 8, 15, 15, 3, 9, 20}; // 월~일
		
		int[] 계약수 = {2, 1, 3, 0, 0, 1, 4}; // 월~일
		
		int[] 클레임수 = {0, 1, 0, 2, 1, 0, 3}; // 월~일
		
		int[] 전환율 = {0, 0, 0, 0, 0, 0, 0}; // 전환율 배열
		
		String [] 위험요일모음 = new String[7];
		
		int [] 베스트요일점수 = {0, 0, 0, 0, 0, 0, 0};
		
		String [] 요일 = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		
		
		
		//총합 요약 변수
		int totCounsle = 0;  // 주간 상담 총합
		int totContract = 0; //주간 계약 총합
		int totClaim = 0; // 주간 클레임 총합
		
		// 전환율 관련 변수
		int bestCR = 계약수[0]*100/상담수[0]; // 최고 전환율 값 변수
		String crDay =""; //최고 전환율 요일 변수
		
		// 위험요일 관련 변수
		String s = null; // 위험요일 없는 경우 처리 변수
		boolean wow = true; // 위험요일 있으면 밑에서 true로 값 변경
		
		// 베스트 2일 관련 변수
		int first = 0;
		int firstIndex = 0;
		int second = 0;
		int secondIndex = 0;
			

		// 반복문
		for(int i=0; i<7; i++) {
			
			//총합 관련
			totCounsle += 상담수[i];
			totContract += 계약수[i];
			totClaim += 클레임수[i];
			
			//전환율 관련
			전환율[i] = 계약수[i]*100/상담수[i];
			if(bestCR < 전환율[i]) { // for문을 통해 최고전환율이 겹치는 경우를 처리 해야함. 일단 넘어가기
				bestCR = 전환율[i];
				crDay = 요일[i];
			}
			
			// 위험 요일 관련
			if(클레임수[i]>=2||(상담수[i]>=10&&계약수[i]<=0) ) {
				위험요일모음[i] = 요일[i];
				s = 위험요일모음[i];
			}else if (s != null) { // 위험 요일 있으면 wow변수 false 처리
				wow = false; 
			}
			
			
			// 베스트 2일 관련
			베스트요일점수[i] = (계약수[i]*5) + (상담수[i]*1) - (클레임수[i]*4);
			
			if(first<베스트요일점수[i]) {
				first = 베스트요일점수[i];
				firstIndex = i;
			}else if(second<베스트요일점수[i]&&second<first){
				second = 베스트요일점수[i];
				secondIndex = i;
			}
		} // 반복문 밖
		
		
		
		// 콘솔창 출력
		System.out.println("출력 결과");
		System.out.println();
		
		// 총합
		System.out.println("주간 상담 총합 : "+totCounsle);
		System.out.println("주간 계약 총합 : "+totContract);
		System.out.println("주간 클레임 총합 : "+totClaim);
		System.out.println();
		
		// 최고 전환율
		System.out.println("최고 전환율 : "+crDay+" ("+bestCR+"%)");
		System.out.println();

		// 위험 요일
		System.out.println("위험 요일 : ");
		for(int i=0; i<위험요일모음.length;i++) {
			if(위험요일모음[i]!=null) {
				System.out.println("-"+위험요일모음[i]);
			}
		}
		if (wow) {System.out.println("위험 요일 없음");} // 위험요일 있으면 false라서 출력 안 됨

		
		// 베스트 1, 2등;
		System.out.println();
		System.out.println("1등 : "+요일[firstIndex]+"(점수 "+first+")");
		System.out.println("2등 : "+요일[secondIndex]+"(점수 "+second+")");

	}

}
