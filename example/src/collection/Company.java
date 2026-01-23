package collection;

public class Company {
	/*
	 
	 <구조 설계>
 	
	 2. 회사 클래스
	 	- 필드 선언 :회사명, 지역, 채용 업무
	  
	 */
	
	// 필드 선언
	String companyName;
	String companyArea;
	String recruitJob;
	
	// 생성자
	public Company() {
		super();
	}

	public Company(String companyName, String companyArea, String recruitJob) {
		super();
		this.companyName = companyName;
		this.companyArea = companyArea;
		this.recruitJob = recruitJob;
	}

	@Override
	public String toString() {
		return "회사 정보 (회사이름 : " + companyName + ", 소재 : " + companyArea + ", 채용 업무 : " + recruitJob + ")";
	}
	
	
	
	
	
}
