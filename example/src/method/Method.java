package method;

public class Method {

	public static void main(String[] args) {
		// 사용자 정보 저장할 수 있는 클래스 (  이름, 아이디, 비밀번호, 전화번호 )
		// 상품정보 저장할 수 있는 클래스 (  상품명,  상품 가격, 카테고리 , 수량 )
		
		User user1 = new User("차도헌", "ckehgjs11", "gjsehck111", 01011112222);
		Product product1 = new Product("드라이기",20000,"가전제품",4);
		
		System.out.println(user1);
		System.out.println(product1);
		
		product1.productName = "세탁기";
		System.out.println(product1.productName);
		
		user1.setName("차맹구");
		System.out.println(user1.getName());
		
		
		
		
	}

}
