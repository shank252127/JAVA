
class A_1 {
	int i;
	public void show() {
		System.out.println("I am A");
	}
}

class B_1 extends A_1 {
	// this show will override the show method of A;
	// we can also put an annotation here.
	//	@Override
	//	public void show() {
	//		System.out.println("I am B");
	//	}
	
	//how to avoid it?
	int i;
	public void show() {
		// super can be used to refer the variables and method of the Parent/Super class;
		super.i=8;
		super.show();
		System.out.println("I am B");
		
	}
	
}

public class MethodOveriding_17 {
	public static void main(String[] args) {
		B_1 obj1 = new B_1();
		obj1.show();
	}
}