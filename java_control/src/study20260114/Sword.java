package study20260114;

public class Sword {

	// 변수 설정
	String swordName;
	int swordWeight;
	String swordOrner;
	
	// getter-setter
	public String getSwordName() {
		return swordName;
	}
	public void setSwordName(String swordName) {
		this.swordName = swordName;
	}
	public int getSwordWeight() {
		return swordWeight;
	}
	public void setSwordWeight(int swordWeight) {
		this.swordWeight = swordWeight;
	}
	public String getSwordOrner() {
		return swordOrner;
	}
	public void setSwordOrner(String swordOrner) {
		this.swordOrner = swordOrner;
	}
	
	// toString
	@Override
	public String toString() {
		return "Sword [swordName=" + swordName + ", swordWeight=" + swordWeight + ", swordOrner=" + swordOrner + "]";
	}
	
	// 생성자
	public Sword(String swordName, int swordWeight, String swordOrner) {
		super();
		this.swordName = swordName;
		this.swordWeight = swordWeight;
		this.swordOrner = swordOrner;
	}
	
	
	
}
