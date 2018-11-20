class SDemo 
{
	public static void show(String s)
	{
		System.out.println(s);
	}


	public static void  main(String args[])
	{
		char ch[]={'a','b','c','d','e','f','g','h','i','j'};	
		byte b[]={65,66,67,68,69,70,71,72,73,74,75,76};
		String s1=new String("indore");
		String s2=new String(ch);
		String s3=new String(ch,3,3);
		String s4=new String(b);
		String s5=new String(b,1,3);
		String s6=new String();
		show(s1);
		show(s2);
		show(s3);
		show(s4);
		show(s5);
		show(s6);
	}
}
/*
	String class is in java.lang package
	its a final class
	String objects are always immutable.
	-----------------------------------------------------
	Constructors
	--------------------
	String()
	String(String)
	String(char[])
	String(char[],int,int)
	String(byte[])
	String(byte[],int,int)





	
*/
