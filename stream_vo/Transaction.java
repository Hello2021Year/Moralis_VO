package club.edm.pojo.stream_vo;

import java.util.List;

/**
 * @ClassName: Transaction
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/21 23:09
 **/

public class Transaction {

    private List<TriggerOutput> triggers;

    /**
     * The hash of the transaction
     */
    private String  hash;

    private String  gas;

    /**
     * The gas price
     */
    private String  gasPrice;

    /**
     * The nonce
     */
    private String  nonce;

    private String  input;

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

    private String type;

    private String v;

    private String r;

    private String s;

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

}
