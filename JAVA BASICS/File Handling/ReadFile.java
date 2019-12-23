import java.io.*;
import java.util.Scanner;
class ReadFile
{
	public static void ReadBill()
	{
		System.out.println("---------Bill----------");
		File file=new File("bill.txt");
		try
		{
			if(!file.exists())
			{
				file.createNewFile();
			}
			Scanner sc=new Scanner(file);
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String args[])
	{
		File file=new File("bill.txt");
		try
		{
			if(!file.exists())
			{
				file.createNewFile();
			}
			Scanner sc=new Scanner(file);
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}