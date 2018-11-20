import java.util.*;

public class CollTwo
{
public static void main(String args[])
{
String e1="one",e2="two",e3="three",e4="four",e5="five",e6="six";
ArrayList<String> list1=new ArrayList<String>();
list1.add(e1); list1.add(e2); list1.add(e3);
System.out.println(list1);
int n=list1.indexOf(e4);
System.out.println(n);



/*
Iterator it=list1.iterator();

while(it.hasNext())
{
System.out.println(it.next());
}
*/

/*
Object ar[]=list1.toArray();
for(Object obj:ar)
{
	System.out.println(obj);
}
*/




}
}
