package exam01;

import java.util.Scanner;

public class _Exec {

	public static void main(String[] args) {
		// 입력 : 이름, 주민번호, 나이
		// 출력 : 이름 주민번호 나이

		Scanner scanner = new Scanner(System.in);

		String strs = "";
		System.out.print("이름 : "); // 홍길동
		String name = scanner.nextLine();
		System.out.println("주민번호 : "); // 123456-1234567
		String ssn = scanner.nextLine();
		System.out.println("나이 : "); // 19
		String age = scanner.nextLine();
		
		strs = strs+ "/" + name + "," + ssn + "," + age;
		// 홍길동,123456-1234567
		

		System.out.print("이름 : "); // 이성순
		name = scanner.nextLine();
		System.out.println("주민번호 : "); // 111111-1111111
		ssn = scanner.nextLine();
		System.out.println("나이 : "); // 21
		age = scanner.nextLine();
		
		strs = strs+ "/" + name + "," + ssn + "," + age;
		
		System.out.println(strs); // /홍길동,123456-1234567,19/이성순,111111-1111111,21
		strs = strs.substring(1);
		System.out.println(strs); // 홍길동,123456-1234567,19/이성순,111111-1111111,21
		String [] array = strs.split("/"); // {"홍길동,123456-1234567,19", "이성순,111111-1111111,21"}

		System.out.println(array[0]);
		System.out.println(array[1]);
		
		String imsi = array[0]; // "홍길동,123456-1234567,19"
		String[] array2 = imsi.split(","); // {"홍길동", "123456-1234567", "19"}
		System.out.println(array2[0]+"\t"+array2[1]+"\t"+array2[2]);

	}

}
