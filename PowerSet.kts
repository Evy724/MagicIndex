/**
 * Weekly Coding Challenge 5/9/22 by evan687@revature.net
 * Power Set
 */

import java.io.*
import java.util.*
import kotlin.collections.ArrayList

fun findAllSubsets(
    subset: List<List<Int>>,
    numbers: ArrayList<Int>,
    output: ArrayList<Int>,
    index: Int) {


    if (index == numbers.size) {
        subset.add(output)
        return
    }

    //Creates new output
    var newOutput = ArrayList<>(output)

    //Does not include the value at the index
    findAllSubsets(subset, numbers, newOutput, index + 1)

    //Does include the value at the index
    output.add(numbers.get(index))
    findAllSubsets(subset, numbers, newOutput, index + 1)
}

fun main(args: Array<String>) {

    //Stores all subsets in a List of Lists of Ints
    var subset: List<List<Int>>

    //Stores inputs in an ArrayList (arbitrary numbers)
    var input: ArrayList<Int>
    input.add(1)
    input.add(2)
    input.add(3)

    var output: ArrayList<Int>

    //Calls our findAllSubsets function with params we just created
    findAllSubsets(subset = subset, input = input, output = output, index = 0)

    //Sorts subsets in ascending order
    Collections.sort(subset, (o1, o2) -> {
        var n = Math.min(o1.size, o2.size)
        var i = 0
        for (var i = 0; i < n; i++) {
            if (o1.get(i)) == o2.get(i)) {
                continue
            }
            else {
                return o1.get(i) - o2.get(i)
            }
        }
        return 1
    })

    //Prints the subset
    for (var i = 0; i < subset.size; i++) {
        for (var j = 0; j < subset.get(i).size; j++) {
            println(subset.get(i).get(j) + " ")
        }
        println()
    }
}