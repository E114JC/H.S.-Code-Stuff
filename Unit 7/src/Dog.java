// ****************************************************************
// Dog.java
//
// A class that holds a dog's name and can make it speak.
//
// ****************************************************************
public class Dog{
	//instance variables
	protected String name;
	
	// ------------------------------------------------------------
	// Constructor -- store name
	// ------------------------------------------------------------
	public Dog(String n){
		name = n;
	}
	
	// ------------------------------------------------------------
	// Returns the dog's name
	// ------------------------------------------------------------
	public String getName(){
		return name;
	}
	
	// ------------------------------------------------------------
	// Returns a string with the dog's comments
	// ------------------------------------------------------------
	public String speak(){
		return "Woof";
	}
}