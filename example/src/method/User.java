package method;

public class User {
	// 사용자 정보 저장할 수 있는 클래스 (  이름, 아이디, 비밀번호, 전화번호 )
	
	
	// 변수 설정 
	private String name; // 이름
	private String ID; // 아이디
	private String password; // 비밀번호
	private int callNumber; // 전화번호
	
	// 생성자
	public User(String name, String iD, String password, int callNumber) {
		super();
		this.name = name;
		ID = iD;
		this.password = password;
		this.callNumber = callNumber;
	}

	
	// getter-setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getCallNumber() {
		return callNumber;
	}

	public void setCallNumber(int callNumber) {
		this.callNumber = callNumber;
	}


	// toString()
	@Override
	public String toString() {
		return "User [name=" + name + ", ID=" + ID + ", password=" + password + ", callNumber=" + callNumber + "]";
	}


	
//	public void changeName(String name) {
//		this.name = name;
//	}
	
	
	
	
}
