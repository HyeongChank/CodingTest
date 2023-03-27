package CodeTest;

import java.util.Scanner;

public class TriangleLight {

	public static void main(String[] args) {
//		"*"의 높이와 너비를 1이라고 했을 때, "*"을 이용해 직각 이등변 삼각형을 그리려고합니다. 정수 n 이 주어지면 높이와 너비가 n 인 직각 이등변 삼각형을 출력하도록 코드를 작성해보세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = "*";
        String [] str = new String[n];
        int sum =0;
        int j=0;
		for(int i =1; i<=n;i++) {
			String b = a.repeat(i);
			str[j] = b;
			j++;
			
		}
		for(String i : str) {
			System.out.println(i);
		}
		
		
//        System.out.println(n);
	}

}
