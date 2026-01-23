package exam28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// 선택 (0:종료, 1:목록, 2:등록, 3:수정, 4:삭제):1
		// - 목록 -
		// 선택 (0:종료, 1:목록, 2:등록, 3:수정, 4:삭제):2
		// - 등록 -
		// 선택 (0:종료, 1:목록, 2:등록, 3:수정, 4:삭제):3
		// - 수정 -
		// 선택 (0:종료, 1:목록, 2:등록, 3:수정, 4:삭제):4
		// - 삭제 -
		// 선택 (0:종료, 1:목록, 2:등록, 3:수정, 4:삭제):5
		// 선택 (0:종료, 1:목록, 2:등록, 3:수정, 4:삭제):8
		// 선택 (0:종료, 1:목록, 2:등록, 3:수정, 4:삭제):9
		// 선택 (0:종료, 1:목록, 2:등록, 3:수정, 4:삭제):0
		// -- 프로그램 종료--
		
		// 상품이름 : 
		// 상품가격 : 
		// 주문수량 : 
		// 선택 (0:종료, 1:목록, 2:등록, 3:수정, 4:삭제):1
		// ------------
		
		/*
		
		<구조 설계>
		
		1. 상품(데이터) 클래스
		상품은 따로 클래스 만들어서 운영
		필드 : 이름, 가격, 수량
		메서드 : 
				
		
		2. 실행 클래스
		안내문구는 > 반복문으로 안내
		
		리스트 생성.
		1번 목록은 리스트 내용 뿌려서 보여주기 
			> 향상된 for문으로 리스트 안의 내용 하나씩 뿌려서 보여주기
			> 객체 toString()으로 준비
		
		2번 등록은 리스트 add()메서드 활용 
			> ()안에는 객체의 생성자가 들어가야함
			> 생성자는 이름, 가격, 수량 들어가야함
			
		3번 수정은 리스트 set() 메서드 활용
			> ()안에도 마찬가지로 생성자가 들어가야함
			
		4번 삭제는 리스트 remove() 메서드 활용
			> 인덱스 번호만 있으면 처리 가능
			
		0번 종료는 while문으로 가능.
			> 조건식이 명령어 변수 int process != 0 으로 짜면 될듯
	
		 */
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		

		int process = 1;
		
		do {
			System.out.print("선택 (0:종료, 1:목록, 2:등록, 3:수정, 4:삭제) : ");
			process = sc.nextInt();
			sc.nextLine();
			
			if(process == 1) {
				for(Product p : list) {
				System.out.println(p);	
				}
			}
			else if(process == 2) {
				System.out.println("상품 이름, 가격, 개수 입력");
				Product product = new Product();
				product.name = sc.nextLine();
				product.price = sc.nextInt();
				sc.nextLine();
				product.quentity = sc.nextInt();
				sc.nextLine();
				list.add(product);
				
			}
			else if(process == 3) {
				System.out.println("수정할 목록의 인덱스 넘버 입력 : ");
				int num = sc.nextInt();
				sc.nextLine();
				Product product2 = new Product();
				System.out.println("수정할 상품 이름, 가격, 개수 입력");
				product2.name = sc.nextLine();
				product2.price = sc.nextInt();
				sc.nextLine();
				product2.quentity = sc.nextInt();
				sc.nextLine();
				list.set(num, product2);
				
			}
			else if(process == 4) {
				System.out.print("삭제할 인덱스 넘버 입력 : ");
				int num = sc.nextInt();
				sc.nextLine();
				list.remove(num);
				
			} else if(process != 0 && process > 4) {
				System.out.print("선택 (0:종료, 1:목록, 2:등록, 3:수정, 4:삭제) : ");

			} else {
				System.out.println("프로그램 종료");
			}
		} while(process !=0);

	}

}
