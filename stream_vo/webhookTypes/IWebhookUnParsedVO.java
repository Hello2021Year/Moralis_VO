package club.edm.pojo.vo.stream_vo.webhookTypes;

import club.edm.pojo.stream_vo.*;
import lombok.Data;

import java.util.List;

/**
 * @ClassName: IWebhookUnParsedVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/21 23:22
 **/

@Data
public class IWebhookUnParsedVO {

    private List<Block> block;

    private String chainId;

    private List<Log> logs;

    private List<Transaction> txs;

    private List<InternalTransaction> txsInternal;

    private List<AbiItem> abi;

    private Double retries;

    private Boolean confirmed;

    private String tag;

    private String streamId;

}
