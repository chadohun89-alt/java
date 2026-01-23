package exam28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		List<ProductDTO> productList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);


		while (true) {
			System.out.print("선택 (0:종료, 1:목록, 2:등록, 3:수정, 4:삭제): ");
			String menu = sc.nextLine();
			if (menu.equals("0")) {
				break;
			} else if (menu.equals("1")) {
				int hab =0;
//				System.out.println("- 목록 - : "+productList);
				for (int i =0; i<productList.size();i++) {
					productList.get(i).display();
					hab += productList.get(i).getTotal();
				}
				System.out.println("------------------");
				System.out.println("합  계 : " + hab);
				
//				for(String[] arr : list) {
//					System.out.print("상품 : ");
//					for(String str : arr) {
//						System.out.print(str+" ");
//					}
//					System.out.println();
//				}

				
			} else if (menu.equals("2")) {
				System.out.print("상품이름 : ");
				String productName = sc.nextLine();
				System.out.print("상품가격 : ");
				String productPrice_ = sc.nextLine();
				int productPrice = Integer.parseInt(productPrice_);
				System.out.print("구매수량 : ");
				String buyCounter_ = sc.nextLine();
				int buyCounter = Integer.parseInt(buyCounter_);

				
				ProductDTO dto = new ProductDTO(productName, productPrice, buyCounter);
				productList.add(dto);
				
//				String msg = productName +"/"+productPrice+"/";
//				msg += buyCounter + "/" + total; 
//				System.out.println(msg);
				
//				String[] arr = new String[3];
//
//				System.out.print("상품 이름을 입력해 주세요: ");
//				arr[0] = sc.nextLine();
//				System.out.print("상품 가격을 입력해 주세요: ");
//				arr[1] = sc.nextLine();
//				System.out.print("상품 개수를 입력해 주세요: ");
//				arr[2] = sc.nextLine();
//				
//				list.add(arr);
				
			} else if (menu.equals("3")) {
				System.out.println("- 수정 -");
				
				
			} else if (menu.equals("4")) {
				System.out.println("- 삭제 -");

			}
		}
		System.out.println("-- 프로그램 종료 --");
	}

}
