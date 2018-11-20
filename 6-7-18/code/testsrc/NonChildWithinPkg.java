package test;
public class NonChildWithinPkg
{
	void show()
	{
		Main ob=new Main();
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.c);
		System.out.println(ob.d);
	}
}
/*
	the class whose members are used and the class in which they
	are used belongs to same package and not having any
	parent child relationship also.
*/