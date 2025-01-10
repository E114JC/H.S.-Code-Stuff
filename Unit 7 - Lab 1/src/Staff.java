//********************************************************************
// Staff.java Author: Lewis/Loftus
//
// Represents the personnel staff of a particular business.
//********************************************************************
public class Staff{
	//instance variables
	StaffMember[] staffList; //an array of all staff members
	
	//-----------------------------------------------------------------
	// Constructor - Sets up the list of staff members.
	//-----------------------------------------------------------------
	public Staff(){
		staffList = new StaffMember[8];
		staffList[0] = new Executive ("Michael", "123 First Ave", "555-1234", "123-45-6789", 2423.07);
		staffList[1] = new Employee ("Dwight", "456 Second Ave", "555-5678", "987-65-4321", 1246.15);
		staffList[2] = new Employee ("Jim", "789 Third Ave", "555-9123", "010-20-3040", 1169.23);
		staffList[3] = new Hourly ("Pam", "678 Fourth Ave.", "555-4567", "958-47-3625", 10.55);
		staffList[4] = new Volunteer ("Creed", "987 Fifth Ave.", "555-8901") ;
		staffList[5] = new Volunteer ("Kevin", "321 Sixth Ave.", "555-2345");
		staffList[6] = new Commission ("Dean", "666 Angle Lane" , "111-2222", "888-99-1010", 6.25, .2);
		staffList[7] = new Commission ("Sam", "321 Larans Ave", "333-4555", "777-66-5555", 9.75, .15);
		((Executive)staffList[0]).awardBonus (500.00);
		((Hourly)staffList[3]).addHours (40);
		((Hourly)staffList[6]).addHours(35);
		((Commission)staffList[6]).addSales(400);
		((Hourly)staffList[7]).addHours(40);
		((Commission)staffList[7]).addSales(950);
	}
	
	//-----------------------------------------------------------------
	// Pays all staff members.
	//-----------------------------------------------------------------
	public void payday(){
		double amount;
		for (int count=0; count < staffList.length; count++){
			System.out.println (staffList[count]);
			amount = staffList[count].pay(); // polymorphic
			if (amount == 0.0)
				System.out.println ("Thanks for volunteering!");
			else
				System.out.println ("Paid: " + amount);
			System.out.println ("------------------------------------");
		}
	}
}