import java.io.File;
import java.io.IOException;
public class FileInfo
{
public static void main(String args[]) throws IOException
{
	File f=new File(args[0]);

	boolean b=f.createNewFile();

	if(b)
	{
	System.out.println("Operation Success");
	}
	else
	{
	System.out.println("Operation Failed");
	}
}
}
/*
	Method (non-static)
	boolean delete()
	boolean mkdir()
	boolean renameTo(File)
	boolean createNewFile()


	long lastModified()
	boolean canWrite()
	boolean isHidden()
	long length()
	boolean exists()
	boolean isFile()
	boolean isDirectory()
	String[] list()



--------------------------------------------------------
	File(String)
	File(String,String)	
*/