package common;

public abstract class Animal {

	private String name;
	private int age;
	private String master;
	
	
	// getter-setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMaster() {
		return master;
	}
	public void setMaster(String master) {
		this.master = master;
	}
	
	// toString
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", master=" + master + "]";
	}
	
	//생성자
	public Animal(String name, int age, String master) {
		this.name = name;
		this.age = age;
		this.master = master;	
	}
	
	
	// bark 메서드
	public abstract void bark();
	
	// scratch 메서드
	public void scratch () {
		System.out.println(name+"의 스크래치!");
	}
	
}
