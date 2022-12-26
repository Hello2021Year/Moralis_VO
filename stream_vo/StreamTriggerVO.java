package club.edm.pojo.vo.stream_vo;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: StreamTriggerVO
 * @Description: Trigger
 * @author: SUN Pengliang
 * @date: 2022/12/22 0:00
 **/

@Data
public class StreamTriggerVO {

    private StreamTriggerTypeEnum type;

    private String contractAddress;

    /**
     * 不确定，看example按照List处理
     */
    private List<String> intput;

    private List<AbiItemVO> functionAbi;

    private String topci0;

    private String callFrom;

}
