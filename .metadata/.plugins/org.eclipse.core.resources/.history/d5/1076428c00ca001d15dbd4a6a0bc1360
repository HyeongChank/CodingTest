package CodeTest;

import java.util.LinkedList;
import java.util.Queue;


public class _BallThrow_UseQueue {

	public static void main(String[] args) {
		int [] numbers = {1, 2, 3, 4, 5};
		int k = 100;
		int answer =0;
		double fi =0;
		double [] result = new double[numbers.length*1000];
		int l =0;
		for(int i=0;i<numbers.length*1000;i++) {
			result[i] = numbers[l];
			l++;
			if(l==numbers.length) {
				l=0;
			}
		}
		
		int count =0;
		for(int i=0 ; i<result.length; i=i+2) {
			count++;
			if(count==k) {
				fi = result[i];
			}
		}
		answer = (int)fi;
		System.out.println(answer);

		Queue<Integer> qu = new LinkedList<>();
		for(int i : numbers) {
			qu.add(i);
		}
		
		int count2 =1;
		while(count2!=k) {
			qu.add(qu.poll());
			qu.add(qu.poll());
			count2++;
		}
		answer = qu.poll();
		System.out.println("answer = "+ answer);
	}

}
