package CodeTest;

import java.util.HashMap;

public class _Comparable_Generic_Store {

	public static void main(String[] args) {
		Student a = new Student(11,"kim");
		Student b = new Student(2, "lee");
		
		int c = a.compareTo(b);
		System.out.println(c);
		// 저장하려면 s2 형식으로 객체 사용해야 함
		Student2<Integer, String> s2 =new Student2<Integer, String>();
		Student2<Integer, String> s3 = new Student2<Integer, String>(3,"lee");
		
		System.out.println("s3 key = " + s3.getKey());
		
		
		s2.setKey(2);
		s2.setValue("kim");
		System.out.println(s2.getKey());
		System.out.println(s2.getValue());
		System.out.println(s2.getKey() + s2.getValue());
		s2.Print(s2.getKey(), s2.getValue());
		
		s2.Store(2,"kim");
		s2.Store(3, "eom");
		s2.Print2();
	}

}
class Student implements Comparable<Student>{
	private int age;
	private String name;
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public int compareTo(Student o) {
		if(this.age>o.age) {
			return 1;
		}
		else if(this.age==o.age) {
			return 0;
		}
		else {
			return -1;
		}
	}
}
class Student2<K,V>{
	private K key;
	private V value;
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	public Student2(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public HashMap<K,V> al = new HashMap<K,V>();
	
	//주 매서드, 값 저장에 사용
	public Student2() {
		this.key = null;
		this.value = null;
	}
	public void Print(K key, V value) {
		System.out.println("key "+ key + ", value " + value);
		
	}
	// generic을 이용한 저장
	public void Store(K key, V value) {
		al.put(key, value);
	}
	public void Print2() {
		System.out.println("hashmap == " + al);
	}
	
	
}
