package exam03;

import java.util.ArrayList;
import java.util.List;

public class _Exec {

	public static void main(String[] args) {
		// 리스트 : 큰 가방..
		List<Integer> list = new ArrayList<>(); // 리스트생성
		
		System.out.println("list : " + list); // []
		list.add(1);
		System.out.println("list : " + list); // [1]
		list.add(2);
		System.out.println("list : " + list); // [1, 2]
		list.add(300);
		System.out.println("list : " + list); // [1, 2, 300]

		System.out.println("리스트의 길이 : " + list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println("리스트의 "+i+"번째 인덱스의 값 : " + list.get(i));
		}

		System.out.println("------------");
		
		list.remove(2);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("리스트의 "+i+"번째 인덱스의 값 : " + list.get(i));
		}
		
		System.out.println("------------");

		list.set(0, 100);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("리스트의 "+i+"번째 인덱스의 값 : " + list.get(i));
		}
		
		System.out.println("------------");
		// 공통 모듈
		
		int i =0;
		for(int a : list) { // [100, 2]
			System.out.println("리스트의 "+i+"번째 인덱스의 값 : " + list.get(i));
			i++;
		}
		
	}

}
