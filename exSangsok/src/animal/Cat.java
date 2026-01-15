package animal;

import common.Animal;

public class Cat extends Animal {

	public Cat(String name, int age, String master) {
		super(name, age, master);
	}

	@Override
	public void bark() {
		System.out.println("고양이 울음소리 : 니야옹~ ");
		
	}


	

	
	
}
