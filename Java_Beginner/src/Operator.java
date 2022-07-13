
public class Operator {
	/*Arithmetic : -,+,*,/,%;
	 *Bitwise  
	 *Relational
	 *Logical 
	 */
	public static void main (String args[]) {
		int m = 6;
		int n =2;
		
		int r1= m+n;// n+=m // n++==n+1
		int r2=m-n;
		int r3 = m*n;
		int r4 = m/n;//it doesn't return in  decimal;
		double r5 = (double)m/n; //this return decimal
		int r6 = m%n;
		
		
		System.out.print(r1);
		System.out.print('\n');
		System.out.print(r2);
		System.out.print('\n');
		System.out.print(r3);
		System.out.print('\n');
		System.out.print(r4);
		System.out.print('\n');
		System.out.print(r5);
		System.out.print('\n');
		System.out.print(r6);
		System.out.print('\n');
		// shorthand operators
		//++n(pre increment)- first increment then other task;
		//n++(post increment) - first other task than increment;
		m=n++; // first assigned to m then increment;
		System.out.print("Short hand");
		System.out.print('\n');
		System.out.print(m);
		System.out.print('\n');
		System.out.print(n);
		// double quotes vs single quotes
		
		
	}
	
	
	

	
	

}
