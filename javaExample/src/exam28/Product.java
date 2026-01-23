package exam28;

public class Product {
	/*
	
	<구조 설계>
	
	1. 상품(데이터) 클래스
	상품은 따로 클래스 만들어서 운영
	필드 : 이름, 가격, 수량
	메서드 : 
			
	
	2. 실행 클래스
	안내문구는 > 반복문으로 안내
	
	리스트 생성.
	1번 목록은 리스트 내용 뿌려서 보여주기 
		> 향상된 for문으로 리스트 안의 내용 하나씩 뿌려서 보여주기
		> 객체 toString()으로 준비
	
	2번 등록은 리스트 add()메서드 활용 
		> ()안에는 객체의 생성자가 들어가야함
		> 생성자는 이름, 가격, 수량 들어가야함
		
	3번 수정은 리스트 set() 메서드 활용
		> ()안에도 마찬가지로 생성자가 들어가야함
		
	4번 삭제는 리스트 remove() 메서드 활용
		> 인덱스 번호만 있으면 처리 가능
		
	0번 종료는 while문으로 가능.
		> 조건식이 명령어 변수 int process != 0 으로 짜면 될듯

	 */
	
	// 이름, 가격 수량
	// 생성자(이름, 가격, 수량)
	// toString
	
	// 필드 선언
	String name;
	int price;
	int quentity;
	
	// 생성자
	
	
	public Product(String name, int price, int quentity) {
		super();
		this.name = name;
		this.price = price;
		this.quentity = quentity;
	}

	
	public Product() {

	}


	// toString
	@Override
	public String toString() {
		return "상품 : " + name + ", " + price + "원, " + quentity + "개";
	}
	
	
	
	
	
}
