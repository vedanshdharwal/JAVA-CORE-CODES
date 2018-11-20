import java.util.*;

public class CollOne
{
public static void main(String args[])
{
	String e1="one", e2="two", e3="three", e4="four", e5="five", e6="six";
	
	Stack<String> stk=new Stack<String>();
	stk.push(e1); stk.push(e2); stk.push(e3);


	String s=stk.pop();
	System.out.println(s);


	/*
	LinkedList<String> list=new LinkedList<String>();
	list.add(e1);
	list.add(e2);
	list.add(e3);
	System.out.println(list);
	*/

}
}
