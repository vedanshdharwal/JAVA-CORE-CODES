//working on IDE pattern

import java.awt.*;

public class ForthGUI extends Frame
{
public ForthGUI()
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
	add(t1); add(t2); add(b1); add(b2);
}



public static void main(String args[])
{
	ForthGUI ob=new ForthGUI();
	ob.setSize(400,400);
	ob.setVisible(true);

}

TextField t1,t2;
Button b1,b2;

}