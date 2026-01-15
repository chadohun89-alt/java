package study20260115;

public class Beverage {

	// 변수 설정
	String name;
	String content;
	String taste;
	int since;
	
	// getter-setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public int getSince() {
		return since;
	}
	public void setSince(int since) {
		this.since = since;
	}
	
	// toString
	@Override
	public String toString() {
		return "Beverage [name=" + name + ", content=" + content + ", taste=" + taste + ", since=" + since + "]";
	}
	
	// 생성자
	public Beverage(String name, String content, String taste, int since) {
		super();
		this.name = name;
		this.content = content;
		this.taste = taste;
		this.since = since;
	}
	
	
	
}
