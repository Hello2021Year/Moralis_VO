package club.edm.pojo.stream_vo;

import club.edm.pojo.stream_vo.history.WebhookTypesWebhook;
import club.edm.pojo.stream_vo.webhookTypes.ITinyPayload;
import club.edm.pojo.stream_vo.webhookTypes.IWebhookUnParsed;

/**
 * @ClassName: HistoryModel
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/21 23:28
 **/

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
