package tests

import org.junit.Assert.*
import cipher.encipher

class EncipherTest {
    @org.junit.Test
    fun execute() {
        assertEquals(encipher("Hello World", 1), "Ifmmp Xpsme")
        assertEquals(encipher("Zebra", 14), "Nspfo")
        assertEquals(encipher("The pen is on the table", 3), "Wkh shq lv rq wkh wdeoh")
        assertEquals(encipher("The quick fox jumps over the lazy dog", 7),
                "Aol xbpjr mve qbtwz vcly aol shgf kvn")
    }

    @org.junit.Test
    fun testOffsetException() {
        try {
            encipher("Hello World", 26)
            fail("Expected an IllegalArgumentException to be thrown")
        } catch (exception: IllegalArgumentException) {
            assertTrue(exception.message.equals("offset must be between 0 and 25"))
        }
    }
}