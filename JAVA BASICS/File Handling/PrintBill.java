import java.io.*;
import java.util.*;
class PrintBill
{	
	public static String[] getStrings(String str)
	{
		int start=0,comma=0,i=0,end=0;
		while(i<str.length())
		{
			if(str.charAt(i)==':')
			{
				start=i+1;
			}
			if(str.charAt(i)==',')
			{
				comma++;
			}
			i++;
		}
		String arr[]=new String[comma];
		System.out.println("str="+str);
		System.out.println("start="+start);
		System.out.println("comma="+comma);
		i=0;
		while(start<str.length()-1)
			{
			end=getEnd(start,str);
			arr[i++]=str.substring(start,end);
			start=end+1;
			}
			return arr;
	}
	public static int getEnd(int start,String str)
	{	
		int end=0;
		for(int i=start;i<str.length();i++)
		{
			if(str.charAt(i)==',')
			{
				end=i;
				break;
			}
		}
		return end;
	}
	
	public static void main(String args[])
	{
		String sno=null,pname=null,qty=null,price=null,amt=null;
		File file=new File("bill.txt");
		try
		{
			if(!file.exists())
			{
				file.createNewFile();
			}
			Scanner sc=new Scanner(file);
			sno=sc.nextLine();
			pname=sc.nextLine();
			qty=sc.nextLine();
			price=sc.nextLine();
			amt=sc.nextLine();
			sc.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
			//Get All strings separated
			String sn[]=getStrings(sno);
			String pn[]=getStrings(pname);
			String qt[]=getStrings(qty);
			String pr[]=getStrings(price);
			String am[]=getStrings(amt);
			System.out.println("Sno.   Pname       Qty    Price    Amount");
			for(int i=0;i<sn.length;i++)
			{
				System.out.println(sn[i]+"   "+pn[i]+"       "+qt[i]+"    "+pr[i]+"    "+am[i]);
			}
	}
}