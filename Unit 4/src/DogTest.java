
public class DogTest {

	public static void main(String[] args) {
		//create a dog object
		Dog jakeDog = new Dog("lola", "black");
		Dog noelleDog = new Dog("Finn", 1, "fox terrier", "white & black", 20);
		
		//test the methods
		System.out.println(noelleDog.getName());
		jakeDog.setBreed("idk");
		
		jakeDog.bark();
		noelleDog.bark();
		
		//printing an object
		System.out.println(jakeDog);
		System.out.println(noelleDog);
	}

}
