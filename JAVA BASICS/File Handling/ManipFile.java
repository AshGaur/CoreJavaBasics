import java.io.*;
import java.util.*;
class ManipFile
{
	public static void Entry(String pname,String price,String qt)
	{
		File file=new File("bill.txt");
		String s=null;
		int sn=0;
		String product=null,pprice=null,sno=null,qty=null,amt=null;
		try
		{
			if(!file.exists())
			{
				file.createNewFile();
			}
			
			Scanner sc=new Scanner(file);
			sno=sc.nextLine();
			product=sc.nextLine();
			qty=sc.nextLine();
			pprice=sc.nextLine();
			amt=sc.nextLine();
			sc.close();
			//appending new data to old String variables
			Double d=Double.parseDouble(qt)*Double.parseDouble(price);
			//Getting Serial Numbers
			if(sno.length()>4)
			{
				s=String.valueOf(sno.charAt(sno.length()-2));
				sn=Integer.parseInt(s);
				sn++;
				sno+=(String.valueOf(sn)+",");
			}
			else
			{
				sno=sno+"1,";
			}
			product=product+pname+",";
			qty=qty+qt+",";
			pprice=pprice+price+",";
			amt=amt+String.valueOf(d)+",";
			//Adding new data to bill
			PrintWriter pw=new PrintWriter(file);
			pw.println(sno);
			pw.println(product);
			pw.println(qty);
			pw.println(pprice);
			pw.println(amt);
			pw.close();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Product Name");
		String pname=sc.nextLine();
		System.out.println("Enter Price");
		String price=sc.nextLine();
		System.out.println("Enter Qunatity");
		String qt=sc.nextLine();
		Entry(pname,price,qt);
		ReadFile.ReadBill();
	}
}