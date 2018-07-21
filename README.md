# Chain of work

This repository contains simple proof of work based linked list container implemented in Kotlin.
[This](https://github.com/VasilyFomin/kCoin) repo was used for reference.

## Example

Code
```kotlin
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
```

Output
```
0 mined block: Block(previousHash=fffca52bd2a7a3e8abf26cc0d66bc606752efc4a01f3251f7d8c942448f125e2, data=70765880-52fa-4892-abda-06676957de5a, timestamp=1532185236173, nonce=194751)
1 mined block: Block(previousHash=0000011b97a5012877e54dd1e8e34af98b2e6454adddd738961ba605d8030904, data=be4a59ae-d8b8-4eef-9f6b-ee1ff30d4f61, timestamp=1532185241389, nonce=785096)
2 mined block: Block(previousHash=000004b4596418cb0a404cb52542f38d7cc0a8b2f292cb787881650b82b91b8f, data=0c84066c-b1ea-4b3c-80f0-37b59d82b499, timestamp=1532185244585, nonce=1710886)
3 mined block: Block(previousHash=00000612446d936e9776601cd608c78d71e2dd97419f6116c74ee0d1d42db663, data=df2b38ac-5d1b-427c-8999-b18e1a556db7, timestamp=1532185251172, nonce=2120123)
4 mined block: Block(previousHash=00000874a3d354a28d0b6f7001c9c6f8f3f0272af9b6c6b47674161121c371b2, data=0e8d8fea-37cc-45de-b5a0-6220cb26bf27, timestamp=1532185259291, nonce=166170)
5 mined block: Block(previousHash=000004d2119bfa4ca7dbef076470fb6f4b496ad3a8e1ee4c0ba71eb2ba9a996e, data=f3a802d9-abf9-42e8-8cb0-f72ef8778e26, timestamp=1532185259920, nonce=458324)
6 mined block: Block(previousHash=00000d7de5c5a5e8c49113f66e7ec179233ed15ad0089b695b20850831c52cc7, data=618c5550-dbe5-4457-b7d4-b79f43bf05fe, timestamp=1532185261660, nonce=858170)
7 mined block: Block(previousHash=000006d469d24df23463a15f2e53161a128fe06b744a5e1410cd230f8c8f6c20, data=0ffcef0e-be41-4930-9915-9f9358b687fe, timestamp=1532185266278, nonce=515631)
8 mined block: Block(previousHash=000007cee00ccbf51329d39af15fc15e0d9f90648781995af1234f7db3945e1d, data=f644b9cf-74b9-4891-924e-d470d3c84a51, timestamp=1532185268777, nonce=1252245)
```
