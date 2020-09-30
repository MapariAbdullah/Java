import java.util.Scanner;
class calci{
	
	public static void main(String args[]){

		System.out.println("Enter 1 for addtition\nEnter 2 for subtraction\nEnter 3 for multiplication\nEnter 4 for division\nEnter 5 for modulus");
		Scanner s1= new Scanner(System.in);
		int inp=s1.nextInt();
		System.out.println("\nEnter the 1st number: ");
		int n1= s1.nextInt();
		System.out.println("\nEnter the 2nd number: ");
		int n2= s1.nextInt();

		switch(inp)
		{
			case 1:
				{
					System.out.println("\nThe addition of the numbers is "+(n1+n2));
					break;
				}
			case 2:
				{
					System.out.println("\nThe subtraction of the numbers is "+(n1-n2));
					break;
				}
			case 3:
				{
					System.out.println("\nThe multiplication of the numbers is "+(n1*n2));
					break;
				}
			case 4:
				{
					System.out.println("\nThe division of the numbers is "+(n1/n2));
					break;
				}
			case 5:
				{
					System.out.println("\nThe modulus of the numbers is "+(n1%n2));
					break;
				}
				default:
				{
					System.out.println("\nInvalid input");
					break;
				}


		}
	}
}