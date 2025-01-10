
public class BinomialCalculator {

	
		// TODO Auto-generated method stub
		public static double factorial(int n){
			double fact = 1;
			for(int i = 1; i<=n; i++) {
				fact=fact*i;
		}
			return(fact);
			}

			public static double combinations(int num, int r){
				return(factorial(num)/(factorial(num-r)*factorial(r)));
			}

			public static double binomialDist(int nt, double p, int k){
				double value =0;
				double cp = 0;
				for (k = 0; k >= 0; k--) {
					 cp = combinations(nt, k)*Math.pow(p, k)*Math.pow(1-p, nt-k);
					value = value + cp;
				}
		
			return(value);
				
			}
			public static void main(String[] args){
			System.out.println(binomialDist(10, 0.3, 4)); 
		
			
			}
			
	

}
