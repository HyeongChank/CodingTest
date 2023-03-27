package CodeTest;

public class SqrtTF {

	
	static int check(int a, int b) {
		if(a%b==0) {
			return 1; 
		}
		else {
			return 2;
		}
	}
	public static void main(String[] args) {
         int answer = 0;
         int n = 976;
         
         int ch = (int) Math.sqrt(n);
         answer = check(n,ch);
         System.out.println(answer);

	}

}
