public class Calculator
{
   private int x;
   private int y;

   public int add(int x, int y)
   {
      this.x=x;
      this.y=y;
      return (x+y);
   }

   public int subtract(int x, int y)
   {
      this.x=x;
      this.y=y;
      return (x-y);
   }
   public int multiply(int x,int y)
   {
      this.x=x;
      this.y=y;
      return (x*y);
   }
   public double divide(int x,int y)
   {
      this.x=y;
      this.y=y;
      double z= (x/y);
   }

 public static void main(String[] args)
    {
	 System.out.println ("Enter your first number");
	 String s= System.console().readLine();
	 int xx=Integer.parseInt(s);

	 System.out.println ("Enter your first number");
	 String ss= System.console().readLine();
	 int yy=Integer.parseInt(s);

     System.out.println (xx +" plus " + yy + " = " + add(xx,yy));
     System.out.println (xx +" subtracted " + yy + " = " + subtract(xx,yy));
     System.out.println (xx +" multiply " + yy + " = " + multiply(xx,yy));
     System.out.println (xx +" divided " + yy + " = " + divide(xx,yy));
    }

}