package Atm;
import java.util.*;

class AtmFunc {
	
	int pin = 1212;
	
	double balance =10000;
	
	String name = "Monika";
	 // To get user pin
	public double GetPin() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the pin:");
		  double UserInput = sc.nextInt();
		  
		  if(pin==UserInput) {
			  
			  menu();
		  }
		  
		  else {
			  System.out.println("You have entered an invalid pin,Please try again ");
			  
		  }
		return GetPin();
			}
	
	//Menu
	public void menu() {
		  System.out.println("Welcome"+" "+ name +" "+"!...");
		  System.out.println("Please press any one of the option below:");
		  System.out.println("Press 1 to Deposit");
		  System.out.println("Press 2 to Withdraw ");
		  System.out.println("press 3 to viewBalance");
		  System.out.println("press 4 to exit");
		 Scanner sc=new Scanner(System.in);
		  int UserOption = sc.nextInt();
		  
		  if(UserOption==1) {
			  
			  Deposit();
		  }
		  else if(UserOption==2) {
			  Withdraw();
		  }
          else if(UserOption==3) {
        	  viewBalance();
		  }
          else if(UserOption==4) {
	      exit();
 }
          else {
        	System.out.print("Enter a valid option");
          }
	}
	//to view balance
	public void viewBalance() {
		 //balance=10000;
		System.out.println( "your balance is :"+ balance);
		menu();
		
		
	}
	//to deposit
	public void Deposit() {
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("enter the deposit amount:");
		 
		 double DepositAmount = sc.nextDouble();
		 
		 balance= (DepositAmount+balance);
		 
		 System.out.println("money deposited successfully");
		 
		  viewBalance();
		 menu();
		 
		 }
	//to withdraw
public void Withdraw() {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the withdrawal amount:");
	 double WithdrawAmnt =sc.nextDouble();
	 if(WithdrawAmnt>balance) {
		 System.out.println("insufficient balance");
	 }
	 else {
		 balance =  balance-WithdrawAmnt;
		 System.out.println("Money withdraw successfully");
		 
	 }
	viewBalance();
	
	menu();
}

public void exit() {
	GetPin();
}

 
}
