package study20260109;

public class Example9 {

	public static void main(String[] args) {
		// 문제9.
		// 배열 안 숫자들의 합과 평균 구하기

		int[] arr = { 10, 20, 30, 40, 50 };
		int tot = 0;
		int avg = 0;
		
		// 반복문 (배열 값 모두 더해서 총점 구하기)
		for (int i = 0; i < arr.length; i++) {
			tot += arr[i];
		}
		
		//평균값 구하기
		avg = tot / arr.length;
		
		System.out.println("총합 : " + tot);
		System.out.println("평균 : " + avg);

	}

}
