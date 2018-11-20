import java.io.*;
public class StoreEmpInfo
{
public static void main(String args[]) throws Exception
{
	int eno1=5001, eno2=5002;
	double sal1=54000.55, sal2=65450.65;
	boolean ms1=true, ms2=false;

	FileOutputStream fos=new FileOutputStream("emp.txt");
	DataOutputStream dos=new DataOutputStream(fos);
	dos.writeInt(eno1);
	dos.writeDouble(sal1);
	dos.writeBoolean(ms1);
	dos.writeInt(eno2);
	dos.writeDouble(sal2);
	dos.writeBoolean(ms2);
	dos.close();
	fos.close();
	System.out.println("Data Stored");




}
}
/*
	DataOutputStream
	(stream given for writing the premitive values).
	------------------------------------------------

	void writeByte(byte)
	void writeShort(short)
	void writeInt(int)
	void writeLong(long)
	void writeFloat(float)
	void writeDouble(double)
	void writeBoolean(boolean)










*/