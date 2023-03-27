package CodeTest;

public class MorsTranslate_0215 {

	public static void main(String[] args) {
		String [] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		String letter =".- -..." ;
		String [] letterarr = letter.split(" ");
		char [] alpabet = new char[letterarr.length];
		int index =0;

		System.out.println(morse[0]);
		System.out.println(letterarr[0]);
		System.out.println(letterarr[0].equals(morse[0]));
		

		for(int i=0; i<letterarr.length;i++) {
			for(int j=0; j<morse.length;j++) {
				if(letterarr[i].equals(morse[j])) {
					index = j;
					alpabet[i] = (char)(index+97);
				}
			}
			
		}

		String answer =new String(alpabet);
		System.out.println(answer);
//		for(int i=0; i<mose.length;i++) {
//			
//		}
//		String [] trans = new String[mose.length];
//		for(int i=0; i<mose.length;i++) {
//			trans[i] = mose[i]
//		}
		
		
		
		//		String str = ".- -...";
//		String abc ="";
//		abc = str.replace(".-", "a");
//		System.out.println(abc);
//		morse = { 
//			    '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
//			    '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
//			    '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
//			    '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
//			    '-.--':'y','--..':'z'
//			}		
//		String [] arr = str.split(" ");
//		for(int i =0; i<arr.length;i++) {
//			arr[i].replace(0, 0)	
//		}
		

	}

}
