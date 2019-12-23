import java.io.*;
import java.util.*;
class NotATxt
{
	public static void main(String args[])
	{
		File file=new File("ids"); //file creation without file extension
		try
		{
			if(!file.exists())
			{
				file.createNewFile();
			}
			PrintWriter out=new PrintWriter(file);
			for(int i=0;i<10;i++)
			{
				out.println("i="+i);
			}
			out.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}