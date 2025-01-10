
public class Book {
	//instance variables
	String booktitle;
	double price;
	int numofpages;
	int numofcopies;
	int numratings;
	double aver;
	
	//constructors
	public Book(String b, double p, int np, int nc, int nr, double a) {
		booktitle = b;
		price = p;
		numofpages = np;
		numofcopies = nc;
		numratings = nr;
		aver = a;
	}
	public Book(String b, double p, int np) {
		booktitle = b;
		price = p;
		numofpages = np;
		numofcopies = 10;
		numratings = 15;
		aver = 3.5;
	}
	
	//methods
	public void addInventory(int newCopies) {
		numofcopies += newCopies;
	}
	
	public void sellInventory(int copiesinStock) {
		numofcopies -= copiesinStock;
	}
	
	public void updateRating (int newRating) {
		aver = (aver*numratings + newRating)/(numratings +1);
		numratings++;
	}
	//getMethods
	public String getbooktitle() {
		return booktitle;
	}
	public double getprice() {
		return price;
	}
	public int getnumofcopies() {
		return numofcopies;
	}
	
	//setMethods
	public void setbooktitle(String b) {
		booktitle =b;
	}
	public void setnumofpages(int np) {
		numofpages = np;
	}
	
	public void setprice(double p) {
		price =price*p+price;
		if (Math.abs(p)>.25)
			System.out.println("Warning: the price changed more than 25%. It is now " + price);	
		else 
			System.out.println("The new price is " + price);
	}
	
	public String toString() {
		return ("Book Title: " + booktitle + "\tPrice: " + price + "\tNumber of Pages: " + numofpages + "\tNumber of Copies: " + numofcopies + "\tNumber of Ratings: " + numratings + "\tAverage Rating: " + aver);
	}
	
	
	
	
	
	
	
}
