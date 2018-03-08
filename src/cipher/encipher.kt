package cipher

fun encipher(str: String, offset: Int): String {
    if (offset !in 0..25) {
        throw IllegalArgumentException("offset must be between 0 and 25")
    }

    var char = str.get(0)
    val builder = StringBuilder()
    var charI = char.toInt()

    val isCapital = (charI in 65..90)
    if (isCapital || (charI in 97..122)) {
        charI -= if (isCapital) 65 else 97
        charI = (charI + offset) % 26
        charI += if (isCapital) 65 else 97
        char = charI.toChar()
    }

    builder.append(char)

    if (str.length > 1) {
        builder.append(encipher(str.substring(1), offset))
    }

    return builder.toString()
}