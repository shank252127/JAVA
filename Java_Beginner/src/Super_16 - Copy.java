class A
{	
	// Constructor;
	public A()
	{
		System.out.println("I am A");
	}
	
	// Parameterized Class;
	public A(int a)
	{
		System.out.println("I am para A");
	}
}

// B is inheriting A;
class B extends A
{	
	// Constructor;
	public B()
	{
		// this super method is always available even if we not put there 
		// Java puts there internally, thats why It calls the parent/super class
		// first, when both of them are inherited;
		
		// here there is no parameter so it will called the default constructor of A;
		// super();
		System.out.println("I am B");
	}	
	// Parameterized Class;
	public B(int b)
	{
		// here there is parameter so it will called the parameterize constructor of A;
		super(b);
		System.out.println("I am para B");
	}
}


public class Super_16 {
	public static void main(String[] args) {		
		B obj = new B(); // O/P - I am A; I am B;
		// You will get the output from A and B both -
		// Coz constructor will get called automatically -
		// though both are inherited so both constructor -
		// will get called;
		
		B obj1 = new B(5); // O/P - I am A; I am para B;
		// You will get the output from default constructor of A and  -
		// B's parameterize constructor will get called - 
		// Coz constructor will get called automatically for A -
		// for B we are passing the Parameter;
		
		// What if we need to call a Parameterize constructor of A, instead of the default one;
		// to do so pass parameter in super of B's Constructors;		
		
	}

}

// why multiple inherited is not possible;
// This is coz of Ambiguity;
