package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _Exec {

	public static void main(String[] args) {
		/*
		 * 
		 * 직장인 이직 매칭 프로그램을 만들려고 한다.
		 * 
		 * 
		 * 직장인의 정보는 이름, 소속, 나이, 연락처, 업무, 희망지역,희망업무를 받는다. 
		 * 회사의 정보는 회사명, 지역, 채용 업무를 받는다.
		 * 
		 * 프로그램 실행시 출력되는 메뉴는 1. 매칭 2. 회사조회 3. 정보수정 4. 종료
		 * 
		 * 1번 메뉴를 선택하면 직장인의 이름 입력 후 희망업무에 맞는 회사명이 나타나야 한다. 
		 * 2번 메뉴 선택하면 회사명을 입력하게 하고 입력후 회사의 지역, 채용업무 가 출력되어야한다. 
		 * 3번 메뉴를 선택하면 직장인 이름 입력후 정보수정 가능하다.
		 * 
		 * 로그인 안함, 아무나 정보수정가능한 거에 대해 고려 하지 말 것 
		 * > 접근제한자 private으로 하지 않아도 된다는 이야기인가? > 그럼 getter & setter 만들 필요 없을듯.
		 * 
		 * 문제의 이해 안되는 부분은 질문할 것
		 * 
		 */
		
		/*
		 
		 <구조 설계>
		 
		 0. 개요
		 	- 컬렉션 문제. 컬렉션 중에 어떤 것을 쓸지 고민. 아마도 리스트
		 	- 리스트에 무엇을 담는가? 직장인 객체와 회사 객체? > 아직 잘 모르겠음. 회사와 직장인은 타입이 다른 걸? 리스트를 두개 만드나?
		 	- 매칭은 어떻게 구현하지? 반복문으로 돌려가면서 조건문 equals()로 매칭해야 할듯.
		 	- 회사 조회는 어떻게 구현하지? 조건문 equals(), 일치하면 해당 리스트 내용 뱉어내도록. 이중 반복문 출력?
		 	- 직장인 정보 수정은 어떻게 구현하지? 새로운 객체를 만들어서 해당 인덱스에 넣는 방법. 해당 인덱스의 정보를 메서드로 수정하는 방법
		 	- 일단 만들어 가면서 세부 내용 구체화하기. 시작 ~
		 	
		 1. 직장인 클래스
		 	- 필드 선언 : 이름, 소속, 나이, 연락처, 업무, 희망지역, 희망업무
		 	
		 2. 회사 클래스
		 	- 필드 선언 :회사명, 지역, 채용 업무
		 
		 3. 실행클래스
		 	- 스캐너 객체 만든다
		 	- 리스트 만든다.
		 	- 직장인 객체 여러개를 생성. 일일이 타이핑 하면 오래 걸리니까 갈음하여 생성자로 만들기. 마지막에 시간되면 스캐너로 변환
		 	- 회사 객체 여러개를 생성 일일이 타이핑 하면 오래 걸리니까 갈음하여 생성자로 만들기. 마지막에 시간되면 스캐너로 변환
		 	- 반복문 > 무한 루프 돌리고 4번 누르면 빠져나오도록
		 	- 메뉴선택
		 		* 1번 매칭, 2번 회사조회, 3번 직장인 정보수정 출력, 4번 반복 종료
		 		* 스캐너로 문자열 하나 입력받고 if문이나 switch문으로 비교
		 		* 각각의 경우의 수에서 코딩
		 		
			- 1번 매칭 (입력어 : 직장인 이름) > 직장인의 희망업무에 맞는 회사명 표시
		 		* 스캐너로 직장인 이름을 입력받음
		 		* 해당직장인의 희망업무와 받는 회사명 표시. 어떻게?
		 		* 반복문으로 리스트 인덱스 돌려서 매칭 시켜야할듯.
		 			~ 반복문 반복횟수는 직장인 리스트 사이즈만큼
		 			~ 조건문으로 직장인과 리스트 내부 객체의 이름이 일치하는 경우는 > 직장인 이름에 맞는 희망업무 출력.
		 			~ > 다시 반복문 돌림. 회사 리스트 수만큼. 조건문 ? 희망업무와 채용업무 일치하면 회사 이름 출력.
		 			~ break; 위치 때문에 상당히 애먹음.
		 			
		 	- 2번 회사 조회 ( 입력어 : 회사 이름) > 회사명을 입력하게 하고 입력후 회사의 지역, 채용업무가 출력.
		 		* 스캐너로 회사 이름을 입력받음
		 		* 반복문 속 조건문으로 이름 일치하면 내용 전부 뱉어내도록 설계. toString 메서드 오버라이드 활용.
		 		 
		 	- 3번 정보수정 (입력어 : 직장인 이름) > 직장인 이름 입력후 정보수정.
		 		* 새로운 객체 만들어서 list.set(인덱스 넘버, 객체이름) 방법은 지난 번에 성공.
		 		* 이번에는 수정하는 메서드 하나 만들어서 교체하는 방향으로 도전.
		 		 
		 */

		Scanner sc = new Scanner(System.in);
		
		List <Worker> workerList= new ArrayList<>();
		List <Company> companyList= new ArrayList<>();
		String name; // 임시 변수로 쓰려는 변수
		
		
		// 직장인 객체 생성(이름, 소속, 나이, 연락처, 업무, 희망지역, 희망업무)
		// 직장인 객체 리스트에 넣기 > 여유되면 반복문 안으로
		
		Worker worker1 = new Worker("짱구", "DW아카데미", "5", "010-0000-0000-", "코딩 학습", "대전", "프로그램 설계");
		Worker worker2 = new Worker("맹구", "대전고등학교", "6", "010-1111-1111-", "고등학교 교사", "서울", "대학 교수");
		Worker worker3 = new Worker("훈이", "삼성전자", "7", "010-2222-2222-", "기획, 홍보, 마케팅", "서울", "영업");
		
		workerList.add(worker1);
		workerList.add(worker2);
		workerList.add(worker3);
		
		// 회사 객체 생성(회사명, 지역, 채용 업무)
		// 회사 객체 리스트에 넣기 ? 여유 되면 반복문 안으로
		
		Company company1 = new Company("서울대학교", "서울", "대학 교수");
		Company company2 = new Company("LG전자", "서울", "영업");
		Company company3 = new Company("네이버", "성남", "프로그램 설계");
		
		companyList.add(company1);
		companyList.add(company2);
		companyList.add(company3);

		// 반복문 (무한루프, 4번 입력하면 나오기)1. 매칭 2. 회사조회 3. 정보수정 4. 종료
		while(true) {
			System.out.print("선택(1번 : 매칭, 2번 : 회사조회, 3번 : 정보수정, 4번 : 종료) : ");
			String menu = sc.nextLine();
			
			switch (menu) {
			
			case "1" :
				System.out.print("직장인의 이름을 입력하세요 : ");
				name = sc.nextLine();
				String imsi = "";
				
				//  코드 너무 지저분해져서 이 방법 아닌 것 같긴 함. 일단 넘어가기.
				// 반복문 1
				for (int i = 0; i<workerList.size();i++) {
					if (name.equals(workerList.get(i).workerName) ) {
						imsi = workerList.get(i).desiredJob;
						System.out.println("이름 일치하면 담기는 희망업무 : "+imsi);
						
						// 반복문 2
						for( int k = 0; k < companyList.size(); k++) {
							if(imsi.equals(companyList.get(k).recruitJob)) {
								System.out.println(workerList.get(i).workerName+"의 희망업무와 맞는 회사 : "+companyList.get(k).companyName);
								break;
							}
						}
						
					}

				}
				break;
				
			case "2" :
				
				System.out.print("회사 이름을 입력하세요 : ");
				name = sc.nextLine();

				for(Company c : companyList) {
					if (c.companyName.equals(name)) {
						System.out.println(c.toString());
						
					}
				}
				
				break;
				
			case "3" :

				System.out.println("수정할 직장인의 이름을 입력하세요 : ");
				name = sc.nextLine();
				for(Worker a : workerList) {
					if(name.equals(a.workerName)) {
						a.change(sc);
					}
				}

				break;
				
			case "4" :
				System.out.println("--- 프로그램 종료 ---");				
				return;
				
			default :
				System.out.println("숫자를 확인해 주세요!");
				break;
			} // 스위치문 블록
			
		} // 와일문 블록
		
	} // 메인 메서드 블록

} // 클래스 브록
