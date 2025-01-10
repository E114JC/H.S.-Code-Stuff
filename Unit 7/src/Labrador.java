// ****************************************************************
// Labrador.java
//
// A class derived from Dog that holds information about
// a labrador retriever. Overrides Dog speak method and includes
// information about avg weight for this breed.
//
// ****************************************************************
public class Labrador extends Dog{
	//instance variables
	private String color; //black, yellow, or chocolate?
	private static int breedWeight = 75;
	
	public Labrador(String n, String c){
		super(n);
		color = c;
	}
	
	// ------------------------------------------------------------
	// Big bark -- overrides speak method in Dog
	// ------------------------------------------------------------
	public String speak(){
		return "WOOF";
	}
	
	// ------------------------------------------------------------
	// Returns average weight of a Labrador
	// ------------------------------------------------------------
	public static int avgBreedWeight(){
		return breedWeight;
	}
}