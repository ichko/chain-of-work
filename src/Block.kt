package koin

import java.time.Instant

data class Block(
    val previousHash: String,
    val data: String,
    val timestamp: Long = Instant.now().toEpochMilli(),
    var nonce: Long = 0
) {
    fun hash() = "$previousHash$data$timestamp$nonce".hash()
}