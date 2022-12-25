package club.edm.pojo.evm_vo.nativeApi;

import java.util.List;

/**
 * @ClassName: ContractEventVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/6 23:02
 **/

public class ContractEventVO {

    /**
     * The total number of matches for this query
     */
    private Integer total;

    /**
     * The page of the current result
     */
    private Integer page;

    /**
     * The number of results per page
     */
    private Integer pageSize;

    private List<LogEventVO> logEventVO;
}
