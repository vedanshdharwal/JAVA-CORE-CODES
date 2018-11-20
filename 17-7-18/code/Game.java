public class Game implements java.io.Serializable
{
	private int xPos;
	private transient int yPos; //you dont want to save it with object

	public void moveH(int pts)
	{
		xPos=xPos+pts;
	}
	public void moveV(int pts)
	{
		yPos=yPos+pts;
	}
	public void showPos()
	{
	System.out.println("Current Pos : "+xPos+","+yPos);
	}

}