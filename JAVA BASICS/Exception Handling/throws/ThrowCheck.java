import java.io.*;
class ThrowCheck 
{
	public static void main(String args[])//throws IOException
	{
		String str="";
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter text");
		while(!str.equals("quit"))
		{
			str=br.readLine();
		}
		System.out.println("Your input:"+str);
	}
}