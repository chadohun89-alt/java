package exam23;

public class GenericEx {

	public static void main(String[] args) {
		Box<String> stringBox = new Box<>();
		stringBox.set("Hello Java");
		String str = stringBox.get();
		System.out.println("str : "+str);
		
		Box<Integer> intBox = new Box<>();
		intBox.set(123);
		int value = intBox.get();
		System.out.println("value : " + value);
		
//		stringBox.set(123);

	}

}
