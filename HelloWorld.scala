import scala.io.StdIn.readLine

object HelloWorld {

  def main(args: Array[String]) = {
    println("Please enter your name:")
    val name = readLine()

    println("Hello, " + name + "!")
  }

} 