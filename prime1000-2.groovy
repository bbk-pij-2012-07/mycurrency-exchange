int x=0
int i=3
int count=0
println "1"

while (x!=999)
{

   for (int m=2; m<i; m++)

      {
       if (i%m==0)
       count++
      } 
   
   if (count==0)
   
     {
      println i
      x++
      }

    i++
    count =0



}
