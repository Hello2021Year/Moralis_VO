package club.edm.pojo.evm_vo.nativeApi;

import lombok.Data;

/**
 * @ClassName: LogVO
 * @Description: The logs of the transaction
 * @author: SUN Pengliang
 * @date: 2022/12/6 22:14
 **/

@Data
public class LogVO {

    private String  logIndex;

    /**
     * The hash of the transaction
     */
    private String  transactionHash;

    private String  transactionIndex;

    /**
     * The address of the contract
     */
    private String  address;

    /**
     * The data of the log
     */
    private String  data;

    private String  topic0;

    private String  topic1;

    private String  topic2;

    private String  topic3;

    /**
     * The timestamp of the block
     */
    private String  blockTimestamp;

    /**
     * The block number
     */
    private String  blockNumber;

    /*
      The hash of the block
    */
    private String  blockHash;

}
