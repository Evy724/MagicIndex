/**
 * Weekly Coding Challenge 5/9/22 by evan687@revature.net
 * Magic Index
 */

//Magic Index using Binary Search


fun BinarySearch(array: Array<Int>, start: Int, end: Int) {

    while (start <= end) do {

        //Finds the midpoint
        val midpoint = (start + end) / 2

        //Checks for Magic Index
        if (midpoint == array[midpoint]) {
            return midpoint
        }
        //Searches the right (upper) half of the array
        else if (midpoint > array[midpoint]) {
            return search(array, midpoint + 1, end)
        }
        //Searches the left (lower) half of the array
        else {
            return search(array, midpoint - 1, end)
        }
    }
    return midpoint
}

fun main(args: Array<String>) {

    val array = [0, 1, 2, 3, 4, 5]
    println("The Magic Index is: " + BinarySearch(array, 0, array.size - 1))
}