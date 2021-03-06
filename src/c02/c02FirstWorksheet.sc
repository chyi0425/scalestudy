/*
In Scala,an if/else has a value,namely the value of the expression that follows the if or else.For example
if(x>0) 1 else -1
has a value 1 or -1, depending on the value of x.You can put that value in a variable:
val s = if(x>0) 1 else -1
This has the same effect as
if(x>0) s= 1 else s= -1
However,the first from is better because it can used to initialize a val,In the second form,s needs to be a var.
Scala do not have ternary operator like  x>0?1:-1
 */

// Input and Output
print("Answer: ")
println(42)
// yields the same output as
println("Answer: "+42)

/*
You can read a line of input from the console with the readLine method of the
scala.io.StdIn class.
import scala.io
import scala.io.StdIn
val name = StdIn.readLine("Your name: ")
print("Your age: ")
val age = StdIn.readInt()
println(s"Hello,${name}!Next year, you will be ${age +1}.")
 */
