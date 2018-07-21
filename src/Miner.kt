package koin

class Miner(private val blockChain: BlockChain) {
    fun mine(data: String): Block {
        val minedBlock = Block(blockChain.last().hash(), data)

        while (!minedBlock.hash().startsWith(blockChain.validPrefix))
            minedBlock.nonce++

        return minedBlock
    }
}