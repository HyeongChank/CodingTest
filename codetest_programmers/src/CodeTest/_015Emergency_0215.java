package CodeTest;

public class _015Emergency_0215 {

	public static void main(String[] args) {
		int emergency[] = {3,76,24};
		int [] answer = new int[emergency.length];
		int [] a1 = new int[emergency.length];
		float [] a2 = new float[emergency.length];
		for(int i =0;i< emergency.length;i++) {
			a1[i] = i;
			a2[i] = emergency[i];
		}
		int [] e2 = emergency;
		
		int min =100;
		float temp =1;
		int locate =0;
		for(int i=0; i<emergency.length;i++) {
			for(int j =0; j<emergency.length;j++) {
				if(emergency[j]<min) {
					locate = j;
				}
			}
	
			
			answer[locate] =0;
			temp++;
			
		}
	}

}
