package study20260112;

public class Method2 {

	public static void main(String[] args) {

		// 객체 생성 : 오렌지, TOP
		Vending orange = new Vending("쌕쌕 오렌지", 1500, 2);
		Vending top = new Vending("Top 블랙", 2700, 3);

		// 문제1 결과 확인
		orange.buy(2000);
		System.out.println( orange );
		orange.buy(2000);
		System.out.println( orange );
		
		top.buy(2000);
		System.out.println( top );
		
		// 문제2 결과 확인
		orange.check();
		top.check();
		
		// 문제3 결과 확인
		orange.add(3);
		orange.check();
		
		top.add(3);
		top.check();
		
		
	} // 메인 메서드 끝

}
