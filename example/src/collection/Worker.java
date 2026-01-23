package collection;

import java.util.List;
import java.util.Scanner;

public class Worker {

	/*
	 
	 <구조 설계>
	 
	 	
	 1. 직장인 클래스
	 	- 필드 선언 : 이름, 소속, 나이, 연락처, 업무, 희망지역,희망업무
	 
	 
	 */
	
	// 변수 선언;
	String workerName;
	String affiliation;
	String age;
	String phone;
	String job;
	String desiredArea;
	String desiredJob;
	
	// 생성자
	public Worker() {

	}

	public Worker(String workerName, String affiliation, String age, String phone, String job, String desiredArea,
			String desiredJob) {
		super();
		this.workerName = workerName;
		this.affiliation = affiliation;
		this.age = age;
		this.phone = phone;
		this.job = job;
		this.desiredArea = desiredArea;
		this.desiredJob = desiredJob;
	}
	
	
	// 메서드(직장인 정보 변경)
	
	public void change (Scanner sc) {

				System.out.print("수정되는 직장인의 이름 : ");
				this.workerName = sc.nextLine();
				System.out.print("수정되는 직장인의 소속 : ");
				this.affiliation = sc.nextLine();
				System.out.print("수정되는 직장인의 나이 : ");
				this.age = sc.nextLine();
				System.out.print("수정되는 직장인의 전화번호 : ");
				this.phone = sc.nextLine();
				System.out.print("수정되는 직장인의 업무 : ");
				this.job = sc.nextLine();
				System.out.print("수정되는 직장인의 희망지역 : ");
				this.desiredArea = sc.nextLine();
				System.out.print("수정되는 직장인의 희망업무 : ");
				this.desiredJob = sc.nextLine();
				
				System.out.println(this.toString());
			} // 메서드 블록

	@Override
	public String toString() {
		return "직장인 정보 업데이트 내용 [workerName=" + workerName + ", affiliation=" + affiliation + ", age=" + age + ", phone=" + phone
				+ ", job=" + job + ", desiredArea=" + desiredArea + ", desiredJob=" + desiredJob + "]";
	}
	
	
	
		} // 클래스 블록

	
	
	
	

