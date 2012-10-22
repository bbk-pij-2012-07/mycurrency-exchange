class Conversion

{
String s
int x


void binary2decimal()
   {
    int xxx=0
    int sum=0
    for (int i=(s.length()-1); i<=0; i--)
       {
        int m= Integer.parseInt(s.charAt(xxx))
        sum = sum + (m * (2git i))
        xxx++
       }
    println "Your decimal number is "+ sum
   }
   
   
void decimal2binary()
   {
   
   
   }

}
Conversion test = new Conversion()
println "Choose the function you wish to run.."
println "1. Binary to Decimal conversion"
println "2. Decimal to Binary converesion"
String choice=System.console().readLine()

if (choice == "1")
   {
             println "enter your binary number"
             
             test.s= System.console().readLine()
             test.binary2decimal()
}
else 
{           
             println "enter your decimal number"
             string xx= System.console().readLine()
             test.x= Integer.ParseInt()
             test.decimal2binary()
             
}
   