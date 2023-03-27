package CodeTest;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.util.ArrayList;





public class CodePractice {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		try {
			BufferedInputStream in = new BufferedInputStream(new FileInputStream("a.txt"));
			ByteArrayOutputStream out = new ByteArrayOutputStream();{
			byte[] buf = new byte[1024];
			int len =0;
			while((len = in.read(buf)) !=-1) {
				out.write(buf, 0, len);
			}
			}	
			byte[] arr = out.toByteArray();
			String s = new String(arr);
			System.out.println(s);
			
			String[] spl = s.split(" ");
			for(int i =0 ; i< spl.length; i++) {
				System.out.println(spl[i]);
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
