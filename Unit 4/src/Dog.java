
public class Dog {

	//instance variables 
	private String name; 
	private int age;
	private String breed; 
	private String fur_color;
	private double weight;
	
	//constructor
	public Dog(String n, int a, String b, String f, double w) {
		name = n;
		age = a;
		breed = b;
		fur_color= f;
		weight = w;
	}
	
	//another constructor
	public Dog(String n, String f) {
		name = n;
		fur_color = f;
		age = 5; //provide a default value
		
	}
	
	//get method
	public String getName() {
		return name;	
		
	}
	
	
	public String getfur_color() {
		return fur_color;
	}
	
	public int getage() {
		return age;
	}
	
	public String getbreed() {
		return breed;
	}
	
	public double getweight() {
		return weight;
	}
	
	//set methods
	public void setBreed(String b) {
		breed = b;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setAge (int a) {
		age = a;
	}
	
	public void setFur_Color(String f) {
		fur_color = f;
	}
	
	public void setWeight(double w) {
		weight = w;
	}
	
	
	//a random method
	public void bark() {
		if(weight<10) {
			System.out.println("yip!");
		}
		else if (weight <40) {
			System.out.println("ruff!");
		}
		else
			System.out.println("woof!");
	}
	
	//override the memory address printout
	//write a toString method
	public String toString() {
		return ("Name: " + name + " Fur Color: " + fur_color );
		
	}
	
	
	
	
	
	
	
	
	
	
}

