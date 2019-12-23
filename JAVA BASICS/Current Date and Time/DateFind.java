import java.util.*;
class DateFind
{
	public static void main(String args[])
	{
		Date n=new Date();
		int y=n.getYear()%100;
		int m=n.getMonth() + 1;
		int d=n.getDate();
		System.out.println(d+"/"+m+"/"+y);
	}
}