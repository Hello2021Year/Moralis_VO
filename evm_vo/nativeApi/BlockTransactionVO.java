package club.edm.pojo.evm_vo.nativeApi;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: BlockTransactionVO
 * @Description: The transactions in the block
 * @author: SUN Pengliang
 * @date: 2022/12/6 21:52
 **/

@Data
public class BlockTransactionVO {

    /**
     * The hash of the transaction
     */
    private String  hash;

    /**
     * The nonce
     */
    private String  nonce;

    private String  transactionIndex;

    /**
     * The from address
     */
     private String  fromAddress;

    /**
     * The to address
     */
    private String  toAddress;

    /**
     * The value sent
     */
    private String  value;

    private String  gas;

    /**
     * The gas price
      */
    private String  gasPrice;

    private String  input;

    private String  receiptCumulativeGasUsed;

    private String  receiptContractAddress;

    private String  receiptRoot;

    private String  receiptStatus;

    /**
     * The block timestamp
     */
    private String  blockTimestamp;

    /**
     * The block number
     */
    private String  blockNumber;

    /**
     * The hash of the block
     */
    private String  blockHash;

    /**
     * The logs of the transaction
     */
    private List<LogVO> logs;
}
