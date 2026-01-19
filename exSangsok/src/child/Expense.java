package child;

import common.Transaction;

public class Expense extends Transaction {

	/*	 

	  2. 자식 클래스
	  	- Transaction 상속
	  	- 추상메서드 오버라이드
	  		○ Income : 잔액증가 (money 값만큼 amount 증가)
	  		○ Expense : 잔액감소 (money 값만큼 amount 감소)
	  		○ Transfer : 잔액감소 (money 값만큼 amount 감소)
	 
	 */
	
	// 생성자
	public Expense(int money, String date, String memo) {
		super(money, date, memo);
	}

	
	// 추상메서드 구현 - Expense는 잔액 감소
	@Override
	public void transact() {
		super.amount -= money;
		System.out.println(date);
		System.out.println("지출 : "+money+"원 / 출처 : "+memo+" / 잔액 : "+amount+"원");
		
	}






	
	
}
