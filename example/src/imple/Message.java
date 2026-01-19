package imple;

import java.util.Scanner;

import interFace.Notifier;

public class Message implements Notifier {

	private final String source = "<문자 방식>";


	
	// send 메서드 오버라이드
	@Override
	public void send(String message) {
		
		System.out.println("--"+source+"--");		
		System.out.println(message);
		System.out.println();
	}

}
