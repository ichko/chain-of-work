package koin

class BlockChain(difficulty: Int) {
    private val genesisBlock = Block("no-previous-hash", "no-data")
    private val blocks = mutableListOf(genesisBlock)
    val validPrefix = "0".repeat(difficulty)

    private fun isValid(block: Block) = block.hash().startsWith(validPrefix) &&
        block.previousHash == blocks.last().hash() &&
        (1..blocks.lastIndex).all { blocks[it].previousHash == blocks[it - 1].hash() }

    fun add(block: Block) = when {
        (!isValid(block)) -> false
        else -> {
            blocks.add(block)
            true
        }
    }

    fun last() = blocks.last()
}
