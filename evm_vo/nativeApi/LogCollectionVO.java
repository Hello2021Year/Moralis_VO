package club.edm.pojo.vo.evm_vo.nativeApi;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: LogCollectionVO
 * @Description:
 * @author: SUN Pengliang
 * @date: 2022/12/12 23:17
 **/

@Data
public class LogCollectionVO {

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

    /**
     * The cursor to get to the next page
     */
    private String  cursor;

    private List<LogEventByAddressVO> result;


}
