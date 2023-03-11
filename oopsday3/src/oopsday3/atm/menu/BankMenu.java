package oopsday3.atm.menu;

import java.util.Scanner;
public class BankMenu {
	//1.display account 2. deposit 3.withdraw 4.balanceEnquiry 5. exit
	
	BankOfAmerica2 boa = new BankOfAmerica2();
	public BankMenu() {
		Account a1 = new Account(101,"John Doe","saving",500);
		Account a2 = new Account(102,"Ja Doe","savings",700);
		Account a3 = new Account(103,"Jo Doe","savings",850);
		Account a4 = new Account(104,"Jon Doe","savings",250);
		Account a5 = new Account(105,"Joh Doe","savingS",650);
		
		
		boa.addAccount(a1);
		boa.addAccount(a2);
		boa.addAccount(a3);
		boa.addAccount(a4);
		boa.addAccount(a5);
		
	}
//	public void menu()
//		Scanner scanner = new Scanner(System.in);
//		int choice=0;
//		loop: do
//		{
//			System.out.println("Enter your choice 1...5");
//			System.out.println("1.Display account");
//			System.out.println();
//		}	{

	}


	
