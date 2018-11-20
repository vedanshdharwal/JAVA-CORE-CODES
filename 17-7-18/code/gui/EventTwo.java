import java.awt.*;
import java.awt.event.*;

public class EventTwo extends Frame implements MouseListener
{
public void mousePressed(MouseEvent e)
{
	int x=e.getX();
	int y=e.getY();
	int b=e.getButton();

	setTitle(x+","+y+","+b);
	t1.setText("44535");
}
public void mouseReleased(MouseEvent e)
{
	t1.setText("");
}
public void mouseClicked(MouseEvent e)
{
	int n=e.getClickCount();
	if(n==3)
	{
	System.exit(0);
	}

	
}
public void mouseEntered(MouseEvent e)
{
	int x=e.getX();
	int y=e.getY();
	t2.setText(x+","+y);
	if(x>=45){
	t1.setBackground(Color.yellow);
	}
}
public void mouseExited(MouseEvent e)
{
	t1.setBackground(Color.white);
}

public EventTwo()
{
	initComponents();
}
public void initComponents()
{
	setLayout(new FlowLayout());
	t1=new TextField(10);
	t2=new TextField(10);
	b1=new Button("Copy");
	b2=new Button("Clear");
	b3=new Button("Exit");
	add(t1); add(t2); add(b1); add(b2); add(b3);
	t1.addMouseListener(this);
}



public static void main(String args[])
{
	EventTwo ob=new EventTwo();
	ob.setSize(400,400);
	ob.setVisible(true);

}

TextField t1,t2;
Button b1,b2,b3;
}