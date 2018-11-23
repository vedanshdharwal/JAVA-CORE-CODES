class First extends A implements Runnable
{
	public void run()
	{
	show();
	}
	void show()
	{
		for(int i=1;i<=10;i++)
		{
		System.out.println("I = "+i);
		}
	}

	public static void main(String args[])
	{
		First ob1=new First();
		First ob2=new First();
		First ob3=new First();

		Thread t1=new Thread(ob1);
		Thread t2=new Thread(ob2);
		Thread t3=new Thread(ob3);

		t1.start();
		t2.start();
		t3.start();
	

	
	}
}
/*
	1) implements Runnable interface.
	2) override the run method.
	3)  
*/