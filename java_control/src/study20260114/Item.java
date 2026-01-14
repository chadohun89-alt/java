package study20260114;


public class Item {

	
	// 변수 설정
	private String itemName;
	private int price;
	private String itemMainImage;
	private int itemStock;
	
	// getter-setter
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getItemMainImage() {
		return itemMainImage;
	}
	public void setItemMainImage(String itemMainImage) {
		this.itemMainImage = itemMainImage;
	}
	public int getItemStock() {
		return itemStock;
	}
	public void setItemStock(int itemStock) {
		this.itemStock = itemStock;
	}
	
	// toString
	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", price=" + price + ", itemMainImage=" + itemMainImage + ", itemStock="
				+ itemStock + "]";
	}
	
	// 생성자
	public Item() {
		super();
	}
	public Item(String itemName, int price, String itemMainImage, int itemStock) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.itemMainImage = itemMainImage;
		this.itemStock = itemStock;
	}
	
	
	
	
	
	
	
}
