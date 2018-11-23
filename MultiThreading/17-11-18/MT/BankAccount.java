public class BankAccount
{
	int ano, bal;

	public void withdraw(int amt)
	{
		String s=Thread.currentThread().getName();

		if(bal>=amt)	
		{
		System.out.println("Transaction Allowed For : "+s);
		System.out.println("Collect Cash For "+s);
		bal=bal-amt;
		System.out.println("Remaining Bal For "+s+" is "+bal);		
		}
		else
		{
		System.out.println("Insufficient Balance In Account of "+s);
		}
	}
	public BankAccount(int x, int y)
	{
		ano=x; bal=y;
	}
}