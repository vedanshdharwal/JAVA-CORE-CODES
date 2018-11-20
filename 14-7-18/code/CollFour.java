import java.util.*;
public class CollFour
{
public static void main(String args[])
{
	Student s1=new Student(111,"AAA","CS",3);
	Student s2=new Student(112,"BBB","IT",2);
	Student s3=new Student(113,"CCC","CS",3);
	Student s4=new Student(114,"DDD","IT",4);
	Student s5=new Student(115,"EEE","CS",5);

	HashMap<String,Student> map=new HashMap<String,Student>();
	map.put("111",s1);	map.put("112",s2);
	map.put("113",s3);	map.put("114",s4);
	map.put("115",s5);	
	//Student s=map.get(args[0]);
	//System.out.println(s);

	System.out.println(map);
	//map.remove("114");
	map.clear();
	System.out.println(map);
}
}
/*
	size, isEmpty, put, get, 
	containsKey, containsValue, 
	putAll, remove

	m1	(k1,v1) (k2,v2)
	m2	(k3,v3) (k4,v4)

	m2.putAll(m1);


	m1	(k1,v1) (k2,v2)
	m2	(k3,v3) (k4,v4)(k1,v1) (k2,v2)










*/