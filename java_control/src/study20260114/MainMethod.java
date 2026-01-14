package study20260114;

public class MainMethod {

	public static void main(String[] args) {
		
		//1번
		// 생성자 메서드 호출되면 자동으로 연결메서드 호출
		DBConnect connect = new DBConnect();
		
		GameMember[] gameMembers = connect.findAll();
		
		System.out.println(gameMembers[2]);
		
		//2번
		
		DBConnect2 connect2 = new DBConnect2();
		
		Item[] items = connect2.findAll();
		System.out.println(items[3]);

	}

}
