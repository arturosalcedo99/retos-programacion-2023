/*
 * Escribe un programa que reciba un texto y transforme lenguaje natural a
 * "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
 *  se caracteriza por sustituir caracteres alfanuméricos.
 * - Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/)
 *   con el alfabeto y los números en "leet".
 *   (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
 */

private val l33tDictionary = mapOf(
    "a" to "4",
    "b" to "|3",
    "c" to "[",
    "d" to ")",
    "e" to "3",
    "f" to "|=",
    "g" to "&",
    "h" to "#",
    "i" to "1",
    "j" to ",_|",
    "k" to ">|",
    "l" to "1",
    "m" to "/\\/\\",
    "n" to "^/",
    "o" to "0",
    "p" to "|*",
    "q" to "(_,)",
    "r" to "|2",
    "s" to "5",
    "t" to "7",
    "u" to "(_)",
    "v" to "\\/",
    "w" to "\\/\\/",
    "x" to "><",
    "y" to "j",
    "z" to "2",
    "1" to "|",
    "2" to "Z",
    "3" to "E",
    "4" to "A",
    "5" to "S",
    "6" to "b",
    "7" to "T",
    "8" to "B",
    "9" to "q",
    "0" to "()"
)

fun main() {
    val originalText = "Hola buenas tardes"
    println("$originalText --> " + originalText.toL33T())
}

private fun String.toL33T(): String {
    var l33tString = ""
    onEach {
        l33tString += l33tDictionary[it.toString().lowercase()] ?: " "
    }
    return l33tString
}