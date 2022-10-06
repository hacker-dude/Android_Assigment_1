import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.math.ceil

fun main(args: Array<String>) {
    println("aslam")
    val a: Array<Int> = arrayOf(1, 2, 3)
    println(task1(a))
    val b = "abab"
    println(task2(b))
    val date = Date()
    println(date.task3("yyyy-mm-dd-HH:mm"))
}

fun task1(arr: Array<Int>): Float {
    var sum = 0
    for (i in 0..arr.size step 2) {
        sum += arr[i]
    }
    return (sum / ceil(arr.size.toDouble() / 2)).toFloat()
}

fun task2(text: String): Boolean {
    return text == text.reversed()
}

fun Date.task3(pattern: String): String {
    var formatter = DateTimeFormatter.ofPattern(pattern)
    return LocalDateTime.now().format(formatter).toString()
}
