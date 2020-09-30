class simpleconstructor{
	int x,y;
	simpleconstructor(){
	x=10;
	y=5;
	}
	public void mul(){
	int m=x*y;
	System.out.println("Value after mul is called: "+m);
	}
	public static void main(String args[]){
	simpleconstructor sc= new simpleconstructor();
	sc.mul();
	}
}