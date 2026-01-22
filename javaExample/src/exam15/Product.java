package exam15;

public class Product {
	
	// 변수 설정
	String productName;
	int productPrice;
	int productQuantity;
	int bundlePrice;

	
	
	
	// getter-setter
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public int getBundlePrice() {
		return bundlePrice;
	}

	public void setBundlePrice(int bundlePrice) {
		this.bundlePrice = bundlePrice;
	}


	// 번들 계산 메서드
	public int bundlePrice() {
		this.bundlePrice = this.productPrice * this.productQuantity;
		return bundlePrice;
	}
	
	// 생성자 메서드
	public Product(String productName, int productPrice, int productQuantity) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
	}
	
	

	public Product() {
		super();
	}

	// toString 메서드
	@Override
	public String toString() {
		return productName +" "+  productPrice + " " + productQuantity + " " +
				bundlePrice;
	}
	
	
	
}
