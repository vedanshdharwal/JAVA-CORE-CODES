public class OperOne
{

public String toString()
{
	return "INDIA";
}



public static void main (String args[])
{

	String s1="indore";
	String s2="indore";
	

	System.out.println(s1);
	System.out.println(s2);

	System.out.println(s1==s2);





/*

	String s="indore";

	OperOne ob1=new OperOne();
	OperOne ob2=new OperOne();

	//String r=s+ob1;
	//String r=s+ob1.toString();

	String r=ob1+ob2+s;



	System.out.println(r);


	System.out.println(ob1);
	System.out.println(ob1.toString());
*/

}

}

/*
	toString method will be implicitly called on
	an object :

	1) when you an object to a String.

	2) when you print the object using sop.




	if the concerned class is having its own toString
	then its own toString will be called.
	other wise,
	toString from Object class will be invoked.











*/





