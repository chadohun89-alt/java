package exam09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _Exec {

	public static void main(String[] args) {
		// HashMap(맵) - key, value
		Map<String, String> map = new HashMap<>();
		System.out.println("map : "+map); // {}
		map.put("name", "홍길동");
		System.out.println("map : "+map); // {name=홍길동}
		map.put("kor", 90+"");
		System.out.println("map : "+map); // {name=홍길동, kor=90}
		map.put("eng", 80+"");
		System.out.println("map : "+map); // {name=홍길동, kor=90, eng=80}
		map.put("name", "이성순");
		System.out.println("map : "+map); // {name=이성순, kor=90, eng=80}
		
		System.out.println("--------------");
		System.out.println("-->"+map.keySet());
		
		
		for(String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		
		
//		
//		System.out.println("---> "+map.get("name"));
//		System.out.println("---> "+map.get("kor"));
//		
//		
//		map.put("name", "장천용");
//		System.out.println("map : "+map);
//		
//		map.remove("kor");
//		System.out.println("map : "+map);
//		
//		Map<Integer, String> map2 = new HashMap<>();
//		
//		map2.put(1, "홍길동");
//		System.out.println("map2 : "+map2);
//		map2.put(2, "이성순");
//		System.out.println("map2 : "+map2);
//		
//		System.out.println("-----------");
	

		
	}

}
