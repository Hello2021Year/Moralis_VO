package club.edm.pojo.vo.stream_vo;

import lombok.Data;

/**
 * @ClassName: StreamFilterVO
 * @Description: The filter object for the topic0 https://docs.moralis.io/docs/filter-streams
 * @author: SUN Pengliang
 * @date: 2022/12/21 23:57
 **/

@Data
public class StreamFilterVO {
    /**
     * 不确定返回类型,filter类型，https://docs.moralis.io/docs/filter-streams，就当string 处理吧
     */
    private String filters;

}
