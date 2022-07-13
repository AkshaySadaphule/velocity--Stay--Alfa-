package kunalAssignments;

public class Result 
{
	int marks;
	public Result(int Marks) 
	{
		marks = Marks;
	}
	
	public void arrangement(int seatNo) 
	{
		Details d = new Details("Karmaveer bhaurao patil collage of engg satara");	
		d.display("Anita");
		
		System.out.println("Seat no is = "+seatNo );
		
		System.out.println("Marks = " +marks);
		
		if(marks >= 70 ) 
		{
			System.out.println("You got the distinction");
		}
		else if (marks>=60 & marks < 70) 
		{
			System.out.println(" You got the first class");
		}
		else if (marks>=50 & marks<60) 
		{
			System.out.println("You got the second class");
		}
		else 
		{
			System.out.println("You are failed ");
		}
		
		
	}

}
