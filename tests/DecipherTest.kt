package tests

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
    }
}