import test.Main;
public class ChildOutsidePkg extends Main
{
	void disp()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
/*
	ChildOutsidePkg
	------------------------------
	the class whose members are used and the class where the members
	are used are not in same package and  having parent child
	relationship.
*/