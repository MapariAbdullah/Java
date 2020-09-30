import java.util.Scanner;
public class grade
{
	public static void main(String args[])
	{
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter your percentage: ");
		int gr=s1.nextInt();
		
		
		if(gr>90)
			System.out.println("Your Grade is A");
		
		else if(gr>80)
			System.out.println("Your Grade is B");
		
		else if(gr>70)
			System.out.println("Your Grade is C");
		
		else if(gr>60)
			System.out.println("Your Grade is D");
		
		else
			System.out.println("Your Grade is F");
		
	}

}