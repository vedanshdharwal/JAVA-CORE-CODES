public class BankAccount
{
	//data

	private int accountNumber;
	private String customerName;
	private int balance;	
	private static int totalCash;

	//methods

	public static void showAvg(BankAccount...v)
	{
		int n=v.length;
		int sum=0;
		for(int i=0; i<n;i++)
		{
			sum=sum+v[i].balance;
		}
		System.out.println("Avg of n : "+(sum/n));
	}

	public static void showAvg(BankAccount tmp1, BankAccount tmp2)
	{
	System.out.println("Avg of 2  : "+(tmp1.balance+tmp2.balance)/2);
	}



	public static void drawLine()
	{
		System.out.println("________________________________________");
	}


	public static void showTotal()
	{
		System.out.println("Total Cash : "+totalCash);
		drawLine();
	}
	public  void showData()
	{
		System.out.println("Account Details : ");
		System.out.println(accountNumber+","+customerName+","+balance);
		drawLine();
	}	
	public void setData(int accountNumber, String customerName, int balance)
	{
		this.accountNumber=accountNumber;
		this.customerName=customerName;
		this.balance=balance;
		totalCash=totalCash+balance;
	}
}
/*
	setData is a non-static method

	non-static methods cant be called without objects.


	any instance variables used within a non-static
	method of a class always belongs to invoking object.



*/