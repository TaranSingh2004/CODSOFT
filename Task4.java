import java.util.*;

//ATM interface containing methods

interface ATMinterface{
	public void withdraw();
	public void deposit();
	public void checkBalance();
}

//ATM class which implements the interface

class ATM implements ATMinterface{
	 int balance=0;
	Scanner s= new Scanner(System.in);
	
	//withdraw method
	
	public  void withdraw(){
		System.out.println("Enter the amount u want to withdraw: ");
		int w= s.nextInt();
		balance=this.balance;
		if(w<balance){
			balance=balance-w;
			System.out.println("transaction completed. You are left with " + balance+ " rupees.");
		}
		else{
			System.out.println("Insufficient Balance, Please select lesser value");
		}
		
	}
	
	//deposit method
	
	public  void deposit(){
		System.out.println("Enter the amount u want to add: ");
		int a = s.nextInt();
		balance=balance+a;
		System.out.println("The money is added successfully");
		
	}
	
	//checkBalance method
	
	public  void checkBalance(){
		System.out.println("Balance : "+balance);
		
	}
}
class Task4 extends ATM{
	public static void main(String args[]){
		ATM atm= new ATM();
		
		//defining choice with switch case.
		
		while(true){
		System.out.println("Hii, please amount in ur account u have 0 rupees right now.");
		System.out.println("Choose 1 for Withdraw");  
        System.out.println("Choose 2 for Deposit");  
        System.out.println("Choose 3 for Check Balance");  
        System.out.println("Choose 4 for EXIT");  
        Scanner s= new Scanner(System.in);
		System.out.println("Choose the operation you want to perform:"); 
		int choice = s.nextInt();
	
        switch(choice) {
			case 1:
			    atm.withdraw();
			    break;
			case 2:
			    atm.deposit();
			    break;
			case 3:
			    atm.checkBalance();
			    break;
			case 4:
			    System.exit(0);
		}
	}}
}