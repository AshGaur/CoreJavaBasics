class Grade
{
	int grade=0;
	public Grade(int marks[])
	{
		for(int i=0;i<marks.length;i++)
		{
			grade=grade+marks[i];
		}
	}
	public boolean equals(Grade o)
	{
		Grade g=o;
		if(grade==g.grade)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
class TestEquals
{
	public static void main(String args[])
	{
		Grade g=new Grade(new int[]{80,85,91,86,82});
		Grade g1=new Grade(new int[]{90,70,89,78,92});
		if(g.equals(g1))
		{
			System.out.println("Grades are same");
		}
		else
		{
			System.out.println("Grades are not same");
		}
	}
}