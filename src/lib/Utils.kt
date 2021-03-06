package lib

import java.math.BigInteger
import java.security.MessageDigest

fun String.hash(algorithm: String = "SHA-256"): String {
    var messageDigest = MessageDigest.getInstance(algorithm)
    messageDigest.update(this.toByteArray())

    return String.format("%064x", BigInteger(1, messageDigest.digest()))
}
