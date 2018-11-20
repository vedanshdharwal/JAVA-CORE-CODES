public class SBI
{
public static void main(String args[])
{

	BankAccount ac1=new BankAccount();
	BankAccount ac2=new BankAccount();
	BankAccount ac3=new BankAccount();
	BankAccount ac4=new BankAccount();

	ac1.setData(111,"AAA",10000);
	ac2.setData(112,"BBB",20000);
	ac3.setData(113,"CCC",30000);
	ac4.setData(114,"DDD",40000);

	ac1.showData();
	ac2.showData();
	ac3.showData();
	ac4.showData();
	
/*
	BankAccount.showTotal();

	BankAccount.showAvg(ac2,ac3);
	BankAccount.showAvg(ac1,ac2,ac3);
	BankAccount.showAvg(ac1,ac2,ac3,ac4);

*/

}
}