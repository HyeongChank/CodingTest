package test;

import java.util.Scanner;

class Node {
	int data;
	Node left;
	Node right;
	public Node(int data) {
		this.data = data;
		left = right = null;
	}

	
}
class Tree2 {
	Node root;
	
	public void Add(int element) {
		Node p = root;
		Node q = null;
		Node temp = new Node(element);
		int mode = 0;
		if (p == null) {			
			root = temp;
			return;
		}
		while (p != null) {
			if (p.data > element) {
				q = p;
				p = p.left;
				mode = 1;
				
			} else if (p.data < element) {
				q = p;
				p = p.right;
				mode = 2;
			} else {
				
			}
		}
		//여기에 
		if ( mode == 1) {
			q.left = temp;
		}
		else {
			q.right = temp;
		}
	}
	public void delete(int element) {
		Node p = root;
		Node c = root.left;
		Node r = root.right;
		
		while(c != null || r != null) {
			if(element < p.data) {
				if(c.data == element) {
					p.left =c.left;
				}
				p = c;
				c = c.left;
				break;
			}
			
			else if(element > p.data){
				if(r.data == element) {
					p.right = r.left;
				}
				p = r;
				r = r.right;
			}

		}
		
	}
	
	public void inorder() {
		inorderR(root);
	}
	
	public void inorderR(Node root) {
		Node l = root;

		if(l != null) {
			//가장 왼쪽으로 보냄
			inorderR(l.left);
			//오른쪽으로 한번씩 이동하면서 출력
			System.out.println(l.data);
			inorderR(l.right);
		}
		
	}
}
public class TestBinaryTree {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Tree2 t = new Tree2();
		int element;
		
		while(true) {
			System.out.println("보기선택");
			System.out.println("1 : 추가, 2: 보기, 3: 삭제");
			int num = sc.nextInt();
			switch(num){
				case 1:
					System.out.println("숫자 입력");
					element = sc.nextInt();
					t.Add(element);
					break;
				case 2:
					t.inorder();
					break;
				case 3:
					System.out.println("삭제 입력");
					element = sc.nextInt();
					t.delete(element);
			}

		}
		
		
	}
	
}
