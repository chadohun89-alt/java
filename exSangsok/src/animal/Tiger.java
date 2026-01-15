package animal;

import common.Animal;

public class Tiger extends Animal {

	public Tiger(String name, int age, String master) {
		super(name, age, master);
	}
	
	@Override
	public void bark() {
		System.out.println("호랑이 울음소리 : 어흥~!");
	}

	@Override
	public String toString() {
		return "Tiger [toString()=" + super.toString() + "]";
	}
	
	
	
}
