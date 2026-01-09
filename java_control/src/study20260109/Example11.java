package study20260109;

public class Example11 {

	public static void main(String[] args) {
		// 문제 11.
		// 배열문제
		// 값이 짝수면 result에서 더한다.
		// 값이 홀수면 result에서 뺀다.
		// 마지막 result 값을 출력하시오.
		// 3
		int[] nums = {3, 8, 15, 22, 7, 10};
		int result = 0;
		
		for(int i =0; i<nums.length; i++) {
			
			
			if(nums[i]%2==0) { // 짝수 판별
				result += nums[i];
			} else if(nums[i]%2==1) {// 홀수 판별	
				result -= nums[i];
			}
		}

		System.out.println(result);
	}

}
