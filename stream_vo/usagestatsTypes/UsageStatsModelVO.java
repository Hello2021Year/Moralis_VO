package club.edm.pojo.vo.stream_vo.usagestatsTypes;

import club.edm.pojo.vo.stream_vo.UsageStatsStreamsVO;
import lombok.Data;

import java.util.List;

/**
 * @ClassName: UsageStatsModelVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/21 23:49
 **/

@Data
public class UsageStatsModelVO {

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

    private List<UsageStatsStreamsVO> streams;

    /*
        The date since this stats are being counted
     */
    private String createAt;

    /*
         The date since this stats were last updated
     */
    private String updateAt;

}
