package club.edm.pojo.vo.evm_vo.accountApi;

import lombok.Data;

/**
 * @ClassName: TransactionVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/6 23:26
 **/

@Data
public class TransactionVO {

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

    /**
     * The receipt gas used
     */
    private String  receiptGasUsed;

    /**
     * The receipt contract address
     */
    private String  receiptContractAddress;

    /**
     * The receipt root
     */
    private String  receiptRoot;

    /**
     * The receipt status
     */
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
     * The block hash
     */
    private String  blockHash;

}
