public class Matrix
{
	private int[][]a;


	public Matrix(int x, int y)
	{
	  a = new int[x][y];
	  for (int i=0; i<x;i++)
	  {
	      for(int z=0; z<y;z++)
	      {
			  a[i][z]=1;
	      }
	  }
    }

    public void setElement (int x, int y, int z)
    {
		if (x>a.length || y>a[0].length)
		{
			break;

	    }

	   else

	   {
		   a[x][y]=z;
       }
    }

    public void setRow (int x, String s)
    {
      if (x>a.length)
      {
		  break;
	  }

	  for (i=0; i<s.length;i++)
	  {
		  if (s.charAt(i))


    }


