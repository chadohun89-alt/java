package method;

public class Cat {

	String breed;
	String name;
	String gender;
	int age;
	
	Cat(){}
	
	Cat(String breed){
		this("먼치킨", "뽀식", "수컷");
	}
	
//	Cat(String breed, String name){
//		this.breed = breed;
//		this.name = name;
//	}
	
	Cat(String breed, String name, String gender){

		this.name = name;
		this.breed = breed;
		this.gender = gender;
	}
	
	
	
}
