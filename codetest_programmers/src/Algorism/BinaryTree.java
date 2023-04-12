package test;

import java.util.Scanner;

class Node{
	private int data;
	private Node left;
	private Node right;
	public Tree() {
		
	}

	public Tree(int data) {
		this.data = data;
		Tree left = null;
		Tree right = null;
	}
	public void Tree(int data, Tree right) {
		
		this.data = data;
		this.right = right;
	}

	public Tree(int data, Tree left) {
		
		this.data = data;
		this.left = left;
	}

	public Tree getLeft() {
		return left;
	}
	public void setLeft(Tree left) {
		this.left = left;
	}
	public Tree getRight() {
		return right;
	}
	public void setRight(Tree right) {
		this.right = right;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
}

public class BinaryTree {


	public static int head = 30;
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		while(true) {
			System.out.println("선택 1: add, 2: search");
			int c = kb.nextInt();
			switch(c) {
			
			case 1 : 
				System.out.println("숫자 입력");
				int a = kb.nextInt();
				add(a);
				break;
				
			case 2 :
				search();
			}
		}
	}
	static Tree left;
	static Tree right;
	static Tree root;
	public static void overdown(int a) {
		while(left.getLeft() != null) {
			left = left.getLeft();
			if(left.getData()>a) {
				left.setData(a);
				left.setLeft(left);
			}
		}
	}
	public static void add(int a) {
		
		if(root==null) {
			root = new Tree(a);
		}
		
		if(a<root.getData()) {
			System.out.println("들어옴");
			Tree t = left;
			if(t == null) {
				t = new Tree(a);
			}

			else {
				while(true) {
					t = t.getLeft();
					if(t==null) {
						t = new Tree(a);
					}
				}
			}
				

			System.out.println(left.getData());
			
		}
		else if(a>root.getData()) {
			System.out.println("right 들어옴");
			if(right == null) {
				right = new Tree(a);
			}
			else {
				while(right==null) {
					right = right.getRight();
				}
				right = new Tree(a);
			}
			System.out.println(right.getData());
			
		}
	}
	
	public static void search() {
		Tree r = left;
		while(r != null) {
			System.out.println("left : " + r.getData());
			r = r.getLeft();
		}
		Tree n = right;
		while(n != null) {
			System.out.println("right : " + n.getData());
			n = n.getLeft();
		}
		
	}

}
