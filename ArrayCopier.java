public class ArrayCopier
{

  public void copy(int[] src,int[] des)
  {
    if (src.length>des.length)
    {
		System.out.println("Source is larger, destination array is ");
		for(int i=0; i<des.length;i++)
		{
			des[i]=src[i];
			System.out.println (des[i]);

	    }

    }
	if (src.length<des.length)
	    {
			int z=0;
			System.out.println("Destination is larger, destination array is ");
			for(int i=0; i<src.length;i++)
			{
				des[i]=src[i];
				System.out.println (des[i]);
				z++;

		    }

		    for(int i=z; i<des.length;i++)
		    {
				des[i]=0;
				System.out.println (des[i]);

		    }


	    }
   if (src.length==des.length)
    {
   		System.out.println("Source is equal to destination, destination array is ");
   		for(int i=0; i<des.length;i++)
   		{
   			des[i]=src[i];
   			System.out.println (des[i]);


   	    }

    }

 }



public static void main (String[] args)
  {
	ArrayCopier week5 = new ArrayCopier();
	int[] x={1,2,3,4,5,6};
	int[] y;
	y = new int[9];
	week5.copy(x,y);

  }


}