package method;

public class BankAccount {
	/*
	 * 은행계좌
	 *  변수 : 소유자 , 잔액
	 *  메서드 : 잔액 체크, 잔액 부족알림 , 지출
	 */
	
	// 변수
	private String user;
	private int deposit;
	
	
	public BankAccount(String user, int deposit) {
		super();
		this.user = user;
		this.deposit = deposit;
	}

	// 메서드1 잔액 체크
	public void check() {
		System.out.println("잔액 : "+deposit+"원");
	}
	
	// 메서드2 지출
	public void buy (String productName, int price) {
		if(this.deposit>=price && this.deposit>=0) { 
			this.deposit -= price;
			System.out.println("구매 물건 : "+productName+
					" / 물건 가격 : "+price+" / 잔액 : "+deposit+"원");
		}
		else System.out.println("잔액이 부족합니다."+" 부족한 금액 : "+(price-deposit)+"원");
	}
	
	

	
}
