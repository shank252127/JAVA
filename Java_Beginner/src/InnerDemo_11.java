//Inside a class:
		// we can have - Variable and Method;
		// we can also include a Class inside a class;
		// we can also include a Static-Class inside a class;

// why we need inner class;
class Outer
{
	int a;
	
	public void show()
	{
		System.out.println("Outer class method");
	}
	//Inner non static class;
	class Inner
	{
		
		public void display()
		
		{
			
			System.out.println("Inner class method");
		}
	}
	
	//inner static class;
	static class InnerStatic
	{
		
		public void displayStatic()
		
		{
			
			System.out.println("Inner static class method");
		}
	}
	
}

public class InnerDemo_11 
{	

	public static void main(String[] args) 
	{
		// way to assign outer class method to object;
		Outer obj = new Outer();
		obj.show();
		
		// way of assigning a inner class method to object;
		Outer.Inner objInner = obj.new Inner();
		objInner.display();
		
		//way to access to inner static class;
		Outer.InnerStatic objStatic = new Outer.InnerStatic();
		objStatic.displayStatic();
		
		
		
		
	}
}
