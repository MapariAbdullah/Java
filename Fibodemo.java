class Fibodemo{
	
	public static void main(String args[])
	{
		fibo obj= new fibo();
		for(int i=0;i<10;i++){
			System.out.print(obj.fibon(i)+" ");
		}
	}
}

class fibo{
	int fibon(int n)
	{
		if(n==0||n==1) return n;
		else
			return fibon(n-1)+fibon(n-2);
	}
}