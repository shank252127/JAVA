
public class switchSelection {
	public static void main (String args[]) {
		char n = 'A';
		//switch doesn't support double;
		
		switch (n) {
		case 'A':
			System.out.print(n);
			System.out.print("One");
			break;
		case 'B':
			System.out.print("two");
			System.out.print("threww");
			break;
		default:
			System.out.print("Hello");
		}
	}
}
