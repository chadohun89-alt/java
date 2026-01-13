package method;

import java.util.Arrays;

public class MovieTicket {
	/*
	 * 영화표 변수 : 영화제목, 가격, 좌석번호 메서드 : 예약, 취소, 좌석확인
	 */

	String title;
	int price;
	int[] seatNum;

	// 생성자

	@Override
	public String toString() {
		return "MovieTicket [title=" + title + ", price=" + price + ", seatNum=" + Arrays.toString(seatNum) + "]";
	}

	public MovieTicket(String title, int price, int[] seatNum) {
		super();
		this.title = title;
		this.price = price;
		this.seatNum = seatNum;
	}

	public void reserve(int seats) {
		for (int i = 0; i < 50; i++) {
			if (seatNum[i] == 0) {

			}
		}

	}

}
