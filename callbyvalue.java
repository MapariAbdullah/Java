class callbyvalue{
	
	void check(int a){
	a=a+5;
	System.out.println("value of inside method :"+a);

	}
	public static void main(String args[])
	{
		callbyvalue obj=new callbyvalue();
		int a=10;
		System.out.println("value of before method invocation "+a);
		obj.check(a);
		System.out.println("value of after method invocation "+a);
	}
}