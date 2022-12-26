package club.edm.pojo.vo.stream_vo.webhookTypes;

import lombok.Data;

/**
 * @ClassName: ITinyPayloadVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/21 23:26
 **/

@Data
public class ITinyPayloadVO {

    private String chainId;

    private Boolean confirmed;

    private String block;

    private Double record;

    private Double retries;

}
