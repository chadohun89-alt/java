package animal;

import common.Animal;

public class Bird extends Animal {

	public Bird(String name) {
		super(name);
	}
	
	@Override
	public void sound() {
		System.out.println("짹짹");
	}
	
//	public Bird(String name) {
//		super(name);
//	}
//
//	@Override
//	public void sound() {
//		System.out.println("짹짹");
//	}
	
}
