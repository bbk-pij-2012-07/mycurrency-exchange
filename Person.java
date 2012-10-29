public class Person
{
  private String name;
   private int age;

   public Person(String name,int age)

   {
       this.name=name;
       this.age=age;
   }

   public String getName()
   {
      return name;
   }
   public int getAge()
   {
      return age;
   }

public static void main (String[] args)

{
Person student101 = new Person("John",28);
System.out.println ("Person's name is "+ student101.getName());

}
}
