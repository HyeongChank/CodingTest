package CodeTest;

public class QuickSort_0222 {

	static void swap(int[] arr, int ln, int rn) {
		int temp = arr[ln];
		arr[ln] = arr[rn];
		arr[rn] = temp;
		
	}
	
	static int [] quicksort(int [] arr, int left, int right) {
		int ln = left;
		int rn = right;
		int x = arr[(ln+rn)/2];
		
		do {
			while(arr[ln]<x) ln++;
			while(arr[rn]>x) rn--;
			if(ln<=rn) {
				swap(arr, ln++, rn--);
			}
		} while(ln<=rn);
		
		if(left<rn) quicksort(arr, left, rn);
		if(ln<right) quicksort(arr, ln, right);
		
		return arr;
	}
	
	
	static void print(int []arr) {
		for(int i:arr) {
			System.out.print(i + "  ");
		}
	}
	public static void main(String[] args) {
		int basic [] = {4,3,6,7,5,2,1,8,9};
		int left = 0;
		int right = basic.length-1;
		print(quicksort(basic, left, right));

	}

}
