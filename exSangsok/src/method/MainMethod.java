package method;

import common.Animal;
import animal.*;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 다형성1 애니멀-타이거
		Animal animal = new Tiger("호돌이", 3, "타잔");
		System.out.println(animal); // toString 오버라이드
		animal.bark(); // 추상 메서드 오버라이드
		animal.scratch(); // 일반 메서드 상속
		
		System.out.println();
		
		
		// 다형성2 애니멀-라이온
		Animal animal2 = new Lion("철사자", 13, "넘버원 사육사");
		System.out.println(animal2); // toString 오버라이드
		animal2.bark();
		animal2.scratch();
		
		System.out.println();
		
		
		// 타이거 객체 상속 실험
		Tiger tiger = new Tiger("호왕", 8, "훈이");
		System.out.println(tiger); // toString 오버라이드
		tiger.bark(); // 추상 메서드 오버라이드
		tiger.scratch(); // 일반 메서드 상속
		tiger.setName("아타호");
		System.out.println(tiger.getName());
		tiger.scratch();
		
		System.out.println();
		
		// 다형성3 애니멀 - 캣
		Animal animal3 = new Cat("뚜뚜", 2, "차도헌");
		System.out.println(animal3);
		animal3.bark(); // 추상메서드 오버라이드
		animal3.scratch(); // 일반메서드 상속
		System.out.println();
		
		// 다형성4 애닐멍 - 퓨마 (this와 super 실험)
		Animal animal4 = new Puma("하츄핑", 4, "이범배");
		System.out.println(animal4);
		animal4.bark(); // 추상메서드 오버라이드
		animal4.scratch(); // 일반메서드 오버라이드
	}

}
