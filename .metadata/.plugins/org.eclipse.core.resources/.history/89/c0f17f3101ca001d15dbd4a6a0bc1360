package CodeTest;

import java.util.Scanner;

public class CodeTest04_99 {

	
	public static int input() {
		System.out.println();
		System.out.println();
		System.out.println("개별 구구단 숫자입력 : ");
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		return a; 
	}
	
	public static void output(int a) {
		
		int num = a;
		for(int i=1;i<10; i++) {
			System.out.printf("%d", num + "*" + i + "=" +num*i);
			System.err.print("\t");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		
		Scanner kb = new Scanner(System.in);
		System.out.println("첫번째 단 : ");
		int a = kb.nextInt();
		System.out.println("두번째 단 : ");
		int b = kb.nextInt();
		for(int i=1; i<a+1; i++) {
			for(int j =2; j<b+1 ; j++) {
				System.out.print(j + "*" + i + "="+ j*i);
				System.out.print("\t");
			}
			System.out.println();
		}
		
//		System.out.println("숫자입력 : ");
//		Scanner kb = new Scanner(System.in);
//		int b = kb.nextInt();
		
//		input();
//		int result = input();
		
		output(input());
	
		
		
	}

}
