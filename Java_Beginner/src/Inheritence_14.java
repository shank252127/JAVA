
class CalCulater //super or parent or base;
{
	public int add(int i,int j) {
		return i+j;
	}
	
	
}

// We are inheriting the value of above class in the class below;
// its single level inheritance;
class CalAdv extends CalCulater //sub or child or derived;
{
	public int sub(int i , int j ) {
		return i-j;
	}

	public int mul(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
}

// multilevel inheritance;
// java doesn't support multiple inheritance;
class CalMul extends CalAdv //sub or child or derived;
{
	public int mul(int i , int j ) {
		return i*j;
	}
}
// the class which extend the above another class is called IS-A;

public class Inheritence_14 {

	public static void main(String[] args) {
		//THE place where we are assigning inherited class to object is called HAS-A;
		CalAdv c1 = new CalMul();
		int result = c1.add(5, 4);
		int re = c1.sub(8, 3);
		int m =c1.mul(8,4);
		
		System.out.println(result);
		System.out.println(re);
		System.out.println(m);
	}

}
