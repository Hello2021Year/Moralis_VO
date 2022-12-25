package club.edm.pojo.stream_vo;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: getNativeBalances
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/21 23:53
 **/

@Data
public class getNativeBalances {

    private List<String> selectors;

    private NativeBalancesType type;

}
