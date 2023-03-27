package CodeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class _ArraylistPractice {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>(10);
		list.add(1);
		list.add(9);
		list.add(4);
		list.add(3);
		list.add(8);
		list.remove(2);
		System.out.println(list);
		//ArrayList 정렬
		Collections.sort(list);
		System.out.println(list);
		//ArrayList -> 배열
		list.add(2);
		Integer [] uarr = list.toArray(new Integer[0]);
		
		for(int i =0 ; i<uarr.length;i++) {
			System.out.print(uarr[i]);
		}
		System.out.println();
		//배열 정렬
		Arrays.sort(uarr);
		for(int i =0 ; i<uarr.length;i++) {
			System.out.print(uarr[i]);
		}
		System.out.println();

		ArrayList<String> arr = new ArrayList<String>();
		arr.add("1");
		arr.add("a");
		arr.add("6");
		arr.add("A");
		arr.add("3");
		arr.add("가");
		
		System.out.println(arr);
		//String 아스키코드로 변환해서 정렬함
		Collections.sort(arr);
		System.out.println(arr);
		//ArrayList -> 배열
		String[] arr2 = arr.toArray(new String[0]);
		for(String a : arr2) {
			System.out.print(a);
		}
		int[] arr3 = new int[arr2.length];
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(Integer.parseInt(arr2[i]));
//			arr3[i] = Integer.parseInt(arr2[i]);
//			System.out.println(arr3[i]);
		}
		
		
	}

}
