// Implicit class

object ImpClass {
    implicit class TimesInt (x: Int) {
        def times [A](f: =>A): Unit = {
            // local recursive function
            def loop(current: Int): Unit =
            if(current > 0){
                f
                loop(current - 1)
            }
            loop(x)
        }
    }
}