package exam03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class _Exec2 {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>(); // []
		numbers.add(50); // [50]
		numbers.add(10); // [50, 10]
		numbers.add(30); // [50, 10, 30]
		
		Collections.sort(numbers);
		System.out.println(numbers);
		
		
	}

}
