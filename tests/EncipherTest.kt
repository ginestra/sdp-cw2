package tests

import org.junit.Assert.*
import cipher.encipher

class EncipherTest {
    @org.junit.Test
    fun execute() {
        assertEquals(encipher("Hello World", 1), "Ifmmp Xpsme");
        assertEquals(encipher("Zebra", 14), "Nspfo")
    }
}