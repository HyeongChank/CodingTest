package CodeTest;


public class InterF {
	interface MyInterface1 {
		public void print();
	}
	//인터페이스 구현 방법
	class boClass implements MyInterface1 {
		@Override
		public void print() {
			System.out.println("MyClass1");
		}

		public static void main(String[] args) {
			//익명클래스를 참조하는 참조변수 방법
			boClass mc1 = new boClass();
//			mc1.print(); // MyClass1

			
			MyInterface1 mi = new MyInterface1() {
				@Override       //new를 쓰면 익명클래스
				public void print() {
//					System.out.println("익명클래스");
				}
			
			};
			mi.print();
					
					
//			인터페이스 구현과 동시에 객체가 생성되고 메서드 호출이 실행되는 방법
			(new MyInterface1() {
				@Override
				public void print() {
					System.out.println("선언, 생성, 호출 한번에 처리");
				}
			}).print(); // "선언, 생성, 호출 한번에 처리"
//			
			MyInterface1 m = () -> System.out.println("익명이다");
			m.print();
		}
	}
}