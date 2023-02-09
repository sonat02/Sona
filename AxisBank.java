package org.bank;

public class AxisBank {
	public void deposit() {
		System.out.println("Deposit");
	}
	public static void main(String args[]) {

	   AxisBank a=new AxisBank();
	   a.deposit();
	   BankInfo b=new BankInfo();
	   b.saving();
	   b.fixed();
	}
	
	

}
