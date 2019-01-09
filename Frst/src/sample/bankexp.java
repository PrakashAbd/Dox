package sample;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;
class accountt
{
	String name;
	int accnum;
	double balance;
	public accountt() {}
	public accountt(String name, int accnum, double balance) {
		super();
		this.name = name;
		this.accnum = accnum;
		this.balance = balance;
	}
	static List<Integer> se = new LinkedList<Integer>();
	void deposit(double amt)throws Exception
	{	
		if(amt<=0)
			throw new Exception("InvalidAmountException");
		else
			this.balance += amt;
	}
	void withdraw(double amt)throws Exception
	{				
		if(amt<=0)
			throw new Exception("InvalidAmountException");
		else if(this.balance<amt)
			throw new Exception("InsufficientBalanceException");
		else
			this.balance -= amt;
	}
	double getbalance()
	{		return this.balance;			}
}



class bankexp extends accountt
{
	public bankexp() {}
	public bankexp(String name, int accnum, double balance) 
	{		super(name, accnum, balance);		}
	
	static accountt ac[] = new accountt[2];
	void createAccount()throws Exception
	{
		if(this.balance<500 || se.contains(this.accnum))
			throw new Exception("AccountCreationException");
		
		se.add(this.accnum);
		System.out.println("Account Created Successfully!");
	}
	void transferFunds(int frmact,int toact,double amt)throws Exception
	{
		if(!(se.contains(frmact)) || !(se.contains(toact)))
			throw new Exception("AccountTransactionException");
		
		int frm = 0, to = 0;
		for(int i=0;i<se.size();i++)
		{
			if(ac[i].accnum==frmact)
				frm = i;
			else if(ac[i].accnum==toact)
				to = i;
		}
		if(ac[frm].balance<amt)
				throw new Exception("InsufficientBalanceException");
		else if(amt<0)
				throw new Exception("InvalidAmount Exception");
		else
		{
			ac[frm].balance  -= amt;
			ac[to].balance += amt;
			System.out.println("Account number \tNew Balance ");
			System.out.println(ac[frm].accnum+"\t"+ac[frm].balance);
			System.out.println(ac[to].accnum+"\t"+ac[to].balance);
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		bankexp a[] = new bankexp[2];
		
		try
		{
			for(int i=0;i<2;i++)
			{
				System.out.println("Enter AccountName, AccountNumber, Balance ");
				a[i] = new bankexp(s.next(),s.nextInt(),s.nextDouble());
				ac[i] = a[i];
				a[i].createAccount();
			}
			int n =0;
			while(n!=5)
			{
				System.out.println("1.Deposit 2.Withdraw 3.Fundtransfer 4.Balance inquiry 5.exit");
				n = s.nextInt();
				switch(n)
				{
					case 1:	System.out.println("Enter the Account Number do u want to deposit");
							int acc = s.nextInt();
							if(se.contains(acc))
							{	
								for(int i=0;i<se.size();i++)
								{
									if(a[i].accnum==acc)
									{
										System.out.println("Enter the amount to be deposited");
										a[i].deposit(s.nextDouble());
										break;
									}
								}
							}
							else
								throw new Exception("Invalid Account Number");
							break;
					case 2: System.out.println("Enter the Account Number do u want to withdraw");
							int ac1 = s.nextInt();
							if(se.contains(ac1))
							{	
								for(int i=0;i<se.size();i++)
								{
									if(a[i].accnum==ac1)
									{
										System.out.println("Enter the amount to be deposited");
										a[i].deposit(s.nextDouble());
										break;
									}
								}
							}
							else
								throw new Exception("Invalid Account Number");
							break;
					case 3: System.out.println("Enter the FrmAccntNum, ToAccNum, Amount");
							a[0].transferFunds(s.nextInt(),s.nextInt(),s.nextDouble());
							break;
					case 4: for(int i=0;i<2;i++)
								System.out.println("Acc Num "+a[i].accnum+" Balance "+ a[i].getbalance());
							break;
					default: System.out.println("Exit");
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		s.close();
	}
}