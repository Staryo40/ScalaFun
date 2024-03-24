// Different ways to make variables

object VarP {
    def main (args: Array[String]) {
        // To make variable in scala: "var VarName : DataType = Value" 
        val myVal: String = "This keyword is immutable"
        var myVar: String = "This keyword is mutable"

        // Variable Type Inference
        var inferType = "This will be infered as a string"

        // Multiple Assignments (tuple)
        val (first: Int, second: String) = (69,"Hello")
        val Pair = (first, second)

        // Inference in multiple assignments
        val (third, fourth) = (96,"Konnichiwa")
        val Riap = (third, fourth)

        println (myVal)
        println (myVar)
        println (inferType)
        println (Pair)
        println (Riap)
    }
}