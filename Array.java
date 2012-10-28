public class Array {

	public static void main(String args[])
	{
		int id [];
		id = new int[10];
		String name[];
		name = new String [10];
		for (int i=0; i<10;i++)
		   {
			System.out.println("Enter name of employee");
			name[i]=System.console().readLine();
			System.out.println("Enter ID of employee");
			String idname = System.console().readLine();
			id[i]=Integer.parseInt(idname);
		   }
		
		System.out.println("All employees details are now inputted");
		System.out.println("Here's a list of employees whose ID is less than 1000");
		
		for (int i=0; i<10;i++)
		{
			if (id[i]<1000)
			{
				System.out.println ("Employee " + name[i] + "ID " + id[i]);	
			}
		}
		
		System.out.println(" ");
		System.out.println("Here's a list of employees whose name starts with a J or S");
		
		for (int i=0; i<10;i++)
		{
			if (name[i].charAt(0)=='J' ||name[i].charAt(0)=='S')
			{
				System.out.println ("Employee " + name[i] + "ID " + id[i]);	
			}
		}
		
	}
	
	
	
	
}

