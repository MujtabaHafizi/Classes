package Class13;

public class smartPhoneBehavior {

	public static void main(String[] args) {
		
		   smartPhone Iphone1 = new smartPhone();
		   
		   System.out.println("----First Iphone----");
		   
		   Iphone1.brand = "Iphone";
		   Iphone1.color = "Black";
		   Iphone1.model = "12 Plus";
		   Iphone1.call(347445328);
		   Iphone1.text(" Find a bug ");
		   Iphone1.dial();
		   Iphone1.pics();
		   
		   System.out.println("----Second Iphone----");

	        smartPhone Iphone2 = new smartPhone();
	        Iphone2.brand = "Iphone";
	        Iphone2.color = "Black";
	        Iphone2.model = "12 mini";
	        Iphone2.call(347445328);
	        Iphone2.text(" Text me ");
	        Iphone2.dial();
	        Iphone2.pics();
	        
	}

}
