package tests

import cipher.calculateFrequencyScore
import org.junit.Assert.*
import cipher.decipher
import cipher.encipher

class DecipherTest {
    @org.junit.Test
    fun execute() {
        assertEquals(
            decipher(encipher("The quick brown fox jumps over the lazy dog", 9)),
            "The quick brown fox jumps over the lazy dog"
        )
        assertEquals(
                decipher(encipher("The pen is on the table, the cat is under the chair", 9)),
                "The pen is on the table, the cat is under the chair"
        )
    }

    @org.junit.Test
    fun executeCalculateFrequencyScore() {
        assertEquals(calculateFrequencyScore("May the Force be with you"), 353)
        assertEquals(calculateFrequencyScore("Ifmmp Xpsme"), 122)
        assertEquals(calculateFrequencyScore("The quick brown fox jumps over the lazy dog"), 515)
        assertEquals(calculateFrequencyScore("Can't rain all the time"), 340)
        assertEquals(calculateFrequencyScore("I love the smell of napalm in the morning"), 587)
        assertEquals(calculateFrequencyScore("Eezzewsd jughj ghuiorits"), 338)
    }
}