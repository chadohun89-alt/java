package exam29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Example {
	// 회원관리 : 목록, 상세보기, 등록, 수정, 삭제
	// 아이디
	// 비밀번호
	// 이름
	// 연락처
	// 주소 : 대전, 서울, 충남

	/*
	 * 
	 * <구조 설계>
	 * 
	 * 1. 회원 클래스 - 필드 선언(아이디, 비밀번호, 이름, 연락처, 주소) - 게터세터 메서드 - 생성자 메서드 - toString
	 * 오버라이딩
	 * 
	 * 2. 실행 클래스 - 리스트 만들기 - 스캐너 객체 만들기 - 반복문과 조건문 활용 - 반복문 : 무한 루프구조로 if문 활용해서 "0"
	 * 입력되면 종료 - 조건문 : 종료(0), 목록(1), 상세보기(2), 등록(3), 수정(4), 삭제(5) 종료 목록 : 리스트에 담긴 내용
	 * 출력 / display 메서드 활용 상세보기 : toString 메서드 활용 등록 : 키보드로 입력받기 / 객체 생성 / 객체 리스트에
	 * 담기 수정 삭제
	 * 
	 */

	public static void main(String[] args) {
		List<MemberDTO> memberList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("선택 (0:종료, 1:회원목록, 2:상세보기, 3:등록, 4:수정, 5:삭제): ");
			String menu = sc.nextLine();
			if (menu.equals("0")) {
				break;
			} else if (menu.equals("1")) {
				System.out.println("-- 회원 명단 --");
				for (int i = 0; i < memberList.size(); i++) {
					System.out.print((i+1)+"번 회원 : " );
					memberList.get(i).displayId();
				}

			} else if (menu.equals("2")) {
				System.out.println("상세보기 하려는 회원의 번호 : ");
				int select = sc.nextInt();
				sc.nextLine();
				if (select <= memberList.size()) {
					memberList.get(select - 1).display();
				} else {
					System.out.println("숫자를 바로 입력해주세요");
				}

			} else if (menu.equals("3")) {
				System.out.print("회원 아이디 : ");
				String id = sc.nextLine();
				System.out.print("비밀번호 : ");
				String password = sc.nextLine();
				System.out.print("회원 이름 : ");
				String memberName = sc.nextLine();
				System.out.print("연락처 : ");
				String phone = sc.nextLine();
				System.out.print("주소 : ");
				String address = sc.nextLine();

				MemberDTO dto = new MemberDTO(id, password, memberName, phone, address);
				memberList.add(dto);

			} else if (menu.equals("4")) {
				System.out.println("- 수정 -");

			} else if (menu.equals("5")) {
				System.out.println("- 삭제 -");

			}
		}
		System.out.println("-- 프로그램 종료 --");
	}

}
