package ikoin

class BlockChain {
    private var blocks = mutableListOf<Block>()

    fun add(block: Block) {
        blocks.add(block)
    }
}