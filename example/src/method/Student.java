package method;

public class Student {
	/*
	 * 학생 변수 : 이름 , 점수 
	 * 메서드 : 점수 추가 , 60점이상 합격여부 , 점수 출력
	 * 
	 */
	
	String name;
	int score;
	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}

	// 생성자
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	public void scoreUpdate(int score) {
		this.score = score;
		System.out.println("갱신된 점수 : "+score);
		if(this.score>=60&&this.score>=0) {System.out.println("합격");}
		else if(this.score <0) {System.out.println("점수를 확인해 주세요.");}
		else System.out.println("불합격");

	}
	
	
	
	
}
