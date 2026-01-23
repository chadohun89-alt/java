package exam30;

import java.util.Map;

public class StudentDAO {

	public int setInsert(StudentDTO dto) {
		System.out.println("-- setInsert() --");
		System.out.println("name : "+dto.getName());
		System.out.println("ssn : "+dto.getSsn());
		System.out.println("phone : "+dto.getPhone());
		System.out.println("address : "+dto.getAddress());
		
		return 0;
	}
}
