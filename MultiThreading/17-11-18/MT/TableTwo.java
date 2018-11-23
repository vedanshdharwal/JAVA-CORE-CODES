public class TableTwo extends Thread
{
public TableTwo()
{
	start();
}
public void run()
{
	String s=getName();
	for(int i=1;i<=10; i++)
	{
	System.out.println(s+"=>"+(i*2));
	}
}
}