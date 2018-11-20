import java.util.StringTokenizer;
class STDemo 
{
public static void  main(String args[])
{
String s="indore;mumbai,bhopal";

	StringTokenizer st=new StringTokenizer(s, ",;", true);
	System.out.println(st.countTokens());
	while(st.hasMoreTokens())
	{
	System.out.println(st.nextToken());
	}

}
}
/*
	StringTokenizer(String)
	StringTokenizer(String,String)
	StringTokenizer(String,String,boolean)

	String nextToken()
	boolean hasMoreTokens()
	int countTokens()

	use to break a string in multiple tokens(parts)
	using some delimeter(s).

*/
