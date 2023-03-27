package CodeTest;

public class _문자숫자변환 {

	public static void main(String[] args) {
		int n = 12345;
		int answer =0;
		char e = 'a';
		String f = "fd";
		String abc ;
		String cd = String.valueOf(n);
		System.out.println("cd"+ cd);
		char [] alpabet = new char[3];
		//숫자 문자열 변환
		String b = String.valueOf(n);
		String d = Integer.toString(n);
		//문자열 숫자 변환
		int a = Integer.valueOf(f);
		
		//char ->문자열 변환
		abc = Character.toString(e);
		
		//char배열 ->문자열 변환
		String answer1 =new String(alpabet);
		
		//문자열 char [] 변환
		char [] charry = f.toCharArray();
		
		
//		아스키코드
		
		// char -> int 변환
		answer = (int)e;
		
		// int -> char
		e = (char)n;
		System.out.println("answer"+""+e);
		
		
		System.out.println("d"+d);
		String [] str = b.split("");
		for(String i : str) {
			int c = Integer.valueOf(i);
			answer += c;
		}
		System.out.println(answer);

	}

}
