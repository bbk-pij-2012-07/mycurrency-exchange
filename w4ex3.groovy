

class Mortgage
{
 int c
 int r
 int years
 
 
     double totalpaid()
     {
     double sum = c * (1 + (r/100))
     return sum
     }
     
     double yearly()
     {
     double yearly = (c * (1 + (r/100)))/years
     return yearly
     }
     
     double remaining()
     {
     
     double sum = totalpaid()
     double remaining =(sum-c)/years
     double remyears = years -remaining
     return remyears

     }
 
} 
 

Mortgage mymorg= new Mortgage() 
println "Enter total amount borrowed: "
String tt = System.console().readLine()
mymorg.c = Integer.parseInt(tt)

println "Enter number of years: "
String yy = System.console().readLine()
mymorg.years = Integer.parseInt(yy)

println "Enter interest rate: "
String xx = System.console().readLine()
mymorg.r = Integer.parseInt(xx)

println "total to be paid is " + mymorg.totalpaid()
println "You will need to pay a yearly amount of £" + mymorg.yearly()
println "You will have the following number of years to pay capital without interest £" + mymorg.remaining()