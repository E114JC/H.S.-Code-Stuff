
public class Commission extends Hourly{
	//instance variables
	private double totalSales;
	private double cRate;
	
	//constructor
	public Commission (String eName, String eAddress, String ePhone, String socSecNumber, double rate, double Crate){
		super (eName, eAddress, ePhone, socSecNumber, rate);
		cRate= Crate;
	}
	
	public void addSales (double totalSales) {
		 this.totalSales +=totalSales;
	}
	
	public double pay() {
		double payment = this.totalSales * cRate;
		this.totalSales=0;
		return payment;
	}

	public String toString(){
		String result = super.toString();
		result += "\nTotal Sales: " + this.totalSales;
		return result;
	}
}

