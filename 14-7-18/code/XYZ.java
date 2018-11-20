public class Xyz
{
	private int x;
	private int y;

	public void change()
	{
	x++;y++;
	}
	public Xyz(int x, int y)
	{
		this.x=x; this.y=y;
	}
	public void disp()
	{
		System.out.println(x+","+y);
	}
}