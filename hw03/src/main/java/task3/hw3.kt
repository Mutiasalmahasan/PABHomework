package task3

fun main() {
    var studentName: String? = "ayu"

    println("Length: ${studentName?.length}")
    println("Name: ${studentName ?: "Unknown"}")
    studentName?.let { println("Hello, $it!") }
}