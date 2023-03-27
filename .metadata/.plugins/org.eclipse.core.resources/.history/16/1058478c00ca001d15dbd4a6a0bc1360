package CodeTest;

public class StringRepeat {

	public static void main(String[] args) {
		String my_string = "hello";
		int n = 5;
		String answer;

		int a = 0;
		char[] abc = my_string.toCharArray();

		char[] starr = new char[abc.length * n];
		for (int j = 0; j < my_string.length() * n; j = j + n) {

			for (int k = j; k < j + n; k++) {
				starr[k] = abc[a];

			}
			a++;
		}

		answer = new String(starr);
		System.out.println(answer);

	}

}
