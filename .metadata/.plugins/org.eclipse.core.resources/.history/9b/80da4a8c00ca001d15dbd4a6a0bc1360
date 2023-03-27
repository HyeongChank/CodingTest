package CodeTest;
// 연결 리스트 클래스

import java.util.Scanner;


class Node4<T, V> {
	private T num;
	private V data;
    private Node4 next;        //다음노드

    Node4(T num, V data, Node4 next) {
    	this.num = num;
        this.data = data;
        this.next = next;
    }
    Node4(){
    	
    }
    

	public T getNum() {
		return num;
	}

	public void setNum(T num) {
		this.num = num;
	}

	public Node4 getNext() {
		return next;
	}

	public void setNext(Node4 next) {
		this.next = next;
	}

	public V getData() {
		return data;
	}

	public void setData(V data) {
		this.data = data;
	}


    
}
public class _LinkedListObject {

	public static void main(String args[]) {
		Node4 nd = new Node4();
		
		
		Scanner kb = new Scanner(System.in);
		while(true){
			System.out.println("아래 메뉴 중 선택");
			System.out.println("1.추가 2.삭제 3.검색 4.print");
			int ch = kb.nextInt();
			switch(ch) {
				case 1 :
					System.out.println("추가할 data");
					int no = kb.nextInt();
					addFirst(no);
					break;
					
				case 2 : 
					System.out.println("삭제");
					delete();
					break;
					
				case 3 :
					System.out.println("검색할 data");
					int noS = kb.nextInt();
					search(noS);
					break;

				case 4 :
					System.out.println("출력");
					print();
					break;
			}
		}			
	}
 	static Node4 head;

 	
	public static <T> void addFirst(T k) {
		Node4 n = head;      // 삽입 전의 머리 노드
		head = new Node4(k, n);
	}
	
	public static void search(int k) {
		Node4 sp = head;
		while(sp != null) {
			
			if(sp.getData() == k) {
				System.out.println(k + "는 저장되어 있습니다.");
				break;
			}
			else {
				sp = sp.getNext();
				if(sp==null) {
					System.out.println("no information");		
				}
			}
		}
	}
	public static void delete() {
		if(head != null) {
			head = head.getNext();
		}
	}
	public static void print() {
		Node4 np = head;
		while (np != null) {
			System.out.print(np.getData());
			System.out.print("  ");
			np = np.getNext();
		}
		System.out.println();
	}

}