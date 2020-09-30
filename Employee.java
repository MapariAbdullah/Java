import java.util.*;
class Employee
{
    int age;
    long days;
    long salary;
    long overtime;
    long phone;
    String name;
    double rate;
    void details()
    {
        Scanner Scan=new Scanner(System.in);
        System.out.print("Enter your name:");
        name=Scan.next();
        System.out.print("Enter your Number:");
        phone=Scan.nextLong();
        System.out.print("Enter your age:");
        age=Scan.nextInt();          
        System.out.print("Enter your Salary:");
        salary=Scan.nextLong();
        System.out.print("Total present days:");
        days=Scan.nextInt();
        System.out.print("Enter Overtime :");
        overtime=Scan.nextInt();
        System.out.print("Enter rate:");
        rate=Scan.nextDouble();
        salary = (long) ((salary/30)*days + overtime*rate);
        
    }
    void display()
    {
         System.out.println("\nName: "+name);
         System.out.println("Number:"+phone);
         System.out.println("Age:"+age);
         System.out.println("Present days: "+days);
         System.out.println("Gross Salary:  "+salary);
    }
    public static void main(String args[])
    {
        Employee obj=new Employee();
        obj.details();
        obj.display();
    }
}
