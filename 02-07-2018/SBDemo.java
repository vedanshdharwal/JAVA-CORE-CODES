class SBDemo 
{
public static void  main(String args[])
{
	String s1=new String("indore");
	StringBuffer s2=new StringBuffer("indore");
	String s3=s2.toString();
	boolean b=s1.equals(s3);
	System.out.println(b);
	
}
}
/*
	Methods(non-static)
	----------------------
	append,insert,replace,setCharAt,setLength,
	deleteCharAt,delete,reverse,toString
	


	
	StringBuffer
	-------------
	StringBuffer(String)	
*/
