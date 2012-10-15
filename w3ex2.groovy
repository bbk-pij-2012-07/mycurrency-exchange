println "Enter your equation"
String s = System.console().readLine()
int a=0
int b=0
char sign

for (int i=1; i<s.length(); i++)
{
    
    
    
    
    if ((s.charAt(i)=='+') ||(s.charAt(i)=='-')||(s.charAt(i)=='*')||(s.charAt(i)=='/'))
    {   
        sign = s.charAt(i)
        if (s.charAt(i-1)==' ')
           {
              a=Integer.parseInt(s.substring(0,i-1))
              b=Integer.parseInt(s.substring(i+2))
            }
        else
            {
               a=Integer.parseInt(s.substring(0,i))
               b=Integer.parseInt(s.substring(i+1))
            }
     }
 }
 
println a
println b
println sign
 

switch (sign){

case '+':
println (a+b)
break;

case '-':
println  (a-b)
break;

case '*':
println  (a*b)
break;

case '/':
println  (a/b)
break;
}
    
    