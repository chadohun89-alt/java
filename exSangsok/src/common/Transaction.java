package common;

public abstract class Transaction {
	/*	 
	  <구조 설계>
	  1. 부모 클래스
	  	- 변수 설정 (amount-static, money, date, memo)
	  	- 추상메서드 정의(transact)
	  	
	  	
	  2. 자식 클래스
	  	- Transaction 상속
	  	- 추상메서드 오버라이드
	  		○ Income : 잔액증가 (money 값만큼 amount 증가)
	  		○ Expense : 잔액감소 (money 값만큼 amount 감소)
	  		○ Transfer : 잔액감소 (money 값만큼 amount 감소)
	  		
	  3. 메인 메서드
	  	- Transaction 타입의 변수들에 각각 Income, Expense, Transefer 인스턴스 넣기
	  	- Transfer[] 타입의 배열 생성해서 인덱스에 자식타입 객체들 넣기
	  	- 향상된 for문 이용해서 배열의 각 인데스안에 담긴 객체들의 오버라이딩 된 메서드 호출
	  	- 최종금액 출력.
	 
	 */
	
	// 공통 변수 설정
	protected static int amount;
	protected int money;
	protected String date;
	protected String memo;
	
	
	// 생성자
	public Transaction(int money, String date, String memo) {
		this.money = money;
		this.date = date;
		this.memo = memo;
	}


	// getter-setter
	public static int getAmount() {
		return amount;
	}



	public static void setAmount(int amount) {
		Transaction.amount = amount;
	}



	public int getMoney() {
		return money;
	}



	public void setMoney(int money) {
		this.money = money;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public String getMemo() {
		return memo;
	}



	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	


	// toString
	@Override
	public String toString() {
		return "Transaction [money=" + money + ", date=" + date + ", memo=" + memo + "]";
	}


	// 추상메서드
	public abstract void transact();
	

	
	
	
	
	
	
	
	
}
