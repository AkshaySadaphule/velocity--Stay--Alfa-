package kunalAssignments;

public class ForLoop {

	public static void main(String[] args) 
	{
		int i , j , table;
		for(i = 1; i<=10 ; i++)
		{
			for (j=1 ; j<=5; j++ )
			{
				table = i * j;
				System.out.print("  "+table);
			}
			System.out.println();
			System.out.println("Kunal modify something");
		}

	}

}
