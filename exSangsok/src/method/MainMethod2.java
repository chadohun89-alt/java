package method;

import child.*;
import common.Transaction;

public class MainMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 
		 과제의 목표는 ?으로 표현해보는 것이 목표  

		<시나리오> 
 		가계부에는 여러 종류의 거래가 있다.

		모든 거래는 금액, 날짜, 메모를 공통으로 가진다.	> 부모클래스 공통변수

		하지만 거래 종류에 따라 잔액 처리 방식은 다르다.

		수입 : 잔액이 증가	> 자식클래스1
		지출 : 잔액이 감소	> 자식클래스2
		이체 : 잔액 증가 또는 감소	> 자식클래스3

 		Transaction : 부모
		Income  : 수입
		Expense : 지출
		Transfer : 이체

  		부모 클래스 (Transaction)  
		추상 클래스(abstract class)로 작성
		
		금액 (amount)		> 변수1
		날짜 (date)		> 변수2
		메모 (memo)		> 변수3

		포함

		자식 클래스 (Income, Expense , Transfer)

		부모 클래스를 상속받을 것

		거래 종류에 맞게 잔액 처리 방식 구현
		Income : 잔액 증가
		Expense : 잔액 감소
		예시 흐름


		처음 잔액은 0원
		거래 목록을 하나씩 처리
		거래 종류에 따라 잔액이 달라짐
		
		모든 거래를 부모 타입(Transaction)으로 처리


		자바 파일로 제출하세요
		main 메서드에서  어제(목) 한거처럼  수입 ,지출 ,이체 를 적절히 섞어서  배열로 받은 다음에 처리하면 됩니다.
		 
		 */
		

		Transaction in1 = new Income(3000000,"1월 16일","월급");
		Transaction ex1 = new Expense(300000,"1월 17일","가방");
		Transaction tr1 = new Transfer(250000,"1월 17일","부모님 용돈");
		Transaction in2 = new Income(10000000,"1월 20일","적금");

		
		Transaction[] transactions = { in1, ex1, tr1, in2};
		
		for(Transaction t : transactions) {
			t.transact();
		}
		
		
	}

}
