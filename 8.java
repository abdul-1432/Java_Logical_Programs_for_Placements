public class Main
{
	public static void main(String[] args) {
		int n=6;
		int sum=0;
		int temp=sum;
		for (int i=1;i<6;i++)
		{
		if(n%i==0)
		{
		    sum= sum +i;
		}
		
		}
		
		if(n==sum)
		{
		System.out.println("Perfect Number");
		}
		else
		{
		    System.out.println("Not Perfect Number");
		}
	}
}

