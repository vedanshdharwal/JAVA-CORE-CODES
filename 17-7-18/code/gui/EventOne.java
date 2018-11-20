import java.awt.*;
import java.awt.event.*;

public class EventOne extends Frame implements ActionListener, TextListener, FocusListener, ItemListener, KeyListener
{
public void keyPressed(KeyEvent e)
{
	int code=e.getKeyCode();
	System.out.println(code);
	if(code==KeyEvent.VK_F1)
	{
		String s1=t1.getText();
		String s2=s1.toUpperCase();
		t1.setText(s2);
	}
	else if(code==KeyEvent.VK_F2)
	{
		t1.setText(t1.getText().toLowerCase());
	}
	else if(code==KeyEvent.VK_ESCAPE)
	{
		t1.setText("");
	}

}
public void keyReleased(KeyEvent e){}
public void keyTyped(KeyEvent e)
{
	char ch=e.getKeyChar();
	if(ch=='x')
	{
	System.exit(0);
	}

}

public void itemStateChanged(ItemEvent e)
{
	if(e.getSource()==ch)
	{
	String s=ch.getSelectedItem();
	if(s.equals("black"))
	{
		t1.setForeground(Color.black);
	}
	else if(s.equals("red"))
	{
		t1.setForeground(Color.red);
	}
	else if(s.equals("green"))
	{
		t1.setForeground(Color.green);
	}
	else if(s.equals("blue"))
	{
		t1.setForeground(Color.blue);
	}
	}
	else if(e.getSource()==c1)
	{
		boolean b=c1.getState();
		ch.setEnabled(b);
	}
}
public void focusGained(FocusEvent e)
{
	if(e.getSource()==t1)
	{
		t1.setBackground(Color.pink);
	}
	else if(e.getSource()==t2)
	{
		t2.setBackground(Color.pink);
	}
	else if(e.getSource()==b2)
	{
		b3.setEnabled(true);
	}

}
public void focusLost(FocusEvent e)
{
	if(e.getSource()==t1)
	{
		t1.setBackground(Color.white);
	}
	else if(e.getSource()==t2)
	{
		t2.setBackground(Color.white);
	}

}


public void textValueChanged(TextEvent e)
{
	t2.setText(t1.getText());
}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==b1)
	{
	String s=t1.getText();
	t2.setText(s);
	}
	else if(e.getSource()==b2)
	{
	t1.setText(""); t2.setText("");
	}
	else if(e.getSource()==b3)
	{
	System.exit(0);
	}
}
public EventOne()
{
	initComponents();
}
public void initComponents()
{
	setLayout(new FlowLayout());
	c1=new Checkbox("allow");
	c1.setState(true);
	add(c1);
	ch=new Choice();
	ch.add("black");
	ch.add("red");
	ch.add("green");
	ch.add("blue");
	add(ch);
	t1=new TextField(10);
	t2=new TextField(10);
	b1=new Button("Copy");
	b2=new Button("Clear");
	b3=new Button("Exit");
	add(t1); add(t2); add(b1); add(b2); add(b3);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	t1.addTextListener(this);
	t1.addFocusListener(this);
	t2.addFocusListener(this);
	b3.setEnabled(false);
	b2.addFocusListener(this);
	ch.addItemListener(this);
	c1.addItemListener(this);
	t1.addKeyListener(this);
}



public static void main(String args[])
{
	EventOne ob=new EventOne();
	ob.setSize(400,400);
	ob.setVisible(true);

}

TextField t1,t2;
Button b1,b2,b3;
Choice ch;
Checkbox c1;
}