package CodeTest;

public class _016Factorial_0307 {

	public static void main(String[] args) {
		int n =3628800;
		int answer =0;
		int count =0;
		int result =1;
		int num=1;
		while(true) {
			if(result<=n) {
				result *= num;
				num++;
				count++;
				System.out.println(result);
				
			}
			else {
				break;
			}
		}
		System.out.println(count);
		answer = count-1;
		System.out.println(answer);
	}

}
