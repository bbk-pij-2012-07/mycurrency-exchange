public class Person
{  
  private int name;
   private int age;

   public Person(int name,int age)
   
   {
       this.name=name;
       this.age=age;
   }

   public int getName()
   {
      return name;
   }
   public int getAge()
   {
      return age;
   }

public static void main (String[] args)

{
Person jason = new Person(22,28);
System.out.println ("Person's name is "+ jason.getName()); 

}
}
