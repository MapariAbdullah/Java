class Enclosing{
	int outernum=100;
	void display(){

		Nested n= new Nested();
		n.showdata();
	}
	class Nested{
		void showdata(){
		System.out.println("The value stored in the variable outer-num is " +outernum);
		}
	}
}
class NestedDemo{
	public static void main(String args[])
	{
		Enclosing obj= new Enclosing();
		obj.display();
	}
}