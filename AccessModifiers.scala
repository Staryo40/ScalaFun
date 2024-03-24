// Public members
class OuterPublic {
    class InnerPublic {
        def f() {println ("This is publlic")}
        class InnermostPublic {
            f() // Will run
        }
    }
    (new InnerPublic).(f()) // Will also run
}

// Private members
class OuterPrivate {
    class InnerPrivate {
        private def g() {println ("This is private")}
        class InnermostPrivate {
            g() // Will run
        }
    }
    (new InnerPrivate).g() // Will not run because g is not accessible
}

// Protected members
package p {
    class Protect {
        protected h() {println("This is protected")}
    }

    class SubProtect extends Protect {
        h() // Will run
    }

    class Other {
        h() // Will not run because h is no accessible
    }
}
