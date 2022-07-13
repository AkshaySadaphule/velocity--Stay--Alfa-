package kunalAssignments;

public class RevNum
{

	public static void main (String[]args) 
	{
		int num= 123;
		String strnum = Integer.toString(num);
		String revnum = "";
		
		for(int i =strnum.length()-1; i>=0 ;i--) 
		{
			
			revnum=revnum+strnum.charAt(i);
		}
		
	//	int s = Integer.parseInt(revnum);
		
		System.out.println("original num ="+num);
		System.out.println("Reverse num ="+revnum);
	} 
}
