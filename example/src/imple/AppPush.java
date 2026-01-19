package imple;

import interFace.Notifier;

public class AppPush implements Notifier {
	private final String source = "<앱 푸시 방식>";
	
	
	// send 메서드 오버라이드
	@Override
	public void send(String message) {
		System.out.println("--"+source+"--");		
		System.out.println(message);
		System.out.println();
	}
}
