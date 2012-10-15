println "Please enter your 1st number"
String s = System.console().readLine()
int a= Integer.parseInt(s)
println "Please enter your 2nd number"
String x= System.console().readLine()
int b= Integer.parseInt(x)
println "Please select from one of the following four operations"
println "+"
println "-"
println "*"
println "/"
char choice = System.console().readLine()





switch (choice){

case '+':
println a + " + " + b + " = " + (a+b)
break;

case '-':
println a + " - " + b + " = " + (a-b)
break;

case '*':
println a + " * " + b + " = " + (a*b)
break;

case '/':
println a + " / " + b + " = " + (a/b)
break;
}