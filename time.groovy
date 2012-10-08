int hour,minute
String s
print "enter time: "
s = System.console().readLine()
if (s.length()==3)
{
hour = Integer.parseInt(s.substring(0,1))
minute = Integer.parseInt (s.substring(1))
}
else
{
hour = Integer.parseInt(s.substring(0,2))
minute = Integer.parseInt (s.substring(2))
}

if (hour > 23) 
{print "?"}
else if (hour < 0) 
{print "?"}
else if (minute > 60)
{print "?"}
else if (minute <0)
{print "?"}
else if (hour >11)
{ print "Good afternoon"}
else if (hour <11)
{ print "Good morning"}