package exam30;

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
			System.out.print("선택(1:목록, 2:상세보기, 3:등록, 4:수정, 5:삭제, 기타:종료):");
			String menu = sc.nextLine();
			StudentDAO dao = new StudentDAO();
			StudentDTO dto = new StudentDTO();
			int result = 0;
			
			switch (menu) {
			case "1": // 목록
//				StudentDAO dao = new StudentDAO();
				List<StudentDTO> list = dao.getSelcetAll();
				System.out.println("학번 \t 이름 \t 주민번호 \t 연락처 \t 주소 \t 등록일");
				System.out.println("----------------------------------------------");
				for(int i=0; i<list.size();i++) {
					list.get(i).display();
				}				
				break;
				
				
			case "2": //상세보기
				dto.inputField("view");
				StudentDTO resultDTO = dao.getSelectOne(dto);
				resultDTO.display();
				break;
				
			case "3": // 등록
				dto.inputField("chuga");
//				StudentDAO dao = new StudentDAO();
				result = dao.setInsert(dto);
				
				System.out.println("result : "+result);
				break;
				
			case "4": // 수정
				System.out.println("- 수정 -");
				dto.inputField("sujung");
				dao.setUpdate(dto);
				System.out.println(dto);
				
				break;
				
			case "5": // 삭제
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
