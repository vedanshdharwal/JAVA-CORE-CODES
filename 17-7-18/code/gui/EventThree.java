import java.awt.*;
import java.awt.event.*;

public class EventThree extends Frame implements MouseMotionListener
{

public void mouseMoved(MouseEvent e)
{
	int x=e.getX(); int y=e.getY();
	setTitle("Moving @ "+x+","+y);
}
public void mouseDragged(MouseEvent e)
{
	int x=e.getX(); int y=e.getY();
	setTitle("Dragging @ "+x+","+y);
	b1.setLocation(x,y);
}


public EventThree()
{
	initComponents();
}
public void initComponents()
{
	setLayout(null);
	b1=new Button("Click");
	b1.setBounds(50,100,80,40);
	add(b1);
	addMouseMotionListener(this);
}



public static void main(String args[])
{
	EventThree ob=new EventThree();
	ob.setSize(400,400);
	ob.setVisible(true);

}

TextField t1,t2;
Button b1,b2,b3;
}