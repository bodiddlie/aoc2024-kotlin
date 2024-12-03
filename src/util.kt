import kotlin.io.path.Path
import kotlin.io.path.readText

fun getInput(day: Int, isSample: Boolean): List<String> {
    val filename = if (isSample) "sample" else "input"
    return Path("src/day$day-$filename.txt").readText().trim().lines()
}

fun Any?.println() = println(this)