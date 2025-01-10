import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a month: ");
		int month = scan.nextInt();
		String name = "";
		switch(month){
		case 1:
			name = "January";
			break;
		case 2: 
			name = "February";
			break;
		case 3:
			name = "March";
			break;
		case 4: 
			name = "April";
			break;
		case 5: 
			name = "May";
			break;
		case 6:
			name = "June";
			break;
		case 7:
			name = "July";
			break;
		case 8:
			name = "August";
			break;
		case 9:
			name = "September";
			break;
		case 10:
			name = "October";
			break;
		case 11: 
			name = "November";
			break;
		case 12:
			 name= "December";
			 break;
		}
		System.out.println("Enter a day: ");
		int day = scan.nextInt();
		if (month ==12 && day>=21 || month ==1 && day>=1 || month==2 &&day>= 1 || month ==3 && day <=19)
			System.out.println( name + " " +  day  + " is in the winter.");
		else if (month ==3 && day >=20 || month ==4 && day >=1 || month ==5 && day>= 1 || month== 6 && day<= 20)
			System.out.println(name + " " +  day + " is in the spring.");
		else if (month ==6 && day>=21 || month ==7 && day>=1 || month==8 && day >=1 || month ==9 && day<=21)
			System.out.println(name +" "  +  day + " is in the summer.");
		else 
			System.out.println(name + " " +  day + " is in the fall.");
		
		
	

}
}