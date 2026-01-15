package animal;

import common.Animal;

public class Lion extends Animal {

	public Lion(String name, int age, String master) {
		super(name, age, master);
	}

	@Override
	public void bark() {
		System.out.println("사자 울음 소리 : 크헝헝~! ");
		
	}

	@Override
	public String toString() {
		return "Lion [name=" + super.getName() + ", "
				+ "age=" + super.getName() + 
				", master=" + super.getMaster() + "]";
	}

	
	
//	public Lion(String name, int age, String master) {
//		super("철호", 12, "사육사넘버원");
//		
//	}

	
}
