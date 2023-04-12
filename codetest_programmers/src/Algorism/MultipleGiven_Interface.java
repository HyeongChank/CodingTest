package test;



class Person<T>{
	private String name;
	private T data;
	public Person() {
		
	}
	//신 타입이 데이터를 가지기 위해 반드시 필요
	public Person(T data) {
		this.data = data;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	void showType() {
		System.out.println("T의 타입은 " + data.getClass().getName());
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	
}
class data{ }
interface Student<T>{
	public static final int age = 10;
	
	public static int run() {
		int flag =1;
		return flag;
	}

}
class Owner{}

public class MultipleGiven_Interface extends Person implements Student{



	public static void main(String[] args) {
		Person p = new Person();
		Person<Owner> on = new Person<>(new Owner());
		on.showType();
		
		Person<Integer> it = new Person<>();
		it.setData(123);
		System.out.println(it.getData());
		

		p.setName("khc");
		
		int s = Student.age;
		System.out.println(Student.run());
		System.out.println(p.getName() + " : " + s);
		// TODO Auto-generated method stub

	}

}
