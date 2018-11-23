public class CATMCard extends Thread
{
	BankAccount account;

	public void run()
	{
			account.withdraw(6000);
	}


public static void main(String args[])
{

	BankAccount ac1=new BankAccount(111,10000);
	BankAccount ac2=new BankAccount(112,20000);
	BankAccount ac3=new BankAccount(113,30000);

	CATMCard c1=new CATMCard(); c1.account=ac1; c1.setName("AA");
	CATMCard c2=new CATMCard(); c2.account=ac2; c2.setName("BB");
	CATMCard c3=new CATMCard(); c3.account=ac3; c3.setName("CC");
	CATMCard c4=new CATMCard(); c4.account=ac1; c4.setName("DD");
	c1.start();
	c2.start();
	c3.start();
	c4.start();
	

}
}