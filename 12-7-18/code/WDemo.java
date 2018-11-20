public class WDemo
{
	public static void show(Object p)
	{}

	public static void add(int i)
	{}


	public static void main(String args[])
	{
		Integer ob=new Integer(50);
		add(ob);
		add(ob.intValue());
	}
}