package ReviewClass02;

public class ForLoops {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 0 ; i<=10; i++) {
			System.out.println("Sum till "+i+" "+(sum=sum+i));
		}
		System.out.println();
		System.out.println();
		 sum = 0;
		for(int i = 10 ; i>=0; i--) {
			System.out.println("Sum till "+i+" "+(sum=sum+i));
		}
			
	}

}
