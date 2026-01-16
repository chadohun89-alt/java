package child;

import common.Transaction;

public class Income extends Transaction {
	/*	 

	  2. 자식 클래스
	  	- Transaction 상속
	  	- 추상메서드 오버라이드
	  		○ Income : 잔액증가 (매개변수 값만큼 amount 증가)
	  		○ Expense : 잔액감소 (매개변수 값만큼 amount 감소)
	  		○ Transfer : 잔액감소 (매개변수 값만큼 amount 감소)
	 
	 */
	
	
	// 생성자
	public Income(int money, String date, String memo) {
		super(money, date, memo);
	}

	
	// 추상메서드 구현 - Income은 잔액증가


	@Override
	public void transact() {
		super.amount += this.money;
		System.out.println(date);
		System.out.println("수입 : "+money+"원 / 출처 : "+memo+" / 잔액 : "+amount+"원");
		
	}






	
	
	
}
