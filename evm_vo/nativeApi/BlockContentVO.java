package club.edm.pojo.evm_vo.nativeApi;

import lombok.Data;

/**
 * @ClassName: BlockContentVO
 * @Description: The contents of a block
 * @author: SUN Pengliang
 * @date: 2022/12/6 21:34
 **/

@Data
public class BlockContentVO {

     /**
      * The block timestam
      */
     private String  timestamp;

     /**
      * The block number
      */
     private String  number;

     /**
      * The block hash
      */
     private String  hash;

     /**
      * The block hash of the parent block
     */
     private String  parentHash;

     /**
      * The nonce
      */
     private String  nonce;

     private String  sha3Uncles;

     private String  logsBloom;

     private String  transactionsRoot;

     private String  stateRoot;

     private String  receiptsRoot;

     /**
      * The address of the miner
      */
     private String  miner;

     /**
      * The difficulty of the block
      */
     private String  difficulty;

     /**
      * The total difficulty
      */
     private String  totalDifficulty;

     /**
      * The block size
      */
     private String  size;

     private String  extraData;

     /**
      * The gas limit
     */
     private String  gasLimit;

     /**
      * The gas used
     */
     private String  gasUsed;

     /**
      * The number of transactions in the block
      */
     private String  transactionCount;

     /**
      * The transactions in the block
      */
     BlockTransactionVO transactions;

}
