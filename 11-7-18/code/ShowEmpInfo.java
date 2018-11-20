import java.io.*;
public class ShowEmpInfo
{
public static void main(String args[]) throws Exception
{
	FileInputStream fis=new FileInputStream("emp.txt");
	DataInputStream dis=new DataInputStream(fis);

	int v1=dis.readInt();
	double v2=dis.readDouble();
	boolean v3=dis.readBoolean();
	
	System.out.println(v1);
	System.out.println(v2);
	System.out.println(v3);

	System.out.println("_________________________");
	v1=dis.readInt();
	v2=dis.readDouble();
	v3=dis.readBoolean();
	
	System.out.println(v1);
	System.out.println(v2);
	System.out.println(v3);





}
}
/*
	DataInputStream (reading the premitive data)
	--------------------------------------------

	byte readByte()
	short readShort()
	int readInt()
	long readLong()
	float readFloat()
	double readDouble()
	boolean readBoolan()





*/