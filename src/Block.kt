package ikoin

import java.time.Instant

data class Block(
        val previousHash: String,
        val data: String,
        val timestamp: Long = Instant.now().toEpochMilli(),
        val nonce: Long = 0
) {
 val hash = "$previousHash$data$timestamp$nonce".hash()
}