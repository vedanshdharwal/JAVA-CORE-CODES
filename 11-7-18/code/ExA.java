public class ExA
{
	public static void f1() 
	{
		try
		{
		Thread.sleep(20);
		}
		catch(InterruptedException e)
		{}

		try
		{
		Class.forName("abc");
		}
		catch(ClassNotFoundException e)
		{}

	
	}
}