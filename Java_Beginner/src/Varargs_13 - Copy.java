class CalcSum
{
	// this is called variable length argument aka VaRARGS;
	// we can put three dots and it will take any number of the argument;
	public int add(int ...n)
	{
		int sum = 0;
		for (int k : n)
		{
			sum = sum+k;
		}
		return sum;
		
	}
}
public class Varargs_13 {
	public static void main(String [] args){
		CalcSum obj = new CalcSum();
		System.out.println(obj.add(1,2,3,4,5,6,7,8));
	}

}
