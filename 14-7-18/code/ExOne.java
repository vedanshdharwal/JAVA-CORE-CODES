class ExOne
{
public static void  main(String args[])
{
	int x=0, y=0, z=0;
	try
	{
	x=Integer.parseInt(args[0]);
	y=Integer.parseInt(args[1]);
	z=x/y;
	}
	catch(ArithmeticException e)
	{
		try
		{
		z=x/Integer.parseInt(args[2]);
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
		z=x/2;
		}
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Insufficient Value(s)");	
	}
	catch(NumberFormatException e)
	{
		System.out.println("Invalid Number(s)");
	}
	
	







	System.out.println("Result : "+z);
	System.out.println("End-of-main");
}
}
