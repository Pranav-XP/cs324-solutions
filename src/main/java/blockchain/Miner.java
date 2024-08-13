package blockchain;



public class Miner {
    private double reward;

    public void mine(Block block, BlockChain blockChain) {
        while(notGoldenHash(block)){
            block.generateHash();
            block.incrementNonce();
        }

        System.out.println(block + " has just been mined");
        System.out.println("Hash is: " + block.getHash());

        blockChain.addBlock(block);

        reward+=Constant.MINER_REWARD;
    }

    public boolean notGoldenHash(Block block){
        String leadingZeros = new String(new char[Constant.DIFFICULTY]).replace('\0','0');
        return !block.getHash().substring(0, Constant.DIFFICULTY).equals(leadingZeros);
    }

    public double getReward() {
        return this.reward;
    }
}
