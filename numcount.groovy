
/**
 * Created with IntelliJ IDEA.
 * User: hesho
 * Date: 07/10/2012
 * Time: 17:01
 * To change this template use File | Settings | File Templates.
 */

boolean finished= false
int pos=0
int neg=0
int zero=0
println ("enter your numbers")
while (!finished)
{
    String input = System.console().readLine()
    int num = Integer.parseInt(input)
   if (num > 0)
    {
             pos= pos+1
    }
    else if (num <0)
    {
        neg=neg+1
    }
    else if (num ==0)
    {
        zero=zero+1
    }
    else finished = true
}

String result = "Your total is: " + pos + " positive numbers and " + neg + " negative numbers and " + zero + " zeros"
println result
