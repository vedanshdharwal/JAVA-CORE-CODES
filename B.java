public class B extends A
{

	int x=25;

	public void disp()
	{
		super.show();
	}

	
        public void show()
	{
	System.out.println("hello from show of B");
	}


	public static void main(String args[])
	{
		B ob=new B();
		ob.disp();
	}
}
/*

*/