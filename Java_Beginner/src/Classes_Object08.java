// classes : these are the blueprint and used 
// object : its a body which has certain behaviour and value;

//class
class Calc{
	//in java if int is not assigned a value to the the default is 0;
	int num1;
	int num2;
	int result;
	
	// void is a return type, void means it doesn't return anything;
	// public modifier;
	
	//method:
	public void perform(){
		result = num1 + num2;
	}
	//method overloading : same method with different parameters or different types of parameters;
}

public class Classes_Object08 {
	public static void main(String args[]) {
		
		//creating object which takes the blueprint of the Class Calc;
		Calc obj = new Calc();// reference;
		//object knows something and object does something;
		
		//accessing the objecting;
		obj.num1=3;
		obj.num2=4;
		obj.perform();
		System.out.println(obj.result);
		
	}
}
