package method;

import java.util.Arrays;

public class Method2 {

	public static void main(String[] args) {

		//1번 은행 계좌
//		BankAccount bk = new BankAccount("차도헌", 10000);
//		
//		bk.check();
//		bk.buy("선풍기", 50000);
//		bk.buy("사탕", 3000);
//		bk.buy("과자", 7000);
//		bk.buy("밀키트", 10000);
		
		
		//2번 학생
//		Student st = new Student("차도헌", 55);
//		System.out.println(st);
//		
//		st.scoreUpdate(67);
		
		MovieTicket mv = new MovieTicket("아바타", 1000, new int[50]);
		
		for(int i = 0; i<mv.seatNum.length ;i++) {
			mv.seatNum[i] = (int)(Math.random()*2);
		}
		
		System.out.println(Arrays.toString(mv.seatNum));
		
		
		
		
		
	}

}
