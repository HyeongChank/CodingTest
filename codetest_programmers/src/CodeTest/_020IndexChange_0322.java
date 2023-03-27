package CodeTest;

public class _020IndexChange_0322 {

	public static void main(String [] args) {
		String my_string = "hello";
		int num1=2;
		int num2=4;
		String answer = "";
		char [] ch = my_string.toCharArray();
		char a = ch[num1];
		ch[num1]=ch[num2];
		ch[num2]=a;
		for(int i=0; i<ch.length; i++) {
			System.out.println(i);
			answer +=ch[i];
		}
		System.out.println(answer);
	}
}
