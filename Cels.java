import java.util.Scanner;

class Cels{
	
	public static void main(String args[])
	{
		
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter Temp in Celsius: ");
		
		float input =userin.nextFloat();
		
		float fahr=((9*input)/5)+32;
	
		System.out.println("Temp in Fahreinheit: "+fahr);
	
	}
}