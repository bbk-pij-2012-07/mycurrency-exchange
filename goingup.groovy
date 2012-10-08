boolean finished = false
int store=0
String result="Yes"

while (!finished)
{
 String s=System.console().readLine()
 int x=Integer.parseInt(s)
 if (x==-1)
 {
 finished=true
 }
 else
 if (x>store)
 {
 store=x

 }
 else result ="No"
}

print result