package CodeTest;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CodeTest06_BufferedReader {

	public static int[] reverse(String[] str) {
		int[] s = new int[str.length];
		int j = 0;
		for (int i = str.length - 1; i >= 0; i--) {
			s[j++] = Integer.parseInt(str[i]);
		}
		return s;
	}

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));) {
			String str;
			while ((str = br.readLine()) != null) {
				list.add(str);
				System.out.printf(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		
		
		
		
//			int[] a = new int[30];
//			int[] b = new int[30];
//			
//			for(int i = 0; i < list.size(); i++)
//				for (int j =0; j < list.get(i).length(); j++)
//					alist.get(i).split("");
//		String [] result = list.toArray(new String[0]);
		
		int[] arr0 = reverse(list.get(0).split(""));
		int[] arr1 = reverse(list.get(1).split(""));
		if (arr0.length < arr1.length) {
			int[] temp = arr0;
			arr0 = arr1;
			arr1 = temp;
		}
		int add = 0;
		for (int i = 0; i < arr1.length; i++) {
			arr0[i] += (arr1[i] + add);
			if (arr0[i] >= 10) {
				add = 1;
				arr0[i] %= 10;
			} else {
				add = 0;
			}
		}
		print(arr0);
	}

	private static void print(int[] arr) {
		String s = "";
		for (int i = arr.length - 1; i >= 0; i--)
//				System.out.printf("%30d", arr[i]);
			s += String.valueOf(arr[i]);
		System.out.printf(s);
	}

}

// 
//ArrayList<String> al = new ArrayList<>();
//try {
//	BufferedInputStream in = new BufferedInputStream(new FileInputStream("a.txt"));
//	ByteArrayOutputStream out = new ByteArrayOutputStream();{
//	byte[] buf = new byte[1024];
//	int len =0;
//	while((len = in.read(buf)) !=-1) {
//		out.write(buf, 0, len);
//	}
//	}	
//	byte[] arr = out.toByteArray();
//	String s = new String(arr);
//	System.out.println(s);
//	
//	String[] spl = s.split(" ");
//	for(int i =0 ; i< spl.length; i++) {
//		System.out.println(spl[i]);
//	}
//	
//	
//} catch(Exception e) {
//	e.printStackTrace();
//}

