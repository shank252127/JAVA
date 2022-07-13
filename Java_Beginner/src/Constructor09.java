// Constructor : tells how much memory is required for the object to take in the heap;
// even if we not define it, constructor is there in the class;
// constructor is the member method and has the same name as the class name and it doesn't return anything;
// main use is to allocate memory to object in the heap;
// it can also use to initialize the values to the variable;
// every time we create an object, constructor will be called automatically;

class Calculator
{
	//in java if int is not assigned a value to the the default is 0;
	int num1;
	int num2;
	int result;
	
	// it will be called automatically;
	public  Calculator()
	{
		// re assigning the variable value in constructor;
		num1 = 5;
	}
	
	// Constructor overloading : having more than one constructor -
	// with different parameter;
	// ** remember Parameter should be different;
	
	public Calculator(int k) 
	{
		num2 = k;
	}
	
	public Calculator(int k,int y) 
	{
		num1 = y;
		num2 = k;
	}
	
	// here parameter and the variables have the same name, in this case variable will not assigned with parameter value;
	// in order to avoid this issue we use "this keyword to refer to global variable;
	public Calculator(int num1,int num2,int num3) 
	{	
		// global variable = local parameter;
		this.num1 = num1;
		this.num2 = num2;
	}
}

public class Constructor09 {	
	public static void main(String args[]) {
			Calculator obj = new Calculator(7,8,9);	
			System.out.println(obj.num2);
			System.out.println(obj.num1);
		}
}
