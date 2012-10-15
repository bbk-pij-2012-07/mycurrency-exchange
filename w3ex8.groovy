println "Enter your word"
String s=System.console().readLine()
int slen=s.length()-1
int count =0
for (i=0; i<slen; i++)
   {
     if (s.charAt(i)!=s.charAt(slen))
     count ++
     else slen --
     
   }
   
if (count==0)
   {
      println "palindrom is true"
      
   }
   
else println "Not a palindrom"