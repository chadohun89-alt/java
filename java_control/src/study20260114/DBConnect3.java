package study20260114;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DBConnect3 {

	// SQL 관련 변수 설정
	private Connection conn;
	private Statement st;
	private ResultSet rs;

	// 생성자
	public DBConnect3() {
		connect();
	}

	// 연결 메서드 정의
	private void connect() {
		// 데이터 베이스 드라이버 실행 - 연결
		// 계정 로그인

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "ckehgjs";
			String password = "1234";
			String url = "jdbc:mysql://localhost:3306/ckehgjs";
			
			conn = DriverManager.getConnection(url, username, password);
			
		} catch (Exception e) {
			System.out.println("접속 실패");
		}
	}

	
	// DBMS에 쿼리문 보내기
	
	public Sword[] findAll() {
		Sword[]	swords = new Sword[6];
		
		String sql = "select * from sword";
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			int i = 0;
			while(rs.next()) {
				Sword data = new Sword(rs.getString("sword_name"),rs.getInt("sword_weight"), rs.getString("sword_orner"));
				
				swords[i] = data;
				i++;
				
			}
			
		}catch(Exception e) {
			System.out.println("질의 실패 및 객체생성 실패");
		}
		
		return swords;
	}
	
}
