package method;

public class Product {
	// 상품정보 저장할 수 있는 클래스 (  상품명,  상품 가격, 카테고리 , 수량)
	
	// 변수 설정
	public String productName; // 상품명
	public int price; // 상품 가격
	public String categori; // 카테고리
	public int stock; // 수량
	
	//생성자
	public Product(String productName, int price, String categori, int stock) {
		super();
		this.productName = productName;
		this.price = price;
		this.categori = categori;
		this.stock = stock;
	}
	
	// getter-setter
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
	public String getCategori() {
		return categori;
	}
	public void setCategori(String categori) {
		this.categori = categori;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	// toString
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", price=" + price + ", categori=" + categori + ", stock="
				+ stock + "]";
	}
	
	
	
}
