package CodeTest;

import java.util.Scanner;

public class FractionMerge {

	public static void main(String[] args) {
		System.out.println("숫자 4개 입력");
		Scanner kb = new Scanner(System.in);
		int numer1 = kb.nextInt();
		int denom1 = kb.nextInt();
		int numer2 = kb.nextInt();
		int denom2 = kb.nextInt();
		
		int[] answer = new int[2];
        int numer3 = 0;
		int cd = 0;
		int denom3 = 0;
		denom3 = denom1 * denom2;
		numer3 = numer1*denom2 + numer2*denom1;

		int max = (numer3 >= denom3) ? numer3 : denom3;
		int min = (numer3 <= denom3) ? numer3 : denom3;

		for (int i = 0; i < 10; i++) {
			int rem = max % min;
			if (rem == 0) {
				cd = min;
				break;
			}
			if (rem != 0) {
				max = min;
				min = rem;
			}
		}
		numer3 /= cd;
		denom3 /= cd;
        answer[0] = numer3;
        answer[1] = denom3;
        for(int i=0 ; i<answer.length;i++) {
        	System.out.println(answer[i]);
        
        
    }

}

}
