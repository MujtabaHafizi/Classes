package Class11;

public class ClassTaskLargestNumbersDomensional {

	public static void main(String[] args) {

		int [] largeNumber = {100, 5, -12, 2500};
		
		int min = largeNumber[0];
		
		
		for(int i = 1 ; i<largeNumber.length; i++) {
			if(largeNumber[i]< min) {
				min = largeNumber[i];
			}
			

		}
		System.out.println(min);

	}

}
