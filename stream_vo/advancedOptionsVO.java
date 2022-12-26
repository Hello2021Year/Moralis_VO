package club.edm.pojo.vo.stream_vo;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: advancedOptionsVO
 * @Description: Advanced Options for each specific topic
 * @author: SUN Pengliang
 * @date: 2022/12/21 23:56
 **/

@Data
public class advancedOptionsVO {

    private String topic0;

    private List<StreamFilterVO> filter;

    private Boolean includeNativeTxs;

}
