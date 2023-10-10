public class Main
{
	public static void main(String[] args) {
		int num =153;
		int SumOfCube = 0, a, temp;
		temp= num;
		while (num> 0)
		{
		    a = num%10;
		    num = num/10;
		    SumOfCube = SumOfCube + (a*a*a);
		}
		if(temp==SumOfCube)
		{
		    System.out.println("Armstrong Number");
		}
		else 
		{
		   System.out.println("Not Armstrong Number");
		}
	}
}
