package study20260109;

public class Example4 {

	public static void main(String[] args) {
		// 문제4. 세과목의 총점과 평균 구하기.

		int kor = 85;
		int eng = 90;
		int mat = 78;
		
		int subjects = 3;
		
		int tot = kor+eng+mat;
		int avg = tot/subjects;
		
		System.out.println(tot);
		System.out.println(avg);

	}

}
