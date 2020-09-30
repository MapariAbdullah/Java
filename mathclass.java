import java.util.Scanner;
class mathclass{

	public static void main(String args[])
	{
		double x,squareroot,cuberoot,square;
		System.out.println("Enter the positive number");
		Scanner sc=new Scanner(System.in);
		x=sc.nextDouble();
		squareroot=Math.sqrt(x);
		cuberoot=Math.cbrt(x);
		square=Math.pow(x,2);
		System.out.println("Squareroot "+squareroot+"\n"+"Cuberoot "+cuberoot+"\n"+"Square "+square);


	}
}
