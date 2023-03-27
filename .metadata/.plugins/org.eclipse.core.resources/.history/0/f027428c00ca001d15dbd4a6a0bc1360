package CodeTest;

public class Mode {

	public static int solution(int[] array) {
		int count =0;
		int max =0;
		int index =0;
		int answer =0;
		int [] countarray = new int[100];
		for(int i=0; i<100; i++) {
			countarray[i] =0;
		}
		for(int i =0 ; i<array.length; i++) {
			for(int j =i ; j<array.length; j++) {
				if(array[j] == array[i]) {
					countarray[i] ++;
				}
			}
		}
		for(int i : countarray) {
			System.out.print(i);
		}
		
		for(int j =0; j<countarray.length; j++) {
			if(countarray[j]>max) {
				max = countarray[j];
				index = j;
				System.out.println("max = " + max);
			}
		}
		System.out.println(countarray[index]);
		for(int i =index+1; i<countarray.length;i++) {
			if(countarray[index]==countarray[i]) {
				answer = -1;
				break;
			}
			else {
				answer = array[index];
			}
		}
		System.out.println("index = " + index);
		return answer;
	}
	public static void main(String[] args) {
		int [] array = {1,3,1,1,2,3,3};
		System.out.println(solution(array));
		
	}

}
