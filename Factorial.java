import java.util.Scanner;
class Factorial{
	
	public static void main(String args[])
	{
	Scanner userin = new Scanner(System.in);
	System.out.print("Enter a no :");
	int fact=userin.nextInt();
	int x=1;
	for(int i=1;i<=fact;i++)
	{
		x=x*i;
	}
	System.out.println("Factorial of "+fact+" is "+x);
}
}