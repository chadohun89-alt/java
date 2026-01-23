package exam28;

public class ProductDTO {
	
	private String ProductName;
	private int productPrice;
	private int buyCounter;
	private int total;
	
	
	// 생성자
	public ProductDTO(String productName, int productPrice, int buyCounter) {
		ProductName = productName;
		this.productPrice = productPrice;
		this.buyCounter = buyCounter;
		this.total = productPrice * buyCounter;
	}
	
	// 출력 메서드
	public void display() {
		System.out.printf("%s \t %d \t %d \t %d\n",ProductName, productPrice, buyCounter, total);
	}
	
	
	// getter & setter
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getBuyCounter() {
		return buyCounter;
	}
	public void setBuyCounter(int buyCounter) {
		this.buyCounter = buyCounter;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
	
}
