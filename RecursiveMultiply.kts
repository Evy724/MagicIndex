/**
 * Weekly Coding Challenge 5/9/22 by evan687@revature.net
 * Magic Index
 */

fun multiply(x: Int, y: Int) {

    //If x or y is 0, the answer is 0
    if (y == 0 || x == 0) return 0

    //If y is positive, adds the x value one by one
    if (y > 0) return (x + multiply(x, y - 1))

    //If y is negative, inverses y and returns the inverse of multiply
    if (y < 0) return -multiply(x, -y)

    return -1
}

fun main(args: Array<String>) {

    val x = 2
    val y = 5

    println("\n" + multiply(x, y))

    //Output is 10
}