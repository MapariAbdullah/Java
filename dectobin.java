import java.util.Scanner;
class dectobin{
	
	public static void main(String args[])
	{
		int input;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a decimal number:");
		input=s1.nextInt();
		int binary[]=new int[10];
		for(int i=0;i<10;i++)
		{
			binary[9-i]=input%2;
			System.out.print(binary[i]);
			input=input/2;
		}
		
	}
}