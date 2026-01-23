package exam29;

public class MemberDTO {
	
	// 회원관리 : 목록, 상세보기, 등록, 수정, 삭제
	// 아이디
	// 비밀번호
	// 이름
	// 연락처
	// 주소 : 대전, 서울, 충남
	
	/*
	
	<구조 설계>
	
	1. 회원 클래스
		- 필드 선언(아이디, 비밀번호, 이름, 연락처, 주소)
		- 게터세터 메서드
		- 생성자 메서드
		- toString 오버라이딩
		
	2. 실행 클래스
		- 리스트 만들기
		- 스캐너 객체 만들기
		- 반복문과 조건문 활용
		- 반복문 : 무한 루프구조로 if문 활용해서 "0" 입력되면 종료
		- 조건문 : 종료(0), 목록(1), 상세보기(2), 등록(3), 수정(4), 삭제(5)
			* 종료
			* 목록 : 리스트에 담긴 내용 출력 / display 메서드 활용
			* 상세보기 : toString 메서드 활용
			* 등록 : 키보드로 입력받기 / 객체 생성 / 객체 리스트에 담기
			* 수정
			* 삭제
	
	 */
	
	
	// 필드 선언(아이디, 비밀번호, 이름, 연락처, 주소)
	private String id;
	private String password;
	private String memberName;
	private String phone;
	private String address;
	
	
	

	// 생성자
	public MemberDTO(String id, String password, String memberName, String phone, String address) {
		super();
		this.id = id;
		this.password = password;
		this.memberName = memberName;
		this.phone = phone;
		this.address = address;
	}


	// 출력 메서드

	public void displayId() {
		System.out.printf("%s\n",id);
	}
	
	public void display() {
		System.out.printf("%s \t %s \t %s \t %s \t %s\n",id, password, memberName, phone, address);
	}


	
	// getter & setter
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getMemberName() {
		return memberName;
	}


	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	
	// toString
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", password=" + password + ", memberName=" + memberName + ", phone=" + phone
				+ ", address=" + address + "]";
	}
	
	


	
	
	
	
}
