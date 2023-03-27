package CodeTest;

import java.util.LinkedList;

public class _025NearNum_0315 {

	public static void main(String[] args) {
		int array [] = {20, 18};
		int n =19;
		int answer =0;

		int temp=0;
		for(int i=0; i< array.length;i++) {
			for(int j=i+1; j<array.length;j++) {
				if(array[j]<array[i]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		int min =100;
		for(int i=0;i<array.length;i++) {
			if(Math.abs(n-array[i])<min) {
				answer = array[i];
				min=Math.abs(n-array[i]);
			}
		}
		System.out.println(answer);
		
		
		
		
//		int temp=0;
//		for(int i=0; i< array.length;i++) {
//			for(int j=i+1; j<array.length;j++) {
//				if(array[j]<array[i]) {
//					temp = array[i];
//					array[i] = array[j];
//					array[j] = temp;
//				}
//			}
//		}
//		LinkedList<Integer> lk = new LinkedList<Integer>();
//		int j =0;
//		int key =0;
//		while(true) {
//			if(array[j]<n) {
//				lk.push(array[j]);
//				j++;
//			}
//			else if(array[j]>n) {
//				lk.push(n);
////				
//				while(j != array.length) {
//					lk.push(array[j]);
//					++j;
//				}
//			}
//		    if(j==array.length) {
//				break;
//			}
//		}
//		if(lk.size()==array.length) {
//			lk.push(n);
////			
//		}
//		int [] result = new int[array.length+1];
//		for(int z =0; z<result.length;z++) {
//			result[z] = lk.pollLast();
//		}
//		for(int s : result) {
//			System.out.println(s);
//		}
////		if(key ==result.length-1) {
////			answer = result[key-1];
////		}
////		else {
////			if(result[key]-result[key-1] < result[key+1]-result[key]) {
////				answer = result[key-1];
////			}
////			else {
////				answer = result[key+1];
////			}
////		}
////		System.out.println(answer);
	}

}
