int numberToGuess = Math.abs(1000 * Math.random())

int inputnum
int guesses = 0

while (inputnum!=numberToGuess)

   {
    
    println "Try to guess my number!"
    String str = System.console().readLine()
    inputnum = Integer.parseInt(str)
    guesses++
    if (inputnum>numberToGuess)
       {
         println "No! My number is lower"
       }
    else if (inputnum<numberToGuess)
   {
   println "No! My number is higher"
    }
   
   
    }
   
    println "Correct!"
    println "Your needed " + guesses + " guesses"
