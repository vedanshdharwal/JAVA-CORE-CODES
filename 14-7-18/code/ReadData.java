import java.io.*;

public class ReadData
{
public static void main(String args[]) throws Exception
{
FileInputStream fis=new FileInputStream(args[0]);
BufferedInputStream f=new BufferedInputStream(fis);

System.out.println(f.markSupported());

System.out.println((char)f.read());//A=>B
System.out.println((char)f.read());//B=>C
System.out.println((char)f.read());//C=>D
f.mark(100);//D
System.out.println((char)f.read());//D
System.out.println((char)f.read());//E
System.out.println((char)f.read());//F
System.out.println((char)f.read());//G
f.reset();//D
System.out.println((char)f.read());//D
System.out.println((char)f.read());//E
System.out.println((char)f.read());//F
System.out.println((char)f.read());//G
System.out.println((char)f.read());//H
System.out.println((char)f.read());//I=>J
f.reset();//D
System.out.println((char)f.read());//D
System.out.println((char)f.read());//E
System.out.println((char)f.read());//F








}
}
/*
	mark, reset, markSupported

	
*/