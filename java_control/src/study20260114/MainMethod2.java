package study20260114;

public class MainMethod2 {

	public static void main(String[] args) {
		
		DBConnect3 connect3 = new DBConnect3();
		Sword[]	swords = connect3.findAll();
		
		System.out.println(swords[5]);
		
		

	}

}
