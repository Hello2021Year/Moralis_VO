package club.edm.pojo.vo.stream_vo;

import club.edm.pojo.vo.stream_vo.webhookTypes.ITinyPayloadVO;
import club.edm.pojo.vo.stream_vo.webhookTypes.IWebhookUnParsedVO;
import lombok.Data;

/**
 * @ClassName: HistoryModelVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/21 23:28
 **/

@Data
public class HistoryModelVO {

    private UUID id;

    private String date;

    private IWebhookUnParsedVO payload;

    private ITinyPayloadVO tinyPayload;

    private String errorMessage;

    private String webhookUrl;

    private String streamId;

    private String tag;

}
