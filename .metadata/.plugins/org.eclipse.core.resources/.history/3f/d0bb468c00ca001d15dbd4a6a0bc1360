package CodeTest;

public class NumAdd_0223 {
	static int sum =0;
	public static int check(char[] ch) {
		for(int i=0; i<ch.length;i++) {
			print(ch[i]);
			print((int)ch[i]);
			System.out.println();
			if((int)ch[i]<65) {
				System.out.println(ch[i]);
				sum += ((int)ch[i]-48);
				
			}
			
		}System.out.println("sum"+sum);
		
		return sum;
	}
	
	private static void print(int c) {
		System.out.print(c);
	}
	private static void print(char c) {
		System.out.print(c);
	}

	public static void main(String[] args) {
		int answer =0;
		String my_string = "aAb1B2cC34oOp";
		char [] ch = my_string.toCharArray();
		
		check(ch);
		answer = sum;

	}

}
