import java.io.*;
public class WriteData
{
public static void main(String args[]) throws Exception
{
FileOutputStream fos=new FileOutputStream(args[0], false);

String s="this is some text stored to a file using java code";
byte b[]=s.getBytes();
fos.write(b,0,10);
fos.close();

System.out.println("Data Stored Successfully");

}
}
/*
	FileOutputStream(String)
	FileOutputStream(String,boolean)


	one arg constructor will always override
	the contents of an existing file.


	two arg constructor will accept a boolean
	value in second parameter

	true value will append the contents of exisiting file
	false value will override the contents of existring file





	


	OutputStream
	--------------------------
	void write(int)
	void write(byte[])
	void write(byte[],int,int)
	void close()
*/