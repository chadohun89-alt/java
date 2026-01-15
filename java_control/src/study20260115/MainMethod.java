package study20260115;

public class MainMethod {

	public static void main(String[] args) {

		DBConnect connect = new DBConnect();
		Beverage[] beverages = connect.selectData();
		
		System.out.println(beverages[0]);
		System.out.println(beverages[1]);
		System.out.println(beverages[2]);
		System.out.println(beverages[3]);

	}

}
