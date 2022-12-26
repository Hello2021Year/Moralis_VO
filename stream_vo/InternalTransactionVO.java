package club.edm.pojo.vo.stream_vo;

import lombok.Data;

/**
 * @ClassName: InternalTransactionVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/21 23:12
 **/

@Data
public class InternalTransactionVO {

    private String from;

    private String to;

    private String value;

    private String transactionHash;

    private String gas;

}
