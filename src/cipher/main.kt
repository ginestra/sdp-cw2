package cipher

fun main(args: Array<String>) {
    println(encipher("Hello World", 1));
    println(encipher("Zebra", 14));
    println(decipher(encipher("Hello World", 1)));
}

