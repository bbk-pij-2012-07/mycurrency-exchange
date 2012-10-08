boolean finished = false
int store=0
String result="Yes"
count =0
int y=0

while (!finished)
{
    String s=System.console().readLine()
    int x=Integer.parseInt(s)
    if (x==-1)
       {
          finished=true
       }
    else
    if (count==0)
       { 
          y==x
          count++
       }
    else
    if (x>y)
       {
          y==x
       }
    else if ((x<y) || (x==y))
    {result="No"}
 
}

print result