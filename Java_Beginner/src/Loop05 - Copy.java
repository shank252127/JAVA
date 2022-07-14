
public class Loop05 {
	// while , do while, for, for-each;
	// when you repeat a code multiple times it's called bad code;
	public static void main (String args[]) {
		// while :
		int i = 0;
		while (i<=6) {
			System.out.println("Hello While");
			i++;
		}
		
		// do while : it will execute the block atleast once even if the condition is not satisfied;
		// below the value of i == 9 but still it is get executed once;
		//execute and then check;
		do {
			System.out.println("hello do while"+i);
			i++;
		}while(i<=8);
		
		//for loop
		for (int x=1;x<=5;x++) {
			System.out.println("Hello for loop");
		}
		
		//for each - will study with array;
		
	}
}
