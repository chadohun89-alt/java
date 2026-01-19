package method;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import imple.*;
import interFace.Notifier;

public class _Exec {

	public static void main(String[] args) {
		/*
		 * 
		 * 이번 과제의 목적은 ?이다. 알림 시스템을 구현하면 된다.
		 * 
		 * <알림 내용>은 같지만 <전달방식>은 서로 다르다. 하나의 이벤트가 발생했을때, 여러방식으로 사용자에게 알림을 보낼수 있다. 예를 들어
		 * <회원가입 완료> <주문완료> <비밀번호 변경> <배송시작> 이와 같은 알림은 이메일, 문자, 앱 푸시 등 다양한 방식으로 전달 될 수
		 * 있다.
		 * 
		 * 인터페이스 이름 : Notifier 메서드 1개 이상 정의 (예 : send(String message) ) 모든 알림 방식은 이
		 * 인터페이스를 구현해야 한다.
		 * 
		 * 클래스 작성 <이메일방식>, <문자>, <앱 푸시> 클래스 작성하여 인터페이스를 구현하고 main 에서 인터페이스 타입으로 세개의 클래스
		 * 객체를 다루어 메세지를 보낼수 있게 한다.
		 * 
		 * 상속 아닙니다. !!!!
		 * 
		 * 
		 */

		/*
		 * <구조 설계>
		 * 
		 * 1. 인터페이스 - Notifier - 메서드 send(String message)
		 * 
		 * 2. 구현 클래스 - final 필드 source - send 메서드 오버라이딩 어떤 알림 형식인지와 메시지 내용을 출력
		 * 
		 * 3. 실행 클래스 - 메인 메서드 - (다형성으로 객체만들고, 메서드 실행) - 다형성으로 메서드 실행하려면 인터페이스와 구현클래스 모두
		 * 가지고 있는 메서드여야함 > 오버라이드 필수 - 인터페이스 타입 리스트나 배열에 구현클래스 객체들 넣는다. - send 메서드를 향산된
		 * for문으로 호출. - message의 내용은 키보드로 입력받는다.
		 * 
		 */
		
		// 메세지 내용 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("메시지를 입력해 주세요 : ");
		String message = sc.nextLine();

		// 객체 생성
		List<Notifier> list = new ArrayList<>();

		list.add(new Email());
		list.add(new Message());
		list.add(new AppPush());

		// 메서드 호출
		for (Notifier a : list) {
			a.send(message);
		}

	}

}
