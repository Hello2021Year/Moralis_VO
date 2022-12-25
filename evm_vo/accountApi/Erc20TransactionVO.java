package club.edm.pojo.evm_vo.accountApi;

import lombok.Data;

/**
 * @ClassName: Erc20TransactionVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/7 0:06
 **/

@Data
public class Erc20TransactionVO {

    /**
     * The transaction hash
     */
    private String  transactionHash;

    /**
     * The address of the token
     */
    private String  address;

    /**
     *  The block timestamp
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

    /**
     * The recipient
     */
    private String  toAddress;

    /**
     * The sender
     */
    private String  fromAddress;

    /**
     * The value that was transfered (in wei)
     */
    private String  value;

    /**
     * The transaction index of the transfer within the block
     */
    private Integer transactionIndex;

    /**
     * The log index of the transfer within the block
     */
    private Integer logIndex;

}
