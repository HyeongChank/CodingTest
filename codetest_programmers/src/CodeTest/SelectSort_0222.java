package CodeTest;

public class SelectSort_0222 {

	static int [] swap(int a[]) {
		int arr[] = a;
		int temp=0 ;
		int min =100;
		for(int i=0; i<arr.length-1;i++) {
			for(int j=i+1; j<arr.length;j++) {
				min = arr[i];
				if(arr[j]<min) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		return arr;
	}

	static void print(int [] arr) {
		int [] result = arr;
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int [] basic = {1,6,3,5,4,2};

		print(swap(basic));
	}
}
