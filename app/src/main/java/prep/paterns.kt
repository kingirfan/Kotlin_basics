package prep

fun main() {
    // normalPattern()
    //  rightAngled()
    // rightAngledNumber()
    // invertedRightAngled()
    pyramid()
}

fun normalPattern() {
    for (i in 1..5) {
        for (j in 1..5) {
            print(" * ")
        }
        println()
    }
}

fun rightAngled() {
    for (i in 1..5) {
        for (j in 1..i) {
            print(" * ")
        }
        println()
    }
}

fun rightAngledNumber() {
    for (i in 1..5) {
        for (j in 1..i) {
            print(" $j ")
        }
        println()
    }
}

fun invertedRightAngled() {
    for (i in 1..5) {
        for (j in 5 downTo i) {
            print(" * ")
        }
        println()
    }
}

fun pyramid() {
    for (i in 1..5) {
        for (space in 1..(5 - i)) {
            print("  ")
        }

        for (stars in 1..(2 * i - 1)) {
            print("* ")
        }
        println()
    }
}