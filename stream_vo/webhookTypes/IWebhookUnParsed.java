package club.edm.pojo.stream_vo.webhookTypes;

import club.edm.pojo.stream_vo.*;

import java.util.List;

/**
 * @ClassName: IWebhookUnParsed
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/21 23:22
 **/

public class IWebhookUnParsed {

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
