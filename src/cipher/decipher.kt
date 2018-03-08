package cipher

fun decipher(str: String): String {
 return encipher(str, (Math.random() * 25).toInt());
}