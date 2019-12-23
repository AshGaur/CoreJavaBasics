import java.io.*;
class CheckBillWIthID
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
				PrintWriter pw=new PrintWriter(file);
				pw.println("PID:");
				pw.println("Sno:");
				pw.println("Pname:");
				pw.println("Qty:");
				pw.println("Price:");
				pw.println("Amount:");
				pw.close();
				System.out.println("File Initials Written");	
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}			
	}
}