package CodeTest;

import java.util.HashMap;


class Hash{
	private String key ;
	private String value ;
	private Hash next;
	private int re;
	
	public Hash(String key, String value, Hash next) {
		this.key = key;
		this.value = value;
		this.next = next;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Hash(int re, Hash next) {
		this.re = re;
		this.next = next;
	}

	public Hash getNext() {
		return next;
	}

	public void setNext(Hash next) {
		this.next = next;
	}

	public int getRe() {
		return re;
	}

	public void setRe(int re) {
		this.re = re;
	}
	
}


public class StringToNum {

	public static void main(String[] args) {
		String numbers = "onefourzerosixsevenfivefiveone";
		long answer =0;

//		int [] key4 = {1,2,3,4,5,6,7,8,9,0};
//		String [] key2 = {"1","2","3","4","5","6","7","8","9","0"};
//		String [] key3 = {"one", "two", "three", "four", "five", "six","seven", "eight", "nine","zero"};
//		for(int i =0 ; i<key2.length; i++) {
//			if(numbers.contains(key3[i])) {
//				numbers = numbers.replace(key3[i], key2[i]);
//			}
//			
//		}
//		answer = Integer.valueOf(numbers);
//		System.out.println(answer);
		HashMap<String,String> hm = new HashMap<String,String>();
		HashMap<String,String> hmc = new HashMap<String,String>();
//		hm.put("one","1"); hm.put("two","2");
//		hm.put("three","3"); hm.put("four","4");
//		hm.put("five","5"); hm.put("six","6");
//		hm.put("seven","7"); hm.put("eight","8");
//		hm.put("nine","9"); hm.put("zero","0");
//		
//		// key 값 value 값 변경
//		for(String key : hm.keySet()) {
//			hmc.put(hm.get(key), key);
//		}
		hmc.put("1","one"); hmc.put("2","two");
		hmc.put("3","three"); hmc.put("4","four");
		hmc.put("5","five"); hmc.put("6","six");
		hmc.put("7","seven"); hmc.put("8","eight");
		hmc.put("9","nine"); hmc.put("0","zero");
		
		for(String key : hmc.keySet()) {
			if(numbers.contains(hmc.get(key))) {
				numbers = numbers.replace(hmc.get(key), key);
			}
		}
		answer = Integer.valueOf(numbers);
		System.out.println("answer" + answer);
		System.out.println(hmc);
		System.out.println(hmc.keySet());
//		System.out.println(hmc.values());
//		System.out.println(hmc.containsValue("one"));
//		for(String key : hmc.keySet()) {
//			System.out.println(numbers.contains(hmc.get(key)));
//			System.out.println(key + "  " + hmc.get(key));
//			if(numbers.contains(hmc.get(key))) {
//				hmc.get(key3).replaceAll(key, numbers)
//			}
//		}
//		char [] ch2 = numbers.toCharArray();
//		String str2 = "";
//		numbers.contains(hm.get(str2));

		
//		char [] ch = numbers.toCharArray();
//		System.out.println("hm" + hm);
//		String st = "";
//		int f =0;
//		while(f <ch.length) {
//			st = st + ch[f];
//			while(hmc != null) {
//				if(st == hmc.remove(f2))
//			}
//		}
//		add("one","1");	add("two","2"); add("three","3");
//		add("four","4");	add("five","5"); add("six","6");
//		add("seven","7");	add("eight","8"); add("nine","9");
//		add("zero","0");
//		trans(ch);
//		int [] array = new int[count];
//		int z =0;
//		while(inte != null) {
//			array[z] = inte.getRe();
//			z++;
//			inte = inte.getNext();
//		}
//		String str = "";
//		for(int i=array.length-1 ; i>=0; i--) {
//			System.out.print(array[i] +  "   ");
//			str += String.valueOf(array[i]);
//		}
//		answer = Integer.valueOf(str);
//		System.out.println(answer);
//		
//	}
//	static Hash head;
//	static Hash inte;
//	static int count=0;
//
//	public static void add(String key, String value) {
//		Hash n = head;
//		head = new Hash(key, value, n);
//	}
//	public static void addinte(int re) {
//		Hash w = inte;
//		inte = new Hash(re, w);
//		++count;
//		System.out.println("num" + re + "count" + count);
//
//	}
////	public static void print3() {
////		Hash p = inte;
////		while(p != null) {
////			System.out.print(p.getRe());
////			p = p.getNext();
////		}
////	}
////	
////	public static void print() {
////		Hash p = head;
////		while(p != null) {
////			System.out.print(p.getKey());
////			System.out.print("  ");
////			System.out.println(p.getValue());
////			p = p.getNext();
////		}
////	}
////	public static void printV(String key) {
////		Hash p = head;
////		while(p != null) {
////			if(p.getKey()== key) {
////				System.out.println(p.getValue());
////			}
////			p = p.getNext();
////		}
////	}
//	public static void trans(char [] ch) {
//		Hash q = head;
//		String sc="";
//		
//		for(int i =0; i<ch.length; i++) {
//			q = head;
//			sc += ch[i];
//			while(q != null) {
//				if(sc.contains(q.getKey())) {
//					int b = Integer.valueOf(q.getValue());
//					System.out.print(b+ "  ");
//					addinte(b);
//					sc ="";
//			//이제 poll 만들어서 inte 에 들어간 값 빼고 최종적으로 숫자 붙이면 됨 붙일 때 문자로 하는게 나을수도 
//				}
//				q = q.getNext();
//			}			
//		}

	}

}
