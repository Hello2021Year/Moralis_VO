package club.edm.pojo.vo2;

import java.util.List;

/**
 * @ClassName: StreamTrigger
 * @Description: Trigger
 * @author: SUN Pengliang
 * @date: 2022/12/22 0:00
 **/

public class StreamTrigger {

    private StreamTriggerType type;

    private String contractAddress;

    /**
     * 不确定
     */
    private List<String> intput;

    private List<AbiItem> functionAbi;

    private String topci0;

    private String callFrom;

}
