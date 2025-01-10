
public class ConcatenationExample {

	public static void main(String[] args) {
		// the line below creates, and initializes, an integer value
		int houseNumber = 156;
		
		//the next line uses that variable to display an address
		System.out.println(houseNumber + " West End Ave.");
		
		//the next 3 lines each creates, and initializes, a string (a.k.a. text) value
		String town = "Island Heights";
		String state = "NJ";
		String zip = " 08732";
		
		//the next line uses those variables to display the next line of the address
		System.out.println(town + " " + state + "," + zip);

	}

}
