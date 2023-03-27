package CodeTest;

import java.util.Scanner;

public class CodeTest05_Prime {

	public static void prime(int num) {
		int i = 2;
		while(true) {
			if(num % i !=0){
				i++;
			}
			else {
				System.out.println("소수가 아닙니다");
				break;
			}
			if(i==num) {
				System.out.println("소수입니다");
				break;
			}
						
		}
	}	
		
//		for (int i = 2; i < num; i++) {
//			if (num % i == 0) {
//				System.out.println("소수가 아닙니다");
//				return;
//			}
//		}
//		System.out.println("소수입니다");
//	}

	public static void main(String[] args) {
		try(Scanner kb = new Scanner(System.in)){
			System.out.println("숫자를 입력하세요");
			int num;
			while((num = kb.nextInt()) !=0){
				prime(num);	
				
			}
		}	
	}
	
}


