import java.util.*;
public class StudInfo
{
public static void main(String args[])
{
	Student s1=new Student(111,"AAA","CS",3);
	Student s2=new Student(112,"BBB","IT",2);
	Student s3=new Student(113,"CCC","CS",3);
	Student s4=new Student(114,"DDD","IT",4);
	Student s5=new Student(115,"EEE","CS",5);
	
	LinkedList<Student> cs=new LinkedList<Student>();
	LinkedList<Student> it=new LinkedList<Student>();
	cs.add(s1); cs.add(s3); cs.add(s5);
	it.add(s2); it.add(s4);


	LinkedList<LinkedList<Student>> allstud=new LinkedList<LinkedList<Student>>();
	allstud.add(cs);
	allstud.add(it);


	for(LinkedList<Student> list:allstud)
	{
		for(Student s:list)
		{
			System.out.println(s);
		}

	}
	







/*
	Stack<LinkedList<Student>> stk=new Stack<LinkedList<Student>>();
	stk.push(cs);
	stk.push(it);

	LinkedList<Student> list=stk.pop();

	for(Student s:list)
	{
		System.out.println(s);
	}

	System.out.println("________________");

	list=stk.pop();

	for(Student s:list)
	{
		System.out.println(s);
	}

*/
}
}