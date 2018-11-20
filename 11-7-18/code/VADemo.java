public class VADemo
{
public static void add()
{
	System.out.println("Nothing To Add");
}
public static void add(double a, double b)
{
	System.out.println("SUM="+(a+b));
}

public static void add(String...v)
{
	String s="";
	for(String tmp:v)
	{
		s=s+tmp;
	}
	System.out.println(s);

}
public static void add(int...v)
{
	int sum=0;
	for(int tmp:v)
	{
		sum=sum+tmp;	
	}
	System.out.println(sum);
}


public static void main(String...args)
{	
	add();
	add(10,20);
	add(10,20,30);
	add(10,20,30,40);
	add("aa","bb");
	add("aa","bb","cc");

}
}
/*
	rules for using var-args
	------------------------

	1) only one varargs per method.
	2) normal parameters are valid with varargs.
	3) varargs must be always on last position.
	4) varargs methods itself can be overloaded.
	







*/