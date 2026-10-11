package task1

fun main() {
    // 1. Lambda untuk menggandakan Int
    val doubleIt: (Int) -> Int = { it * 2 }
    println(doubleIt(7))

    // 2. Lambda cek huruf pertama vokal (abaikan huruf besar/kecil)
    val startsWithVowel: (String) -> Boolean = {
        it.isNotEmpty() && it.first().lowercaseChar() in "aeiou"
    }
    println(startsWithVowel("apple"))
    println(startsWithVowel("Banana"))
    println(startsWithVowel("orange"))

    // 3. Lambda dua parameter, ambil yang terbesar
    val larger: (Int, Int) -> Int = { a, b -> if (a > b) a else b }
    println(larger(12, 7))
}