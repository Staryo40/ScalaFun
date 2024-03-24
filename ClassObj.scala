// Class are blueprints for objects
// Use 'new' to make new objects

// Class 'point'
// Variables: x and y
// Method: move
// xc and yc are constructor arguments
class Point(xc: Int, yc: Int) {
   var x: Int = xc
   var y: Int = yc

   def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
      println ("Point x location : " + x);
      println ("Point y location : " + y);
   }
}

// Inheriting class Point to class Loc3D
// To inherit using scala, we use 'extends'
// To override methods, the use of 'override' keyword is needed
// method 'move()' in class Loc3D does not override method 'move()' in class Point because they have different definitions
// class Point is called 'superclass', while class Loc3D is called 'subclass' in this case of inheritance
class Loc3D (/* override */ val xc: Int, /* override */ val yc: Int, val zc: Int) extends Point(xc, yc) {
    var z: Int = zc

    def move(dx: Int, dy: Int, dz:Int) {
      x = x + dx
      y = y + dy
      z = z + dz
      println ("Point x location : " + x);
      println ("Point y location : " + y);
      println ("Point z location : " + z);
    }
}

// singleton object ClassObj
// new object pt
object ClassObj {
    def main (args: Array[String]) {
        val pt = new Point(10,40)
        pt.move(5,6) // using 'move' method in pt
        println ("")
        val loc = new Loc3D(50,12,4)
        loc.move(-40,-2,6)
}
}

// Scala's more OOP than Java since we can't have static members, but we have singleton objects (use object keyword)