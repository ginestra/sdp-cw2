package cipher

/**
 * Takes a string and rotates each character contained within the English
 * alphabet to the next character using the offset (must be between 0 and 25).
 *
 * @throws IllegalArgumentException if offset is not between 0 and 25
 */
fun encipher(str: String, offset: Int): String {
    // Enforce a range on the offset value
    if (offset !in 0..25) {
        throw IllegalArgumentException("offset must be between 0 and 25")
    }

    // Get the first Char in the String
    var char = str.get(0)
    // Builder for storing the resulting rotated characters
    val builder = StringBuilder()
    // Retrieve the Int value of the Char
    var charI = char.toInt()

    /*
        - Int range for capital characters in the English alphabet is [65-90].
        - Int range for capital characters in the English alphabet is [97-122].

        Source: https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html
     */
    val isCapital = (charI in 65..90)
    if (isCapital || (charI in 97..122)) {

        // Rotate the first character using the offset
        charI -= if (isCapital) 65 else 97
        charI = (charI + offset) % 26
        charI += if (isCapital) 65 else 97
        // Cast the Int value of the resulting rotated character to Char
        char = charI.toChar()
    }


    builder.append(char)

    if (str.length > 1) {
        /*
            Call this function again but drop the first character and append
            the return to our builder, this will recursively work on each
            character in turn and build up the final rotated string.
         */
        builder.append(encipher(str.substring(1), offset))
    }

    return builder.toString()
}