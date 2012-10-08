println "Enter your number: "
String s=System.console().readLine()
int num = Integer.parseInt(s)

int m=2
int count =0

while (m<num)
{
   if (num%m==0)
      {
         count ++
      }
      
   m++   
}

if (count>0)

   { 
      println "number is not prime"
   }
   
else println "number is prime"