package test;
public class ChildWithinPkg extends Main
{
	void show()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
/*
	ChildWithinPkg means
	the class whose members are used and the class in which they
	are used belongs to same package and they have
	a parent child relationship.
	the class whose members are used is parent
	the class which is using the members is child
*/