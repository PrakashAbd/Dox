package sample;
import java.util.InputMismatchException;
import java.util.Scanner;
class Account
{
	String name;
	int accnum;
	float balance, roi;
	Scanner s = new Scanner(System.in);
	public Account(String name, int accnum, float balance) {
		super();
		this.name = name;
		this.accnum = accnum;
		this.balance = balance;
	}
	float interestperyear()
	{	return balance*roi;		}
	float deposit()throws Exception
	{	return balance;		}
	float withdraw() throws Exception
	{	return balance;		}
	void accountdetails()
	{	System.out.println(name+"  "+accnum+"  "+balance+"  "+this.interestperyear());			}
}


class Saving extends Account
{
	public Saving(String name, int accnum, float balance) 
	{		super(name, accnum, balance);	roi = balance*2;		}
	
	float interestperyear()
	{	roi = balance*2;	return roi;		}
	float deposit()
	{	
		System.out.println("Enter the amount to be deposited ");
		int sum = s.nextInt();
		balance += sum;
		return balance;
	}
	float withdraw()throws Exception
	{
		System.out.println("Enter the amount to be withdrawn ");
		int amt = s.nextInt();
		if(balance<amt)
		{	throw new Exception("Amount Cannot be dispensed");	}
		balance -= amt;
		return balance;
	}
	void accountdetails()
	{
		System.out.println(name+"  "+accnum+"  "+balance+"  "+this.interestperyear());
	}
}


class FixedDeposit extends Account
{
	public FixedDeposit(String name, int accnum, float balance) 
	{		super(name, accnum, balance);	roi = balance*4;		}

	float interestperyear()
	{	roi = balance*4; return roi;			}
	float deposit()
	{	
		System.out.println("Enter the amount to be deposited ");
		int sum = s.nextInt();
		balance += sum;
		return balance;
	}
	float withdraw() throws Exception
	{
		System.out.println("Enter the amount to be withdrawn ");
		int amt = s.nextInt();
		if(balance<amt)
		{		throw new Exception("Amount Cannot be dispensed");	}
		balance -= amt;
		return balance;
	}
	void accountdetails()
	{
		System.out.println(name+"  "+accnum+"  "+balance+"  "+this.interestperyear());
	}
}


public class Bank {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name, acc num, balance for Savings Account");
		Account sa = new Saving(s.next(), s.nextInt(),s.nextFloat());
		System.out.println("Enter the name, acc num, balance for FixedDeposit Account");
		Account d = new FixedDeposit(s.next(),s.nextInt(),s.nextFloat());
		int k = 1;
		while(k!=3)
		{
			System.out.println("1.Savings 2.FixedDeposit 3.Exit");
			try {
			k = s.nextInt();
			switch(k)
			{
			case 1: 
					System.out.println("1.Deposit 2.Withdraw 3.Account Details");
					switch(s.nextInt())
					{
					case 1: System.out.println("New Balance "+sa.deposit());	break;
					case 2: System.out.println("New Balance "+sa.withdraw());	break;
					case 3: sa.accountdetails();	break;
					}
					break;
			case 2:			
					System.out.println("1.Deposit 2.Withdraw 3.Account Details");
					switch(s.nextInt())
					{
					case 1: System.out.println("New Balance "+d.deposit());	break;
					case 2: System.out.println("New Balance "+d.withdraw());	break;
					case 3: d.accountdetails();	break;
					}
					break;
			default: System.out.println("Exit");;
			}}
			catch(ArithmeticException e)
			{	System.out.println(e);}
			catch(InputMismatchException e)
			{	System.out.println(e);	}
			catch(Exception e)
			{	System.out.println(e);	}
		}	
		s.close();
	}
}