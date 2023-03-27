package CodeTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackPractice {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("0");
		stack.push("1");
		stack.push("2");
		stack.push("3");

		System.out.println(stack);

		while (!stack.empty()) {
			System.out.println(stack.pop());
		}

		Queue<String> queue = new LinkedList<String>();
		queue.offer("0");
		queue.offer("1");
		queue.offer("2");
		queue.offer("3");
		System.out.println(queue);
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
//		ArrayList<Integer> arrInt = new ArrayList<Integer>();
//		arr.add(1);
//		arr.get(2);
//		arr.get(3);
//		System.out.println(arrInt);

//		String [] array = arrInt.toArray(new int[0]);
//		for(int i =0; i<array.length; i++) {
//			System.out.println(array[i]);
//		}
	}

}
