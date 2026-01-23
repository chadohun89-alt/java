package exam13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		System.out.println("1. "+list);
		
		list.add("홍길동");
		System.out.println("2. "+list);
		list.add("이성순");
		System.out.println("3. "+list);		
		list.add("장천용");
		System.out.println("4. "+list);
		
		list.addFirst("111");
		System.out.println("5. "+list);
		list.addLast("999");
		System.out.println("6. "+list);
		
		// 중간 삽입 (매우 빠름)
		list.add(1, "222");
		System.out.println("7. "+list);
		
		list.removeFirst();
		System.out.println("8. "+list);
		
//		System.out.println("1. "+ arrayList);
//		arrayList.add(1);
//		System.out.println("2. "+ arrayList);
//		arrayList.add(2.2);
//		System.out.println("3. "+ arrayList);
//		arrayList.add("홍길동");
//		System.out.println("4. "+ arrayList);
//		arrayList.add(true);
//		System.out.println("5. "+ arrayList);
//		arrayList.add(new int[5]);
//		System.out.println("6. "+ arrayList);
//		System.out.println(arrayList.get(0));
		
	}

}
