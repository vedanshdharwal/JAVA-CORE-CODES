public class NonChildOutsidePkg
{
	void disp()
	{
		Main ob=new Main();
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.c);
		System.out.println(ob.d);
	}
}
/*
	NonChildOutsidePkg
	------------------------------
	the class whose members are used and the class where the members
	are used are not in same package and not having parent child
	relationship also.
*/