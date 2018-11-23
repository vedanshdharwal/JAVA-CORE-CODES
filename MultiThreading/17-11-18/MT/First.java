class First extends A implements Runnable
{
	public void run()
	{
	show();
	}
	void show()
	{

		String s=Thread.currentThread().getName();

		for(int i=1;i<=10;i++)
		{
		System.out.println(s+"=>"+i);
		}
	}

	public static void main(String args[])
	{
		First ob1=new First();
		First ob2=new First();
		First ob3=new First();

		Thread t1=new Thread(ob1); t1.setName("One");
		Thread t2=new Thread(ob2); t2.setName("Two");
		Thread t3=new Thread(ob3); t3.setName("Three");

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