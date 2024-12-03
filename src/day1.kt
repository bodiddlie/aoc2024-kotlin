import kotlin.math.abs

fun main() {
    partOne()
    partTwo()
}

fun partOne() {
    val sample = false;
    val input = getInput(1, sample)
    var (left, right) = getColumns(input)
    left = left.sorted();
    right = right.sorted();

    var total = 0;
    for (i in left.indices) {
        val distance = abs(left[i] - right[i])
        total += distance
    }

    total.println()
}

fun getColumns(input: List<String>): Pair<List<Int>, List<Int>> {
    val left = ArrayList<Int>()
    val right = ArrayList<Int>()
    for (i in input) {
        val nums = i.split(Regex("\\s+"))
        left.add(nums[0].toInt())
        right.add(nums[1].toInt())
    }

    return Pair(left, right)
}

fun partTwo() {
    val sample = false;
    val input = getInput(1, sample)
    val (left, right) = getColumns(input)

    var total = 0;
    for (num in left) {
        val occurrences = right.count { it == num }
        total += occurrences * num
    }

    total.println()
}