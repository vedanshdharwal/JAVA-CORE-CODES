import java.io.*;

public class ReadData
{
public static void main(String args[]) throws Exception
{
	FileInputStream fis=new FileInputStream(args[0]);
	while(true)
	{
	int n=fis.read();
	if(n==-1)break;
	System.out.print((char)n);
	}

}
}
/*
	InputStream
	--------------

	int read()	//one by one bytes read



*/