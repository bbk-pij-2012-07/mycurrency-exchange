println "Enter your text"
String str = System.console().readLine()
int count = 0

for (i=0; i<str.length(); i++)
   {
      if (str.charAt(i)=='e')
         {
          count ++
          }
          
    }
    
println "You have " + count + " Es"