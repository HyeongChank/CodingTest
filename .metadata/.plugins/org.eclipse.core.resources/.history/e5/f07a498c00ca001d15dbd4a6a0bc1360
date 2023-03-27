package CodeTest;

public class StringCal {

	public static void main(String[] args) {
		String my_string = "20,000 - 20,000";
		int answer =0;
		my_string = my_string.replace(",", "");
		String [] str = my_string.split(" ");
		

		if(str[1].equals("+")) {
			answer = Integer.valueOf(str[0]) + Integer.valueOf(str[2]);
		}
		else {
			answer = Integer.valueOf(str[0]) - Integer.valueOf(str[2]);
		}
		System.out.println(answer);	
	}

}
