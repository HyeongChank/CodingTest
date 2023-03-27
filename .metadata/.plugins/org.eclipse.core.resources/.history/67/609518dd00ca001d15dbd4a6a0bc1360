package CodeTest;

public class BubbleSort_0222 {

	public static void main(String[] args) {
		int [] arr = {1,3,9,4,7,8,6};
		int temp =0;
		int num =0;
		for(int i=arr.length-1 ; i>0;i--) {
			for(int j =arr.length-1 ; j>0; j--) {
				if(arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					num++;
					for(int k : arr) {
						System.out.print(k + " ");
					}
					System.out.println("num" + num);
					System.out.println();
				}
			}
		}
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("교환" + num);

	}
}
