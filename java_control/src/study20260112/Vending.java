package study20260112;

public class Vending {
	// 자판기 클래스

	// 변수
	private String productName; // 음료수 이름
	private int price; // 음료수 가격
	private int stock; // 음료수 수량

	// 생성자
	public Vending(String productName, int price, int stock) {
		super();
		this.productName = productName;
		this.price = price;
		this.stock = stock;
	}

	// 게터 세터
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	// toString 메서드
	@Override
	public String toString() {
		return "Vending [productName=" + productName + ", price=" + price + ", stock=" + stock + "]";
	}

	// toString과, 매개변수 있는 생성자 메서드,
	// 각 변수들의 set, get 메서드 만들기

	// 문제1
	// 음료를 구매하기 위해 돈을 넣었다.
	// 내가 넣은 돈으로 구매가 가능하면
	// 수량을 1 감소시키세요.

//	public void downStuck(int coin) {
//		if(coin >= price && this.stock > 0) {
//			stock--;
//		}
//	}

	public void buy(int money) {
		if (this.price <= money) {
			this.stock--;

		}
	}

	// 문제2
	// 음료를 자판기에서 구매하는데
	// 수량이 충분한지 아니면 품절인지
	// 확인할 수 있는 메서드 만들기
	// 품절이면 "품절입니다." 출력
	// 수량이 있으면 수량 출력

	public void check() {
		if (this.stock == 0)
			System.out.println(productName+" 품절입니다.");
		else
			System.out.println(productName+" 잔여수량 : " + this.stock);
	}
	
	// 문제3
	// 음료수의 수량이 부족하여 자판기 관리자가 채우려고 한다.
	// 해당 음료수의 수량을 채우기 위해 얼만큼 넣었는지
	// 그리고 해당 음료수의 수량을 증가 시켜주세요.
	
//	public void refill(int refillStock) {
//		this.stock += refillStock;
//	}
	
	public void add( int addStock) {
		this.stock += addStock;
	}

} // 클래스 끝
