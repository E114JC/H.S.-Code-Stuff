
public class DiscreteProbabilityDistributions {
	
	public static double factorial(int n){
		double fact = 1;
		for(int i = 1; i<=n; i++) {
			fact=fact*i;
	}
		return(fact);
		}
	
	public static double geoDis(double p, int x) {
		return(p *Math.pow(1-p, x-1));
		
	}
	public static double poissonDis(double l, int x) {
		return (Math.pow(2.7183, l)*Math.pow(l, x)/factorial(x));
	}
	public static void main(String []args) {
		System.out.println(geoDis(.3, 8));
	}
}
