package club.edm.pojo.vo.stream_vo;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: TriggerOutputVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/21 22:57
 **/
@Data
public class TriggerOutputVO {

    /**
     * 类型存疑，先Mark,example 按照List处理
     */
    private List<String> value;

    private String name;


}
