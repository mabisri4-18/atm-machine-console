package com.atm;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterf{

	ATM atm = new ATM();
	Map<Double,String>ministmt = new HashMap<>();
			
    @Override
	public void viewBalance()
	{
		System.out.println("Availabe Balance is : "+atm.getBalance());
	}
	@Override
	public void withdrawAmount(double withdrawAmount)
	{
		double Balance = atm.getBalance();
		if(withdrawAmount<=Balance)
		{
			ministmt.put(withdrawAmount," Amount Withdrawn");
			System.out.println(withdrawAmount+"Rs "+" Withdrawn Successfully !!");
			System.out.println("Collect your cash");
			atm.setBalance(Balance-withdrawAmount);
		}
		else
		{
			System.out.println("Insufficient Balance !!");
		}
		viewBalance();
	}
	@Override
	public void depositAmount(double depositAmount)
	{
		ministmt.put(depositAmount," Amount deposited");
		System.out.println(depositAmount+" Deposited Successfully !!");
		atm.setBalance(atm.getBalance()+depositAmount);
		viewBalance();
	}
	@Override
	public void viewMiniStatement()
	{
		for(Map.Entry<Double,String>m:ministmt.entrySet())
		{
			System.out.println(m.getKey()+""+m.getValue());
		}
	}

}
