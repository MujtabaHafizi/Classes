package Class12;

public class ForVsEnhancedFor {

	public static void main(String[] args) {
		// i would like to print from the last element
		
		
				int [] num = {10,20, 30 ,1}; // num.length = 4;
				
				for(int i = num.length-1; i>=0; i--) {
					System.out.print(num[i]+" ");
				}
				
				// we can not loop backward using Enhanced For Loop.
				// it starts from the beginning of th loop an stops at the end.
				
	}

}
