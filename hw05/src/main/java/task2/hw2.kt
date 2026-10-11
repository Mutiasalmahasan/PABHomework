package task2

// 1. Fungsi yang menerima fungsi lain sebagai parameter
fun applyTwice(n: Int, operation: (Int) -> Int): Int = operation(operation(n))

// 2. Cetak item yang memenuhi kondisi
fun printIf(items: List<String>, condition: (String) -> Boolean) {
    items.filter(condition).forEach { println(it) }
}

// 3. Fungsi generik: ubah setiap elemen jadi String
fun <T> transform(list: List<T>, mapper: (T) -> String): List<String> = list.map(mapper)

fun main() {
    val doubleIt: (Int) -> Int = { it * 2 }
    val startsWithVowel: (String) -> Boolean = {
        it.isNotEmpty() && it.first().lowercaseChar() in "aeiou"
    }

    println(applyTwice(3, doubleIt))

    val courses = listOf(
        "Algorithms",
        "Mobile Development",
        "Operating Systems",
        "Database",
        "Information Security"
    )
    printIf(courses, startsWithVowel)

    println(transform(listOf(2, 3, 4)) { (it * it).toString() })
}