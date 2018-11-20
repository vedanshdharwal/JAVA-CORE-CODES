import java.awt.*;
import java.awt.event.*;

public class EventSix extends Frame 
{

public EventSix()
{
	initComponents();
}
public void initComponents()
{
	setLayout(null);
	b1=new Button("Click");
	b1.setBounds(50,100,80,40);
	add(b1);

	b1.addMouseListener(

		new MouseAdapter(){

			public void mouseEntered(MouseEvent e)
			{	
				setTitle("Click Here");
			}
			public void mouseExited(MouseEvent e)
			{
				setTitle("");
			}
		}
	);

	addWindowListener(

		new WindowAdapter(){
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		}
	);








	
}

public static void main(String args[])
{
	EventSix ob=new EventSix();
	ob.setSize(400,400);
	ob.setVisible(true);

}

Button b1;
}