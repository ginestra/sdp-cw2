package cipher

fun decipher(str: String): String {
    // Generate every variation of the string
    val variations = Array(26,  { i -> encipher(str, i)})

    // Calculate a score for each possible variation
    val scores = Array(26, { i -> calculateFrequencyScore(variations.get(i)) })

    var maxIndex = 0;
    variations.forEachIndexed { index, str ->
        if (scores[index] > scores[maxIndex]) {
            maxIndex = index;
        }
    }

    // Return the string with the highest score
    return variations[maxIndex];
}

// Modern English Letter Frequencies
// Source: http://www.math.ucsd.edu/~crypto/Projects/MarshaMoreno/TimeComparisonFrequency.pdf
val letters = "eothasinrdluymwfgcbpkvjqxz".reversed()

// Calculate a score for a string based on the frequency of particular letters
fun calculateFrequencyScore(str: String): Int {
    var score: Int = 0;

    for (i in 0..(str.length - 1)) score += letters.indexOf(
        str[i].toLowerCase()
    )

    return score;
}