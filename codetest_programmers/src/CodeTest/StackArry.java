package CodeTest;



public class StackArry {
	private Point data[];
	private int top;
	private int capacity;
	
	public genericStack(int capacity) {
		top = 0;
		this.capacity = capacity;
		// this.data = new T[capacity]; // 스택 본체용 배열을 생성
		try {
			data = new Point[capacity];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}
}
