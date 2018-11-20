public class FinalDemo
{
	int x,y;
	
	public FinalDemo(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	public void disp()
	{
		System.out.println(x+","+y);
	}
	public static void main(String args[])
	{
		final FinalDemo ob=new FinalDemo(10,20);
		ob.disp();
		ob=new FinalDemo(15,25);
		ob.disp();
	}
}