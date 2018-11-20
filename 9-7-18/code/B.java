public class B extends A
{
	public B()
	{
	super(4,5);
	System.out.println("B-0");
	}
	public B(int a, int b)
	{
	super(2,3,4);
	System.out.println("B-2");
	}
	public B(int a, int b, int c)
	{
	super(1,2);
	System.out.println("B-3");
	}
	public B(String s)
	{
	super(5,6);
	System.out.println("B-S-1");
	}
	public static void main(String args[])
	{
		new B("abc");
	}
}
/*
	if the parent class is not having any zero arg constructor
	every constructor of child must have an explicit
	call to any available constructor of parent.
	constructors can be explicitly called using super keyword.

*/