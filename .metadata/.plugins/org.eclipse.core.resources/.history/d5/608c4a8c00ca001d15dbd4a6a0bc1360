package CodeTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class StackMain {

	public static void push(int top, Stack<Integer> stack) {
		Scanner kb = new Scanner(System.in);
		if (stack.size() >= top) {
			stack.push(kb.nextInt());

		}
		System.out.println("stack = " + stack + "/ top = " + top);
	}

	public static void print() {

	}

	public static void full(int top, Stack<Integer> stack) {
		if (stack.size() == top) {
			System.out.println("스택이 가득참");
		}
	}

	public static void pop(int top, Stack<Integer> stack) {
		stack.pop();
		if (top < 0) {
			System.out.println("스택이 비었음");
		}
		System.out.println("stack = " + stack + "/ top = " + top);
	}

	public static void clear(Stack<Integer> stack) {
		stack.clear();
		System.out.println("stack = " + stack);
	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		int top = -1;

		while (true) {
			System.out.println("1.push, 2.pop, 3.full, 4.clear");
			int menu = kb.nextInt();
			if (menu == 0)
				break;
			switch (menu) {
			case 1:
				++top;
				push(top, stack);

				break;
			case 2:
				--top;
				pop(top, stack);

				break;
			case 3:
				full(top, stack);
				break;
			case 4:
				clear(stack);
			}
		}

	}

}
