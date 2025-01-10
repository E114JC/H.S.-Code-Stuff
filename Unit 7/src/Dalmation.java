
public class Dalmation extends Dog {
//instance variable
	private boolean isFirefighter;
	
	public Dalmation(String n, boolean f) {
		super(n);
	isFirefighter=f;
	}
	public String speak() {
		return(super.speak() + "wooF");
	}
}
