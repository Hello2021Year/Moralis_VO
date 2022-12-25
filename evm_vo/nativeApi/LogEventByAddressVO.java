package club.edm.pojo.evm_vo.nativeApi;

/**
 * @ClassName: LogEventByAddressVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/6 22:40
 **/

public class LogEventByAddressVO {

    /**
     * The transaction hash
     */
    private String  transactionHash;

    /**
     * The address of the contract
     */
    private String  address;

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

    /**
     * The data of the log
     */
    private String  data;

    private String  topic0;

    private String  topic1;

    private String  topic2;

    private String  topic3;

    /**
     * The Transaction index of the log within the block
     */
    private Integer transactionIndex;

    /**
     * The log index of the log within the block
     */
    private Integer logIndex;


}
