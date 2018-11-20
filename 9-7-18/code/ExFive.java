class ExFive
{
public static void div(int p, int q)
{
	System.out.println("Starting-div");
	try
	{
	System.out.println(p/q);
	}
	catch(ArithmeticException e)
	{
	System.out.println("Handled By Div");
	}
	System.out.println("Ending-div");
}
public static void callDiv(int a, int b)
{
	System.out.println("Starting-callDiv");
	try
	{
	div(a,b);
	}
	catch(ArithmeticException e)
	{
	System.out.println("Handled By CallDiv");
	}
	System.out.println("Ending-callDiv");
}

public static void  main(String args[])
{
	System.out.println("Starting-main");
	int x=0,y=0;
	x=Integer.parseInt(args[0]);
	y=Integer.parseInt(args[1]);
	try
	{
	callDiv(x,y);
	}
	catch(ArithmeticException e)
	{
	System.out.println("Handled By Main");
	}
	System.out.println("Ending-main");
}
}
