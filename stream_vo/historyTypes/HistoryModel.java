package club.edm.pojo.stream_vo.historyTypes;

import club.edm.pojo.stream_vo.UUID;
import club.edm.pojo.stream_vo.webhookTypes.ITinyPayload;
import club.edm.pojo.stream_vo.webhookTypes.IWebhookUnParsed;
import lombok.Data;

/**
 * @ClassName: HistoryModel
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/21 23:32
 **/

@Data
public class HistoryModel {

    private UUID id;

    private String date;

    private IWebhookUnParsed payload;

    private ITinyPayload tinyPayload;

    private String errorMessage;

    private String webhookUrl;

    private String streamId;

    private String tag;

}
