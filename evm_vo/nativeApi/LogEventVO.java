package club.edm.pojo.evm_vo.nativeApi;

import lombok.Data;

/**
 * @ClassName: LogEventVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/12 23:33
 **/

@Data
public class LogEventVO {

    /*
        The transaction hash
     */
    private String transaction_hash;

    /*
        The address of the contract
     */
    private String address;

    /*
        The block timestamp
     */
    private String blockTimestamp;
    /*
        The block number
     */
    private String blockNumber;

    /*
        The block hash
     */
    private String blockHash;

    /*
        The content of event
     */
    private EventContentVO eventContentVO;

}
