import java.io.*;
public class PlayGame
{
public static void main(String args[]) throws Exception
{
	int ch=Integer.parseInt(args[0]);//choice 1 for new 2 for prev game
	int x=Integer.parseInt(args[1]); //pts to move hor.
	int y=Integer.parseInt(args[2]); //pts to move ver.

	Game g=null;

	switch(ch)
	{
	case 1://new game
		g=new Game();
	break;
	case 2://prev game
	
		File f=new File("lastgame.txt");
		FileInputStream fis=new FileInputStream("lastgame.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		g=(Game)ois.readObject();
		ois.close();
		fis.close();		
	break;
	}

	g.moveH(x);
	g.moveV(y);
	g.showPos();

	//saving the current game to a file

	FileOutputStream fos=new FileOutputStream("lastgame.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(g);
	oos.close();
	fos.close();	
	System.out.println("Game Stored...!!");
	System.out.println("Closing Game.....!!");




}
}