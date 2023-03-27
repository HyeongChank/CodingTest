package CodeTest;

public class VowelRemove_0223 {
	
	static String answer = "";
	static String my_string = "bus";
	static int top =0;
	static void pushq(String str, String[] st) {
		st[top++] = str;

	}
	static void remove(String [] st, int i){
		st[i] = "";
	}
	public static void main(String[] args) {

		String [] ms = my_string.split("");
		String [] st = new String[ms.length] ;
		
		String [] vowel = {"a","e","i","o","u"};
		int h = 0;
		for(int i =0; i<ms.length; i++) {
			pushq(ms[i], st);
			for(int j =0; j<vowel.length; j++) {
				if(ms[i].equals(vowel[j])) {
					remove(st,i);
				}
			}
		}
		for(int i =0; i<st.length;i++) {
			answer += st[i]; 
		}
		System.out.println(answer);
	}
}
