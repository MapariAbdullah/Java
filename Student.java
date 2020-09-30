class Student{

	int id=1000;
	String name="John";
	String gender="Male";
	void updateProfile(){

		System.out.println("Registration details");
		System.out.println("id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Gender:"+gender);

	}

	public static void main(String args[])
	{
		Student s=new Student();
		s.updateProfile();
	}
}