import ikoin.Block

fun main(args: Array<String>) {

    val genesisBlock = Block(previousHash = "0", data = "I'm the first")
    val secondBlock = Block(genesisBlock.hash, "I'm the second")
    val thirdBlock = Block(secondBlock.hash, "I'm the third")

    println(genesisBlock)
    println(secondBlock)
    println(thirdBlock)
}
