println "Enter first number: "
String s=System.console().readLine()
println "Enter 2nd number: "
String t=System.console().readLine()

int x=Integer.parseInt(s)
int y=Integer.parseInt(t)
int sum = 0

if (y==1)
   {
     sum = x
   }

else
   {
      while (y!=0)
         {
           sum =sum+x
           y--
         }
   }

println "result is " + sum
