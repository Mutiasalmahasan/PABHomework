package task5

import kotlin.math.round

data class Student(val name: String, val score: Int, val year: Int)

val students = listOf(
    Student("Ali", 85, 2023),
    Student("Budi", 62, 2022),
    Student("Citra", 91, 2023),
    Student("Dewi", 58, 2022),
    Student("Eka", 76, 2023)
)

fun main() {
    // 1. partition: lulus dan tidak lulus
    val (passing, failing) = students.partition { it.score >= 70 }
    println("Passing: ${passing.size} Failing: ${failing.size}")

    // 2. maxByOrNull / minByOrNull, ditangani aman dengan let
    students.maxByOrNull { it.score }
        ?.let { println("Top scorer : ${it.name} (${it.score})") }
    students.minByOrNull { it.score }
        ?.let { println("Low scorer : ${it.name} (${it.score})") }

    // 3. Rata-rata dengan fold (tanpa average()), dibulatkan 1 desimal
    val total = students.fold(0) { acc, student -> acc + student.score }
    val average = if (students.isEmpty()) 0.0 else total.toDouble() / students.size
    val rounded = round(average * 10) / 10
    println("Class average: $rounded")

    // 4. Ringkasan dengan buildString
    val report = buildString {
        appendLine("--- Grade Report ---")
        students.forEach {
            val status = if (it.score >= 70) "PASS" else "FAIL"
            appendLine("${it.name} ${it.score} $status")
        }
    }
    print(report)
}