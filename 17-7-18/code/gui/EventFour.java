import java.awt.*;
import java.awt.event.*;

public class EventFour extends Frame implements WindowListener
{

public void windowOpened(WindowEvent e)
{
	setTitle("Welcome");
}
public void windowClosing(WindowEvent e)
{
	System.exit(0);
}
public void windowClosed(WindowEvent e){}
public void windowIconified(WindowEvent e)
{
	setTitle("Stop");
}
public void windowDeiconified(WindowEvent e)
{
	setTitle("Start");
}
public void windowActivated(WindowEvent e)
{
	setBackground(Color.white);
}
public void windowDeactivated(WindowEvent e)
{
	setBackground(Color.red);
}

public EventFour()
{
	initComponents();
}
public void initComponents()
{
	setLayout(null);
	b1=new Button("Click");
	b1.setBounds(50,100,80,40);
	add(b1);
	addWindowListener(this);
}



public static void main(String args[])
{
	EventFour ob=new EventFour();
	ob.setSize(400,400);
	ob.setVisible(true);

}

TextField t1,t2;
Button b1,b2,b3;
}