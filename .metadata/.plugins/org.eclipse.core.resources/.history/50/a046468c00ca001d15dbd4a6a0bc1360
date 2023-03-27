package CodeTest;

import java.util.LinkedList;
import java.util.Queue;

public class _DirectionMove_LinkedList {

	public static void main(String[] args) {
		int [] numbers = {3,2,31};
		String direction = "right";
		int [] answer ;
		answer = new int[numbers.length];
		LinkedList<Integer> l = new LinkedList<>();
		Queue<Integer> q = new LinkedList<>();
		for(int i:numbers) {
			l.add(i);
			q.add(i);
		}
		//LinkedList 는 앞 뒤 양쪽으로 입출력 가능!!!!!!!!!
		if(direction.equals("right")) {
			l.addFirst(l.pollLast());
			for(int i=0 ; i<answer.length;i++) {
				answer[i] = l.poll(); 
			}	
		}
		else if(direction.equals("left")) {
			q.add(q.poll());
			for(int i=0 ; i<answer.length;i++) {
				answer[i] = q.poll(); 
			}	
		}
		for(int i:answer) {
			System.out.println(i);
		}

	}

}
