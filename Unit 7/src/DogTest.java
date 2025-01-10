import java.util.ArrayList;

// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//
// ****************************************************************
public class DogTest{
	public static void main(String[] args){
		Dog dog = new Dog("Spike");
		System.out.println(dog.getName() + " says " + dog.speak());
		
		Labrador dog2 = new Labrador("Thomas", "yellow");
		System.out.println(dog2.getName() + " says " + dog2.speak());
		
		Yorkshire dog3 = new Yorkshire("Nicholas", "short");
		System.out.println(dog3.getName() + " says " + dog3.speak());
		
		System.out.println(dog2.avgBreedWeight());
		System.out.println(Labrador.avgBreedWeight());
		
		Dog dog4 = new Labrador("Clifford", "red");
		Dog dog5 = new Yorkshire("Pickles", "long");
		Labrador dog6 = new Labrador("Danielle","brown");
		
		ArrayList<Dog> allDogs = new ArrayList<Dog>();
		
		allDogs.add(dog);
		allDogs.add(dog2);
		allDogs.add(dog3);
		allDogs.add(dog4);
		allDogs.add(dog5);
		allDogs.add(dog6);
		
		for(Dog currentDog : allDogs) {
			System.out.println(currentDog.speak());
		}
		
		Dalmation dog7 =new Dalmation("Marshal", true);
		System.out.println(dog7.speak());
	}
}