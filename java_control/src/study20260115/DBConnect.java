package study20260115;

import java.sql.*;

public class DBConnect {

	// 변수 설정
	Connection conn;
	Statement st;
	ResultSet rs;

	// 생성자
	DBConnect() {
		connect();
	}

	// 연결 - 로그인
	private void connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "ckehgjs";
			String password = "1234";
			String url = "jdbc:mysql://localhost:3306/ckehgjs";
			conn = DriverManager.getConnection(url, username, password);

		} catch (Exception e) {
			System.out.println("접속실패");
			e.printStackTrace();
		}

	}
	
	// 쿼리문 작성, 보내고 받기, 받은 결과 저장하기
	
	public Beverage[] selectData() {
		Beverage[] beverages = new Beverage[4];
		
		String sql = "select * from beverage";
		try { // 쿼리문 보내고 결과 받기
		st = conn.createStatement();
		rs = st.executeQuery(sql);	
		
		
		} catch(Exception e) {
			System.out.println("질의 실패");
		}
		
		try { // 데이터들을 product 객체에 저장하기
			
			int i = 0;
			while(rs.next()) {
				Beverage data = new Beverage(
						rs.getString("name"),
						rs.getString("content"),
						rs.getString("taste"),
						rs.getInt("since")
						);
				beverages[i] = data;
				i++;
			}
		}catch(Exception e) {
			System.out.println("객체생성 실패");
		}
		
		
		
		return beverages;
	}
	
}
