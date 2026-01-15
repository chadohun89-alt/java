package animal;

import common.Animal;

public class Puma extends Animal {

	public Puma(String name, int age, String master) {
		super(name, age, master);
	}

	@Override
	public void bark() {
		System.out.println("퓨마 울음소리 : 사아아아악!");
	}
	
	@Override
	public void scratch() {
		System.out.println(this.getName()+"의 스크래치! 효과는 뛰어났다!");
	}
	
	

}
