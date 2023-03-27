package CodeTest;

import java.util.LinkedList;

public class NotDuplicate_0322 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abdc";
		String answer ="";
		char temp ;
		char [] ch = s.toCharArray();
		for(int k=0; k<ch.length-1;k++) {
			for(int j=k+1; j<ch.length;j++) {
				if((int)ch[k] > (int)ch[j]) {
					temp = ch[k];
					ch[k] = ch[j];
					ch[j] = temp;
				}
			}
		}
		s = new String(ch);
		for(char c : ch) {
			System.out.println(c);
		}
		LinkedList<Character> lk = new LinkedList<>();
		LinkedList<Character> lk2 = new LinkedList<>();
		LinkedList<Character> lk3 = new LinkedList<>();
		for(char c : ch) {
			lk.add(c);
			lk2.add(c);
		}
		int i=0;
		while(i<ch.length) {
			if(lk.contains(lk.pollFirst())) {
				lk3.add(lk2.pollFirst());
			}
			else {
				System.out.println(lk2.pollFirst());
			}
		i++;
		}
		String a = "";
		String b = "";
		
		for(int j=0; j<ch.length;j++) {
			if(lk3.contains(ch[j])) {
				a = Character.toString(ch[j]);
				s = s.replaceAll(a, b);
			}
		}
		answer = s;
		System.out.println("answer        " +  answer);
	}

}
