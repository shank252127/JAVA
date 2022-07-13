//Static keyword and block is used to create such variable which will assign only once in whole program, and whose value is not changable;
class Emp{
	int eid;
	int salary;
	String ceo;
	String info;
	
	//this will not go into heap, it goes into class loader;
	//making it static means it will not change;
	static String company;
	static int revenew;
	
	
	//we can also initialize a static block which will run once;
	static {
		revenew = 20000;
		System.out.println("In Static");
	}
	
	// constructor will be called multiple time, whenever object is created;
	// constructor are mainly used to initialize non static variable;
	public void inf() {
		System.out.println("In Constructor");
		System.out.println(ceo + ' ' + eid + ' '+ salary);
		info = ceo;
	}
	
}
public class Static10 {
		public static void main(String[] args) {
			Emp shank = new Emp();
			//assigning the value to static variables;
			//it can be done by class name or object;
			//but using class is peferable;
			Emp.company="Shank Comp";
			

			shank.eid = 9;
			shank.salary = 32000;
			shank.ceo = "Shashank Singh";
			
			Emp singh = new Emp();
			singh.eid = 2;
			singh.salary = 21000;
			singh.ceo = "Singh shashank";
			
			shank.inf();
			singh.inf();
			
			//ways to call static;
			System.out.println(shank.company+1);
			System.out.println(singh.company+2);
			System.out.println(Emp.company+3);
			System.out.println(Emp.revenew+" Hello ");
			
			System.out.println(shank.info+ " "+singh.info);
						
		}
}

