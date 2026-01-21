package exam11;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoExec {

	public static void main(String[] args) {
		
		Set<Integer> lotto = new HashSet<>(); // {5, 21, 30, 45, 11, 33}
		Random random = new Random(); // 1 ~ 45까지

		
		while(lotto.size() < 6) {
		int num = random.nextInt(45)+1;
		lotto.add(num);
		}
		System.out.println("이번주 로또 번호 : "+lotto);
	}

}
