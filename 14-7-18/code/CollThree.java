import java.util.*;
public class CollThree
{
public static void main(String args[])
{
	Student s1=new Student(111,"AAA","CS",3);
	Student s2=new Student(112,"BBB","IT",2);
	Student s3=new Student(113,"CCC","CS",3);
	Student s4=new Student(114,"DDD","IT",4);
	Student s5=new Student(115,"EEE","CS",5);

	ArrayList<Student> list=new ArrayList<Student>();
	list.add(s1); list.add(s2); 
	list.add(s3); list.add(s4);
	list.add(s5);

	int n=Integer.parseInt(args[0]);

	for(Student s:list)
	{
		if(s.rno==n)
		{
		System.out.println(s);
		break;
		}		
	}


	
}
}