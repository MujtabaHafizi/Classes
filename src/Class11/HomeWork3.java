package Class11;

public class HomeWork3 {

	public static void main(String[] args) {
		/*
		 * create an array of countries.
		 * while retrieving all values from an array print capital for each country.
		 */
		String []countries= {"USA","Afghanistan"};
		String []capitals = {"DC", "Kabul"};
		
		for(int i = 0 ; i<countries.length; i++) {
			System.out.println("The capital of "+countries[i]+ " is "+capitals[i]);;
		}
		System.out.println("---------------------------------------");
		for(String country:countries) {
			String capital;
			switch(country) {
			case "USA":
				capital = "DC";
				break;
			case "Afghanistan":
				capital = "Kabul";
				break;
				default:
					capital = " I do not know";
				
			}
			System.out.println("Capital of the "+country+" is "+ capital);
		}
	}

}
