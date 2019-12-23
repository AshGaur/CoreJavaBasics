//Creating a text file using FileWriter
import java.io.IOException;
import java.io.*;
//import java.io.PrintWriter;
public class WriteFile
{
	public static void main(String args[])
	{
		File file=new File("bill.txt");
		try
		{
			if(!file.exists())
			{
				file.createNewFile();
			}
			//To append file
			//PrintWriter pw=new PrintWriter(new FileWriter(file,true));
			
			//To overwrite file
			PrintWriter pw=new PrintWriter(file);
			pw.print("My first file written\n");
			pw.print("2019\n");
			pw.close();
			System.out.println("Done");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
}