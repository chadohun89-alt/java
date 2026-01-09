package study20260109;

public class Example10 {
	public static void main(String[] args) {
		// 문제10.
		// 배열에서 최댓값 최솟값 찾기



		int[] scores = { 87, 65, 92, 100, 74 };
		int max = scores[0];
		int min = scores[0];
		
		
		for (int i = 0; i < scores.length; i++) {

			
			if (max < scores[i])
				max = scores[i];
			
			if (min>scores[i]) {
				min = scores[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);

	}
}
