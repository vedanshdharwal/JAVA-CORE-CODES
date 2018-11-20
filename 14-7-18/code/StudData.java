import java.util.*;
public class StudData
{
public static void main(String args[])
{
	Student s1=new Student(111,"AAA","CS",3);
	Student s2=new Student(112,"BBB","IT",2);
	Student s3=new Student(113,"CCC","CS",3);
	Student s4=new Student(114,"DDD","IT",4);
	Student s5=new Student(115,"EEE","CS",5);

	LinkedList<Student> list=new LinkedList<>();
	list.add(s1); list.add(s2); 
	list.add(s3); list.add(s4); list.add(s5);


	for(Student s:list)
	{
		System.out.println(s);
	}




/*
	Stack<Student> stk=new Stack<Student>();
	stk.push(s1); stk.push(s2); 
	stk.push(s3); stk.push(s4);
	stk.push(s5);
	Student s=stk.pop();
	System.out.println(s);
	s=stk.pop();
	System.out.println(s);

*/
}
}