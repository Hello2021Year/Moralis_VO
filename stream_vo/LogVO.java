package club.edm.pojo.vo.stream_vo;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: LogVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/21 23:05
 **/

@Data
public class LogVO {

    private List<TriggerOutputVO> triggers;

    private String  logIndex;
    /**
     * The hash of the transaction
     */
    private String  transactionHash;

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

}
