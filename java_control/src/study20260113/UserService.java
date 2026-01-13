package study20260113;

import java.util.Scanner;

public class UserService {

	private Scanner sc = new Scanner(System.in);

	// 아이디 찾기 메서드
	// 이름을 입력하여 아이디 찾기 할 것이다.
	public void findId(User[] users) {

		System.out.println("====아이디 찾기====");
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();

		for (User user : users) { // 배열 5개 (User
			if (user.getName().equals(name)) {
				System.out.println("ID : " + user.getId());
				break;
			}
		}
	}

	// 비밀번호 찾기 메서드
	// 아이디와 연락처를 입력하면 비밀번호를 찾을 수 있다.

	public void findPassword(User[] users) {
		System.out.println("==== 비밀번호 찾기 ====");
		System.out.println("아이디 입력 : ");
		String id = sc.nextLine();
		System.out.println("연락처 입력 : ");
		String tel = sc.nextLine();

		boolean isDis = true;
		for (User user : users) {
			if (user.getId().equals(id) && user.getTel().equals(tel)) {
				System.out.println("변경할 비번 입력 : ");
				String pw = sc.nextLine();
				user.setPassword(pw);
				isDis = false;
				break;
			}
		}
		if(isDis) {
			System.out.println("일치하는 정보가 없습니다. 다시 입력하세요");
		}
	}

	// 로그인 메서드
	// 아이디와 비밀번호를 입력하여 로그인 하기
	// 아이디와 비밀번호가 일치하면 "로그인 성공" 출력
	// 일치하지 않으면 "아이디 또는 비밀번호가 잘못되었습니다. 출력
	
//	public void logIn(User[] users) {
//		System.out.println("==== 입력 ====");
//		System.out.println("아이디 입력 : ");
//		String id = sc.nextLine();
//		System.out.println("비밀번호 입력 : ");
//		String password = sc.nextLine();
//
//		
//		boolean isok = true;
//		for(User user : users) {
//			if(user.getId().equals(id) && user.getPassword().equals(password)) {
//				System.out.println("로그인 성공");
//				isok = false;
//			}
//		}
//		if(isok) {
//			System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
//		}
//		
//	}
	
	public void login(User[] users) {
		System.out.println("==== 로그인 ====");
		System.out.println("아이디 입력 : ");
		String id = sc.nextLine();
		System.out.println("비밀번호 입력 : ");
		String pw = sc.nextLine();
		
		User temp = isID(users, id);
		if(temp.getPassword().equals(pw)) {
			System.out.println(" 로그인 성공 ");
		}else {
			System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
		}
		
//		boolean isLogin = true;
//		for(User user : users) {
//			if(user.getId().equals(id)&&user.getPassword().equals(pw)) {
//				System.out.println(" 로그인 성공 ");
//				isLogin = false;
//				break;
//			}
//		}
//		if(isLogin) System.out.println("아이디 또는 비밀번호가 잘못되었습니다");

		
	}
	
	private User isID( User[] users, String id) {
		for(User user : users) {
			if(user.getId().equals(id)) return user;
		}
		
		return new User(); // 일치하는 아이디가 없다면 null 반환
	}
	
	
	
}
// 데이터 저장 관리하기 위한 클래스에서
// 데이터 필터링이나, 파일저장(DB), 불러오기
// 등등을 수행 하지 않는다.
// 데이터 저장 관리하기 위한 클래스에서는
// 저장에 관해 메서드를 주로 만들고
// 데이터 변경 대해서만 만든다.
