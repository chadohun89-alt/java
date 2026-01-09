package study20260109;

public class Example8 {

	public static void main(String[] args) {
		// 문제8.
		// 1부터 10까지 숫자의 합을 for문을 이요하여 구하기.
		
		// 변수 설정
		int n = 10;
		int sum = 0;
		
		// 반복문
		for(int i = 1; i<=n; i++) {
			sum+=i;
		}
		
		// 출력
		System.out.println(sum);

	}

}
