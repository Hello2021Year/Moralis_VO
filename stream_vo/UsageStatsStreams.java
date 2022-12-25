package club.edm.pojo.stream_vo;

import lombok.Data;

/**
 * @ClassName: UsageStatsStreams
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/21 23:46
 **/
@Data
public class UsageStatsStreams {

    /*
        he total amount of webhooks delivered across all streams
     */
    private Double totalWebhooksDelivered;

    /*
        The total amount of failed webhooks across all streams
     */
    private Double  totalWebhooksFailed;

    /*
        The total amount of logs processed across all streams, this includes failed webhooks
     */
    private Double totalLogsProcessed;

    /*
        The total amount of txs processed across all streams, this includes failed webhooks
     */
    private Double totalTxsProcessed;

    /*
        The total amount of internal txs processed across all streams, this includes failed webhooks
     */
    private Double totalTxsInternalProcessed;

    /*
        The stream id
     */
    private String  streamId;

}
