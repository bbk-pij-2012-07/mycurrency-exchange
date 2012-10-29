public class Calculator
{




   public int add(int x, int y)
   {
	 System.out.println("x=" + x + ", y=" + y + ", x+y=" + (x+y));
      return (x+y);
   }

   public int subtract(int x, int y)
   {

      return (x-y);
   }
   public int multiply(int x,int y)
   {

      return (x*y);
   }
   public double divide(int x,int y)
   {

      double z= (double)(x/y);
      return z;
   }

 public static void main(String[] args)
    {

	 System.out.println ("Enter your first number");
	 String s= System.console().readLine();
	 int xx=Integer.parseInt(s);

	 System.out.println ("Enter your first number");
	 String ss= System.console().readLine();
	 int yy=Integer.parseInt(ss);

     Calculator newone = new Calculator();
     System.out.println ("Addition " + newone.add(xx,yy));
     System.out.println ("Subtraction " +newone.subtract(xx,yy));
     System.out.println ("Multiplication " + newone.multiply(xx,yy));
     System.out.println ("Division " + newone.divide(xx,yy));

    }

}