package com.atm;
import java.util.*;


public class Main {

	public static void main(String[] args)
	{
		AtmOperationInterf op = new AtmOperationImpl();
		int atmnumber=12345;
		int atmpin=123;
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to ATM machine!!!");
		System.out.print("Enter your ATM number: ");
		int atmNumber = in.nextInt();
		System.out.print("Enter your pin number: ");
		int pin = in.nextInt();
		if((atmnumber==atmNumber)&&(atmpin==pin))
		{
			while(true) {
			System.out.println();
			System.out.println("1. View Available balance\n2. Withdraw Amount\n3. Deposite Amount\n4. View mini statement \n5. Exit");
			System.out.println();
			System.out.print("Enter your choice: ");
		    int ch = in.nextInt();
		    System.out.println();
		    if(ch==1)
		    {
		    	op.viewBalance();
		    }
		    else if(ch==2)
		    {
		    	System.out.print("Enter your withdraw Amount : ");
		    	double withdrawAmount = in.nextDouble();
		    	op.withdrawAmount(withdrawAmount);
		    }
		    else if(ch==3)
		    {
		    	System.out.print("Enter Amount to Deposit :");
		    	double depositAmount = in.nextDouble();
		    	op.depositAmount(depositAmount);
		    }
		    else if(ch==4)
		    {
		    	op.viewMiniStatement();
		    }
		    else if(ch==5)
		    {
		    	System.out.print("Collect your ATM card!! \nThanks for using ATM Machine!!");
		    	System.exit(0);
		    }
		    else
		    {
		    	System.out.print("please enter correct choice");
		    }
			}
		}
		else
		{
			System.out.print("Incorrect ATM pin");
			System.exit(0);
		}
	}
}
