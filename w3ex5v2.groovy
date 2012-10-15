println "Enter your text"
String str = System.console().readLine()
int count = 0
println "Enter a letter to count"
char s = System.console().readLine()
for (i=0; i<str.length(); i++)
   {
      if (str.charAt(i)==s)
         {
          count ++
          }
          
    }
    
println "You have " + count + " " + s 