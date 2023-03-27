package CodeTest;

import javax.management.ValueExp;

public class ClapCount_0315 {

	public static void main(String[] args) {
		int order = 300000;
		int answer =0;
		
		String st = String.valueOf(order);
		char [] ch = st.toCharArray();
		String [] str = new String[ch.length];
		str = st.split("");
		int [] result = new int[str.length];
		for(int i=0;i<str.length;i++) {
			result[i] = Integer.valueOf(str[i]);
			if(result[i] !=0 && result[i]%3==0) {
				answer++;
			}
		}
		System.out.println(answer);
		

	}

}
