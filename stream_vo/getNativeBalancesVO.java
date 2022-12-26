package club.edm.pojo.vo.stream_vo;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: getNativeBalancesVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/21 23:53
 **/

@Data
public class getNativeBalancesVO {

    private List<String> selectors;

    private NativeBalancesTypeVO type;

}
