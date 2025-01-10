import java.text.DecimalFormat;
import java.util.Scanner;

public class CombinedandIdealGasLAw {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int comp =0;
		DecimalFormat fmt = new DecimalFormat("0.##");
		while(comp==0) {	
			System.out.println("Welcome to the gas law calculator, which law would you like to solve for? \n1. Combined gas law \n2. Ideal Gas Law");
			double gaslaw= scan.nextDouble();
			if (gaslaw ==1)
				System.out.println("You chose the Combined gas law, which variable is unknown: \n1. V1 \n2. V2 \n3. P1 \n4. P2 \n5. T1 \n6. T2");
			   	int n=scan.nextInt();
			   	if (n ==1) {
			   		System.out.println("To find V1, enter V2: ");
			   		double V2 = scan.nextDouble();
			   		System.out.println("To find V1, enter P1: "); 
			   		double P1 =  scan.nextDouble();
			   		System.out.println("To find V1, enter P2: ");
			   		double P2 =  scan.nextDouble();
			   		System.out.println("To find V1, enter T1: ");
			   		double T1 =  scan.nextDouble();
			   		System.out.println("To find V1, enter T2: ");
			   		double T2 = scan.nextDouble();
			   		System.out.println("Is the temperture in Kelvin and did the units for V1 & V2 match? \n1. no \n2. yes");
			   		int a = scan.nextInt();
			   		double c = T1+273;
	   				double k = T2+273;
			   			if (a==2)
			   			System.out.println("The answer to V1 is " + fmt.format(V2 *P2 *T1 /(P1*T2))  );
			   			else
			   				System.out.println("The answer to V1 is " + fmt.format(P2*V2  *c /(P1*k))  );
			   	}
			   	else if (n ==3) {
					   		System.out.println("To find P1, enter V1: ");
					   		double V1 = scan.nextDouble();
					   		System.out.println("To find P1, enter V2: "); 
					   		double V2 = scan.nextDouble();
					   		System.out.println("To find P1, enter P2: ");
					   		double P2 =  scan.nextDouble();
					   		System.out.println("To find P1, enter T1: ");
					   		double T1 =  scan.nextDouble();
					   		System.out.println("To find P1, enter T2: ");
					   		double T2 = scan.nextDouble();
					   		System.out.println("Is the temperture in Kelvin and did the units for V1 & V2 match? \n1. no \n2. yes");
					   		int a = scan.nextInt();
					   		double c = T1+273;
			   				double k = T2+273;
					   			if (a==2)
					   			System.out.println("The answer to V1 is " + fmt.format(V2 *P2 *T1 /(V1*T2))  );
					   			else
					   				System.out.println("The answer to V1 is " + fmt.format(P2*V2  *c /(V1*k))  );
			   	}
				else if (n ==2) {
							  System.out.println("To find V2, enter V1: ");
							  double V1 = scan.nextDouble();
							  System.out.println("To find V2, enter P1: "); 
							 double P1 =  scan.nextDouble();
							  System.out.println("To find V2, enter P2: ");
							  double P2 =  scan.nextDouble();
							  System.out.println("To find V2, enter T1: ");
							 double T1 =  scan.nextDouble();
							  System.out.println("To find V2, enter T2: ");
							  double T2 = scan.nextDouble();
							  System.out.println("Is the temperture in Kelvin and did the units for V1 & V2 match? \n1. no \n2. yes");
							  double a = scan.nextInt();
							  double c = T1+273;
							  double k = T2+273;
							  if (a==2)
							   	System.out.println("The answer to V1 is " + fmt.format(V1 *P1 *T2 /(P2*T1))  );
							  else
							   	System.out.println("The answer to V1 is " + fmt.format(P1*V1  *k /(P2*c))  );
				}
				else if (n ==4) {
							   		System.out.println("To find P2, enter V1: ");
							   		double V1 = scan.nextDouble();
							   		System.out.println("To find P2, enter V2: "); 
							   		double V2 = scan.nextDouble();
							   		System.out.println("To find P2, enter P1: ");
							   		double P1 =  scan.nextDouble();
							   		System.out.println("To find P2, enter T1: ");
							   		double T1 =  scan.nextDouble();
							   		System.out.println("To find P2, enter T2: ");
							   		double T2 = scan.nextDouble();
							   		System.out.println("Is the temperture in Kelvin and did the units for V1 & V2 match? \n1. no \n2. yes");
							   		int a = scan.nextInt();
							   		double c = T1+273;
					   				double k = T2+273;
							   			if (a==2)
							   			System.out.println("The answer to V1 is " + fmt.format(V1 *P1 *T2 /(V2*T2))  );
							   			else
							   				System.out.println("The answer to V1 is " + fmt.format(P1*V1  *k/(V2*c))  );
					   	}
				else if (n ==5) {
			   		System.out.println("To find T1, enter V1: ");
			   		double V1 = scan.nextDouble();
			   		System.out.println("To find T1, enter V2: "); 
			   		double V2 = scan.nextDouble();
			   		System.out.println("To find T1, enter P1: ");
			   		double P1 =  scan.nextDouble();
			   		System.out.println("To find T1, enter P2: ");
			   		double P2 =  scan.nextDouble();
			   		System.out.println("To find T1, enter T2: ");
			   		double T2 = scan.nextDouble();
			   		System.out.println("Is the temperture in Kelvin and did the units for V1 & V2 match? \n1. no \n2. yes");
			   		int a = scan.nextInt();
			   		//double c = T1+273;
	   				double k = T2+273;
			   			if (a==2)
			   			System.out.println("The answer to V1 is " + fmt.format(V1 *P1 *T2 /(V2*P2))  );
			   			else
			   				System.out.println("The answer to V1 is " + fmt.format(P1*V1  *k /(V2*P2))  );
	   	}
			   
			    
				else if (n ==6) {
			   		System.out.println("To find T2, enter V1: ");
			   		double V1 = scan.nextDouble();
			   		System.out.println("To find T2, enter V2: "); 
			   		double V2 = scan.nextDouble();
			   		System.out.println("To find T2, enter P1: ");
			   		double P1 =  scan.nextDouble();
			   		System.out.println("To find T2, enter P2: ");
			   		double P2 =  scan.nextDouble();
			   		System.out.println("To find T2, enter T2: ");
			   		double T1 = scan.nextDouble();
			   		System.out.println("Is the temperture in Kelvin and did the units for V1 & V2 match? \n1. no \n2. yes");
			   		int a = scan.nextInt();
			   		double c = T1+273;
	   				//double k = T2+273;
			   			if (a==2)
			   			System.out.println("The answer to V1 is " + fmt.format(V2 *P2 *T1 /(V1*P1))  );
			   			else
			   				System.out.println("The answer to V1 is " + fmt.format(P2*V2  *c /(V1*P1))  );
	   	}
			   
			    
			    
			    		
		
		
		
		
		
		
		
		
		
		
		
			   	
		
		
		
	}
}
}