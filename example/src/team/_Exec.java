package team;

import java.awt.DefaultFocusTraversalPolicy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class _Exec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("선택(1:제품 목록보기, 2:제품 등록, 3:제품 수정, 4:제품 삭제, 기타:종료):");
			String menu = sc.nextLine();
			ProductDAO dao = new ProductDAO();
			ProductDTO dto = new ProductDTO();
			int result = 0;
			
			switch (menu) {
			case "1": // 목록
//				StudentDAO dao = new StudentDAO();
				List<ProductDTO> list = dao.getSelcetAll();
				System.out.println("제품 번호 \t 제품 이름 \t 제품 가격");
				System.out.println("----------------------------------------------");
				for(int i=0; i<list.size();i++) {
					list.get(i).display();
				}				
				break;
				
				
			case "2": // 등록
				dto.inputField("chuga");
//				StudentDAO dao = new StudentDAO();
				result = dao.setInsert(dto);
				
				System.out.println("result : "+result);
				break;
				
			case "3": // 수정
				System.out.println("- 수정 -");
				dto.inputField("sujung");
				dao.setUpdate(dto);
				System.out.println(dto);
				
				break;
				
			case "4": // 삭제
				System.out.println("- 삭제 -");
				dto.inputField("sakje");
				result = dao.setDelete(dto);
				System.out.println("result : "+result);
				
				break;
				
			default:
				System.out.println("- 프로그램 종료 -");
				return;
			}

		}

	}

}
