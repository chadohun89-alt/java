package exam27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnboundedExampleEx {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
		List<Integer> intList = Arrays.asList(1, 2, 3);

		strList.add("aaa");
		
//		strList.remove(0);
		System.out.println(strList);
//		strList.set(1, "한라봉");
//		System.out.println(strList);
		
//		System.out.print("문자열 리스트: ");
//		UnboundedExample.printAll(strList);
//		
//		System.out.print("숫자 리스트: ");
//		UnboundedExample.printAll(intList);
	}

}
