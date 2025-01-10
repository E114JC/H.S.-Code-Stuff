// *****************************************************************
// Yorkshire.java
//
// A class derived from Dog that holds information about
// a Yorkshire terrier. Overrides Dog speak method.
//
// *****************************************************************
public class Yorkshire extends Dog{
	//instance value
	private String hairType; //short or long
	private static int breedWeight =6;
	
	public Yorkshire(String name, String h){
		super(name);
		hairType =h;
	}
	public static int avgBreedWeight(){
		return breedWeight;
	}
	
	// -------------------------------------------------------------
	// Small bark -- overrides speak method in Dog
	// -------------------------------------------------------------
	public String speak(){
		return "woof";
	}
}