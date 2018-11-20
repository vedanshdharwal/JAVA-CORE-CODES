import java.awt.*;
import java.awt.event.*;

public class EventFive extends Frame 
{

	class MyMouseHandler extends MouseAdapter
	{
		public void mouseEntered(MouseEvent e)
		{
			setTitle("Click to save data");
		}
		public void mouseExited(MouseEvent e)
		{
			setTitle("");
		}
	}

	class FrameCloser extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
		System.exit(0);
		}
	}

public EventFive()
{
	initComponents();
}
public void initComponents()
{
	setLayout(null);
	b1=new Button("Click");
	b1.setBounds(50,100,80,40);
	add(b1);
	addWindowListener(new FrameCloser());
	b1.addMouseListener(new MyMouseHandler());
}



public static void main(String args[])
{
	EventFive ob=new EventFive();
	ob.setSize(400,400);
	ob.setVisible(true);

}

Button b1;
}