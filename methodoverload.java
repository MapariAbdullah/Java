class methodoverload{
	/*
	void speak(int, int, int);
	void speak(int, float, int);
	void speak();
	void speak(float, int, int);
	*/
	void sum(int a, int b)
	{
		int sum = a+b;
		System.out.println("Sum of ints: "+sum);
	}
	void sum(float x, float y)
	{
		float sum = x+y;
		System.out.println("Sum of floats: "+sum);
	}
	public static void main(String args[])
	{
		methodoverload mr=new methodoverload();
		mr.sum(20,10);
		mr.sum(15.5f, 20.5f);
	}

}