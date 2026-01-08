package method;

public class Method {

	public static void main(String[] args) {
		// 고양이 품종, 이름, 성별, 나이로 생성자 메서드 실험

		Cat cat1 = new Cat();
		Cat cat2 = new Cat("먼치킨", "뽀식", "수컷");
		
		System.out.println(cat2.name);
		
		
	}

}
