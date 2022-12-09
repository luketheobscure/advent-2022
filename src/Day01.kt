import java.io.File

fun main() {
    val testInput = File(ClassLoader.getSystemResource("day1.txt").file).readLines()

    check(testInput.size == 1)

}
