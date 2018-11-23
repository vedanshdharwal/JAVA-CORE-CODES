public class ATMCard extends Thread
{
	BankAccount account;

	public void run()
	{
		synchronized(account)
		{
			account.withdraw(6000);
		}
	}


public static void main(String args[])
{

	BankAccount ac1=new BankAccount(111,10000);
	BankAccount ac2=new BankAccount(112,20000);
	BankAccount ac3=new BankAccount(113,30000);

	ATMCard c1=new ATMCard(); c1.account=ac1; c1.setName("AA");
	ATMCard c2=new ATMCard(); c2.account=ac2; c2.setName("BB");
	ATMCard c3=new ATMCard(); c3.account=ac3; c3.setName("CC");
	ATMCard c4=new ATMCard(); c4.account=ac1; c4.setName("DD");
	c1.start();
	c2.start();
	c3.start();
	c4.start();
	

}
}