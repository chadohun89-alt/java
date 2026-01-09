package study20260109;

public class Example5 {

	public static void main(String[] args) {
		// 문제 5. 
		// 3,726초를 1시간 2분 6초로 표현하기
		
		int basicSecond = 3726;
		
		int hour = 3600;
		int minute = 60;
		
		int hourNum = basicSecond / hour;
		int minuteNum = (basicSecond % hour) / minute;
		int secondNum = (basicSecond % hour) % minute;
		
		System.out.println(hourNum+"시간"+" "+minuteNum+"분"+" "+secondNum+"초");
		
		

	}

}
