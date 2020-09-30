import java.util.Scanner;

public class Bank {

	long accno;
    double balance, temp;
    String name;
    Scanner S=new Scanner(System.in);
	
    void details()
    {
       
        System.out.print("Enter Name:");
        name=S.nextLine();
        System.out.print("Enter account number:");
        accno=S.nextLong();
        System.out.print("Enter the Balance:");
        balance=S.nextDouble();
    }
    
    void deposit() {
        System.out.print("Enter Amount to deposited:");
        double d=S.nextDouble();
        balance = balance + d;
        System.out.println("Revised balance:" + balance);
        temp = balance;
    }
    
    void withdraw() {
        System.out.print("Enter amount to be withdrawn:");
        double w=S.nextDouble();
        if(balance>=w) {
        balance=balance-w;
        
        if(balance<500.0) {
        	balance = temp;
        	System.out.println("\n=====Transaction not possilbe======");
        }
        }
        else
        {
            System.out.println("The withdrawal ammount is greater that the available balance");
        }
    }
    
    void display() {
        System.out.println("\nName:" + name);
        System.out.println("Account Number:" + accno);
        System.out.println("Balance:" + balance);
    }
	public static void main(String[] args) {
		Bank obj= new Bank();
		obj.details();
		obj.deposit();
		obj.withdraw();
		obj.display();
	}

}
