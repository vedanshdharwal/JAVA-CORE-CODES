class Demo
{
private int x,y,z;

public boolean isEquals(Demo d)
{
	if(x==d.x && y==d.y && z==d.z)
	return true;
	else
	return false;
}


public  Demo(int a, int b, int c)
{
	x=a;
	y=b;
	z=c;
}	
public void show()
{
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	System.out.println("________________");
}
public static void  main(String args[])
{

	String s1=new String("indore");
	String s2=new String("indore");

	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));



/*

	Demo d1=new Demo(10,20,30);
	Demo d2=new Demo(10,20,30);
	Demo d3=d1;
	System.out.println(d1==d3);
	System.out.println(d1.isEquals(d3));
	boolean b1=(d1==d2);
	System.out.println(b1);

	boolean b2=d1.isEquals(d2);
	System.out.println(b2);
*/
}
}
/*

	

*/


