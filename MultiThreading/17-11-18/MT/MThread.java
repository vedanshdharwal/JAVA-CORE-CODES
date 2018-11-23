public class MThread extends Thread
{

public void run()
{
try
{
	String s=getName();
	System.out.println(s+"=>Statement-1");
	if(s.equals("BB"))
	{
	//System.in.read();
	}
	System.out.println(s+"=>Statement-2");
	System.out.println(s+"=>Statement-3");
	System.out.println(s+"=>Statement-4");
}
catch(Exception e)
{}
}
public static void main(String args[]) throws Exception
{
	MThread t1=new MThread(); t1.setName("AA");
	MThread t2=new MThread(); t2.setName("BB");
	MThread t3=new MThread(); t3.setName("CC");
	MThread t4=new MThread(); t4.setName("DD");

	//System.out.println(tmp);

	Thread tmp=Thread.currentThread();

	System.out.println(tmp.getName());
	System.out.println(tmp.getPriority());
	
	tmp.setName("ABCD");
	tmp.setPriority(10);
	System.out.println(tmp.getName());
	System.out.println(tmp.getPriority());





/*
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	t2.join(30000);
	if(t2.isAlive())
	{
	System.out.println("Hello BB");
	}
	else
	{
	System.out.println("Goodbye BB");
	}

*/

	System.out.println("End-of-Main");
}
}
/*
	void run()
	void start()
	void stop()
	void setName(String)
	String getName()
	void setPriority()
	int getPriority()
	static void sleep(long)
	void join()
	void join(long)
	boolean isAlive()
	static Thread currentThread()
	//returns the running thread







	






	



*/