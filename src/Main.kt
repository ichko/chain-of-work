import koin.BlockChain
import koin.Miner
import java.util.*

fun main(args: Array<String>) {
    val blockChain = BlockChain(difficulty = 5)
    val miner = Miner(blockChain)

    (0..8).forEach {
        val randomData = UUID.randomUUID().toString()
        val minedBlock = miner.mine(randomData)

        if (blockChain.add(minedBlock)) {
            println("$it mined block: $minedBlock")
        } else {
            print("Block was not mined!")
        }
    }
}
