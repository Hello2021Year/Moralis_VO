package club.edm.pojo.stream_vo;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: advancedOptions
 * @Description: Advanced Options for each specific topic
 * @author: SUN Pengliang
 * @date: 2022/12/21 23:56
 **/

@Data
public class advancedOptions {

    private String topic0;

    private List<StreamFilter> filter;

    private Boolean includeNativeTxs;

}
