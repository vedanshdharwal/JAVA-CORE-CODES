import java.awt.*;

public class FirstGUI
{
public static void main(String args[])
{
	//step-1 (create a container)
	Frame f=new Frame();
	f.setSize(400,400);
	f.setVisible(true);

	//step-2 (create components)
	
	Label l1=new Label("Name");
	Label l2=new Label("Age");
	TextField t1=new TextField(10);
	TextField t2=new TextField(10);
	Button b1=new Button("Save");

	//step-3 (add the components on container)

	f.setLayout(new FlowLayout());	

	f.add(l1); f.add(t1); 
	f.add(l2); f.add(t2);	f.add(b1);



}
}