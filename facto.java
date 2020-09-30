import java.util.Scanner;
class facto{
	
	public static void main(String args[])
	{
	Scanner fact = new Scanner();
	int factorial=fact.SystemIn();
	int x=1;
	for(int i=1;i<=factorial;i++)
	{
		x=x*i;
	}
	System.out.println("Factorial of "+fact+" is "+x);
}
}