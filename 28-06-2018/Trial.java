public class Trial
{
private int x, y;

public Trial(int a, int b)
{
	x=a;y=b;
}
public void show()
{
	System.out.println(x+","+y);
}
public static void main(String args[])
{
	Trial t1;
	new Trial(10,20);
	Trial t2=new Trial(30,40);
	Trial t3=t2;
	t1=t2;

	t1.show();
	t2.show();
	t3.show();
	System.out.println("_______________________________");
	t2=new Trial(50,60);
	t1.show();
	t2.show();
	t3.show();
	System.out.println("_______________________________");
	t3=t2;
	t1.show();
	t2.show();
	t3.show();
	System.out.println("_______________________________");















}
}