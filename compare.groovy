println "enter first number: "
String a=System.console().readLine()
int 1st=Integer.parseInt(a)
String b=System.console().readLine()
int 2nd=Integer.parseInt(b)
String c=System.console().readLine()
int 3rd=Integer.parseInt(c)
int 1stbig=0
int 2ndbig=0
int 3rdbig=0

If (1st > 2nd)
   {
    if(1st > 3rd)
       {
        if (3rd>2nd)
           {
            1stbig=1st
            2ndbig=3rd
            3rdbig=2nd
       }
    
   }
   
else
   {
      1stbig=2nd
      2ndbig=1st
   }
   
