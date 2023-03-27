package CodeTest;

import java.util.LinkedList;

public class yaaksu_0322 {

	public static void main(String[] args) {
		int n = 24;
		int [] answer = {};
		LinkedList<Integer> lk = new LinkedList<>();
		for(int i=1;i<n+1;i++) {
			if(n%i==0) {
				lk.add(i);
			}
		}
		answer = new int[lk.size()];
		for(int i=0; i<answer.length;i++) {
			answer[i] = lk.pollFirst();
			System.out.println(answer[i]);
		}
	}

}
